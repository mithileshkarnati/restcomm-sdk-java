/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.restcomm.connect.java.sdk.IncomingPhoneNumbers;
import org.restcomm.connect.java.sdk.BasicTest;

import static org.junit.Assert.*;
import org.apache.http.ProtocolException;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import org.restcomm.connect.java.sdk.IncomingPhoneNumbers.*;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.restcomm.connect.java.sdk.Exceptions.*;
import org.restcomm.connect.java.sdk.Restcomm;

import org.junit.rules.ExpectedException;
import java.io.IOException;

public class IncomingPhoneNumberTest extends BasicTest{
	
	private String path = "src/test/java/org/restcomm/connect/java/sdk/IncomingPhoneNumbers/TextFiles/";
	private String IncomingPhoneNumberSid = "PN84e3c030bba048669f524aad066bae43";
	@Rule 
    public WireMockRule wireMockRule = new WireMockRule(8080);
	
	@Test
	public void testGetIncomingPhoneNumber() throws Exception{ 
		WireMock.stubFor(WireMock.get(WireMock.urlPathMatching("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json/"+IncomingPhoneNumberSid))
				  .withBasicAuth(Restcomm.getAuthID(),Restcomm.getPassword())
				  .willReturn(WireMock.aResponse()
				  .withStatus(200)
				  .withHeader("Content-Type", "Application/json")
				  .withBody(readFile(path+"getIncomingPhoneNumber.txt"))));
		
		IncomingPhoneNumber a = IncomingPhoneNumber.getIncomingPhoneNumber(IncomingPhoneNumberSid);
		
		WireMock.verify(WireMock.getRequestedFor(WireMock.urlEqualTo("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json/"+IncomingPhoneNumberSid)));
		assertEquals(200, Restcomm.getStatusCode());
		assertEquals(IncomingPhoneNumberSid,a.getSid());
	}

	@Test
	public void testIncomingPhoneNumberList() throws Exception{
		WireMock.stubFor(WireMock.get(WireMock.urlPathMatching("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers/Local.json"))
				  .withBasicAuth(Restcomm.getAuthID(),Restcomm.getPassword())
				  .withQueryParam("PageSize", WireMock.equalTo("1"))
				  .willReturn(WireMock.aResponse()
				  .withStatus(200)
				  .withHeader("Content-Type", "Application/json")
				  .withBody(readFile(path+"getIncomingPhoneNumberList.txt"))));
		
		IncomingPhoneNumberList a = IncomingPhoneNumberList.getFilteredList("Local").PageSize("1").Filter();
		
		IncomingPhoneNumber b = a.get(0);
		
		WireMock.verify(WireMock.getRequestedFor(WireMock.urlEqualTo("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers/Local.json?PageSize=1")));
		assertEquals(200,Restcomm.getStatusCode());
		assertNotNull(a);
		assertEquals("PN4647cd0aca27489a9afad105fb31fd58",b.getSid());

	}
	@Test
	public void testIncomingPhoneNumberCreate() throws Exception{
		WireMock.stubFor(WireMock.post(WireMock.urlPathMatching("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json"))
				  .withBasicAuth(Restcomm.getAuthID(),Restcomm.getPassword())
				  .withRequestBody(WireMock.containing("PhoneNumber=%2B918426955435"))
				  .willReturn(WireMock.aResponse()
				  .withStatus(200)
				  .withHeader("Content-Type", "Application/json")
				  .withBody(readFile(path+"getIncomingPhoneNumber.txt"))));
		
		IncomingPhoneNumber a = IncomingPhoneNumber.newIncomingPhoneNumber().PhoneNumber("+918426955435").create();
		
		WireMock.verify(WireMock.postRequestedFor(WireMock.urlEqualTo("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json")));
		assertEquals(200,Restcomm.getStatusCode());
		assertNotNull(a);
		assertEquals("PN84e3c030bba048669f524aad066bae43",a.getSid());

	}@Test
	public void testUpdateIncomingPhoneNumber()throws Exception{
		
		WireMock.stubFor(WireMock.get(WireMock.urlPathMatching("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json/"+IncomingPhoneNumberSid))
				  .withBasicAuth(Restcomm.getAuthID(),Restcomm.getPassword())
				  .willReturn(WireMock.aResponse()
				  .withStatus(200)
				  .withHeader("Content-Type", "Application/json")
				  .withBody(readFile(path+"getIncomingPhoneNumber.txt"))));
		
		IncomingPhoneNumber a = IncomingPhoneNumber.getIncomingPhoneNumber(IncomingPhoneNumberSid);
		assertEquals("paaras",a.getFriendly_name());
		
		WireMock.stubFor(WireMock.put(WireMock.urlPathMatching("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json/"+IncomingPhoneNumberSid))
				  .withBasicAuth(Restcomm.getAuthID(),Restcomm.getPassword())
				  .withRequestBody(WireMock.containing("FriendlyName=Martin"))
				  .willReturn(WireMock.aResponse()
				  .withStatus(200)
				  .withHeader("Content-Type", "Application/json")
				  .withBody(readFile(path+"getUIncomingPhoneNumber.txt"))));
		
		 a = a.updateDetails().newFriendlyName("Martin").update();
		
		
		WireMock.verify(WireMock.putRequestedFor(WireMock.urlEqualTo("/Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers.json/"+IncomingPhoneNumberSid)));
		assertEquals(200,Restcomm.getStatusCode());
		assertEquals("Martin",a.getFriendly_name());
		
	}	
	
}