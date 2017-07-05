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

import org.restcomm.connect.java.sdk.IncomingPhoneNumbers.IPNUpdater;
import org.restcomm.connect.java.sdk.http.*;

public class IPNUpdater {
	
	static String BASE_URL;
	public Request request;
	public IPNUpdater(String BASE_URL) {
		request = new Request(HttpMethod.PUT,BASE_URL);
	}
	public IPNUpdater newFriendlyName(String value)
	{
		request.addPostParameters("FriendlyName", value);
		return this;
	}
	public IPNUpdater newApiVersion(String value)
	{
		request.addPostParameters("ApiVersion", value);
		return this;
	}
	public IPNUpdater newStatusCallBack(String value)
	{
		request.addPostParameters("StatusCallBack", value);
		return this;
	}
	public IPNUpdater newStatusCallBackMethod(String value)
	{
		request.addPostParameters("StatusCallBackMethod", value);
		return this;
	}
	public IPNUpdater newVoiceCallerIdLookUp(String rcmlurl)
	{
		request.addPostParameters("VoiceCallerIdLookUp", rcmlurl);
		return this;
	}
	public IPNUpdater newVoiceApplicationSid(String kind)
	{
		request.addPostParameters("VoiceApplicationSid",kind);
		return this;
	}
	public IPNUpdater newSMSUrl(String kind)
	{
		request.addPostParameters("SmsUrl",kind);
		return this;
	}
	public IPNUpdater newSMSMethod(String kind)
	{
		request.addPostParameters("SmsMethod",kind);
		return this;
	}
	public IPNUpdater newSMSFallbackUrl(String kind)
	{
		request.addPostParameters("SmsFallbackUrl",kind);
		return this;
	}
	public IPNUpdater newSmsFallbackMethod(String kind)
	{
		request.addPostParameters("SmsFallbackMethod",kind);
		return this;
	}
	public IPNUpdater newSmsApplicationSid(String kind)
	{
		request.addPostParameters("SmsApplicationSid",kind);
		return this;
	}
	public IPNUpdater newAccountSid(String a)
	{
		request.addPostParameters("AccountSid", a);
		return this;
	}
	public IPNUpdater newVoiceUrl(String a)
	{
		request.addPostParameters("VoiceUrl", a);
		return this;
	}
	public IPNUpdater newVoiceMethod(String a)
	{
		request.addPostParameters("VoiceMethod", a);
		return this;
	}
	public IPNUpdater newVoiceFallbackUrl(String a)
	{
		request.addPostParameters("VoiceFallbackUrl", a);
		return this;
	}
	public IPNUpdater newVoiceFallbackMethod(String a)
	{
		request.addPostParameters("VoiceFallbackMethod", a);
		return this;
	}
	public IncomingPhoneNumber update()
	{
		Restcomm.sendRequest(request);	
		return Utilities.IncomingPhoneNumberObject(Restcomm.getJSONResponse());
	}

}
