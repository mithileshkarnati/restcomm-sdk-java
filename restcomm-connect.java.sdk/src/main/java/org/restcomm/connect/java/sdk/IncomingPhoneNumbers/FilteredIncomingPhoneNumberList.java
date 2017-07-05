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

import java.io.IOException;
import org.restcomm.connect.java.sdk.http.*;

import org.restcomm.connect.java.sdk.Restcomm;
import org.apache.http.ProtocolException;
import org.restcomm.connect.java.sdk.Exceptions.*;
import org.apache.http.ParseException;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import org.restcomm.connect.java.sdk.ListUtil;

import org.apache.http.ParseException;
import com.google.gson.annotations.SerializedName;
import java.net.MalformedURLException;

public class FilteredIncomingPhoneNumberList extends IncomingPhoneNumberList {
	
	private static String BASE_URL;
	private static Request request;
	
	public FilteredIncomingPhoneNumberList(final String BASE_URL)
	{
		this.BASE_URL = BASE_URL;
		request = new Request(HttpMethod.GET,BASE_URL);
	}

	public FilteredIncomingPhoneNumberList Page(String value)
	{
		request.addGetParameters("Page", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList NumPages(String value) 
	{
		request.addGetParameters("NumPages", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList PageSize(String value) 
	{
		request.addGetParameters("PageSize", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList Total(String value) 
	{
		request.addGetParameters("Total", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList Start(String value) 
	{
		request.addGetParameters("Start", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList End(String value) 
	{
		request.addGetParameters("End", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList PhoneNumber(String value)
	{
		request.addGetParameters("PhoneNumber", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList FriendlyName(String value) 
	{
		request.addGetParameters("FriendlyName", value);
		return this;
	}
	public FilteredIncomingPhoneNumberList Beta(String value) 
	{
		request.addGetParameters("Beta", value);
		return this;
	}
	public IncomingPhoneNumberList Filter() 
	{
		Restcomm.sendRequest(request);
		Gson gson = new Gson();
		return gson.fromJson(Restcomm.getJSONResponse(),IncomingPhoneNumberList.class);
	}

    
}
