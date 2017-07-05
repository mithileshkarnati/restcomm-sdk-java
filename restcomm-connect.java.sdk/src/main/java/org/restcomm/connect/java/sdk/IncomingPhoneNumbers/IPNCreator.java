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
import org.apache.http.ProtocolException;
import org.restcomm.connect.java.sdk.Restcomm;
import org.restcomm.connect.java.sdk.Utilities;

import org.restcomm.connect.java.sdk.IncomingPhoneNumbers.IPNCreator;
import org.restcomm.connect.java.sdk.http.*;

public class IPNCreator {
	
	static String BASE_URL;
	public Request request;
	public IPNCreator(String BASE_URL) {
		request = new Request(HttpMethod.POST,BASE_URL);
	}
	public IPNCreator PhoneNumber(String value)
	{
		request.addPostParameters("PhoneNumber", value);
		return this;
	}
	public IPNCreator AreaCode(String rcmlurl)
	{
		request.addPostParameters("AreaCode", rcmlurl);
		return this;
	}
	public IPNCreator FriendlyName(String kind)
	{
		request.addPostParameters("FriendlyName", kind);
		return this;
	}
	public IPNCreator VoiceUrl(String a)
	{
		request.addPostParameters("HasVoiceCallerIdLookup", a);
		return this;
	}
	public IPNCreator VoiceMethod(String a)
	{
		request.addPostParameters("VoiceMethod", a);
		return this;
	}
	public IPNCreator VoiceFallbackUrl(String a)
	{
		request.addPostParameters("VoiceFallbackUrl", a);
		return this;
	}
	public IPNCreator VoiceFallbackMethod(String a)
	{
		request.addPostParameters("VoiceFallbackMethod", a);
		return this;
	}
	public IPNCreator StatusCallback(String value)
	{
		request.addPostParameters("StatusCallback", value);
		return this;
	}
	public IPNCreator StatusCallbackMethod(String value)
	{
		request.addPostParameters("StatusCallbackMethod", value);
		return this;
	}
	public IPNCreator VoiceApplicationSid(String a)
	{
		request.addPostParameters("VoiceApplicationSid", a);
		return this;
	}
	public IPNCreator SmsMethod(String a)
	{
		request.addPostParameters("SmsMethod", a);
		return this;
	}
	public IPNCreator SmsFallbackUrl(String a)
	{
		request.addPostParameters("SmsFallbackUrl", a);
		return this;
	}
	public IPNCreator SmsFallbackMethod(String a)
	{
		request.addPostParameters("SmsFallbackMethod", a);
		return this;
	}
	public IPNCreator VoiceCallerIdLookup(String a)
	{
		request.addPostParameters("VoiceCallerIdLookup", a);
		return this;
	}
	public IPNCreator SmsApplicationSid(String a)
	{
		request.addPostParameters("SmsApplicationSid", a);
		return this;
	}
	public IPNCreator SmsUrl(String a)
	{
		request.addPostParameters("SmsUrl", a);
		return this;
	}
	public IPNCreator ApiVersion(String a)
	{
		request.addPostParameters("ApiVersion", a);
		return this;
	}	
	public IncomingPhoneNumber create()
	{
		
		Restcomm.sendRequest(request);	
		return Utilities.IncomingPhoneNumberObject(Restcomm.getJSONResponse());
	}

}
