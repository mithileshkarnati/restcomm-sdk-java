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

import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.restcomm.connect.java.sdk.Restcomm;
import org.restcomm.connect.java.sdk.Utilities;
import org.restcomm.connect.java.sdk.http.*;
import org.restcomm.connect.java.sdk.Capabilities;

import org.restcomm.connect.java.sdk.Exceptions.*;

public class IncomingPhoneNumber extends Capabilities{
	
	static String BASE_URL = Restcomm.COMMON_URL+"Accounts/"+Restcomm.getAuthID()+"/IncomingPhoneNumbers";
	
	static public void SubAccountAccess(String sid)  
	{
		BASE_URL = Restcomm.COMMON_URL+"Accounts/"+sid+"/IncomingPhoneNumbers";
	}
	public static IncomingPhoneNumber getIncomingPhoneNumber(String sid) 
	{
		Restcomm.sendRequest((new Request(HttpMethod.GET,BASE_URL+".json/"+sid)));	
		return Utilities.IncomingPhoneNumberObject(Restcomm.getJSONResponse());
	}
	public IPNUpdater updateDetails()
	{
		return new IPNUpdater(BASE_URL+".json/"+this.getSid());
	}
	public void delete()
	{
		Restcomm.sendRequest((new Request(HttpMethod.DELETE,BASE_URL+".json/"+this.getSid())));	
	}
	public static IPNCreator newIncomingPhoneNumber()
	{
		return new IPNCreator(BASE_URL+".json");
	}
	public static IPNCreator newIncomingPhoneNumber(String Instance)
	{
		return new IPNCreator(BASE_URL+"/"+Instance+".json/");
	}

	 	private String ussd_fallback_url;

	    private String voice_application_sid;

	    private String phone_number;

	    private String refer_method;

	    private String voice_caller_id_lookup;

	    private String refer_application_sid;

	    private String date_created;

	    private String voice_url;

	    private String api_version;

	    private String ussd_method;

	    private String ussd_url;

	    private String ussd_application_sid;

	    private String sms_fallback_method;

	    private String sms_application_sid;

	    private String sid;

	    private String voice_fallback_method;

	    private String voice_fallback_url;

	    private String status_callback;

	    private String sms_method;

	    private String friendly_name;

	    private String uri;

	    private String ussd_fallback_method;

	    private String account_sid;

	    private String sms_url;

	    private String sms_fallback_url;

	    private String refer_url;

	    private String date_updated;

	    private String status_callback_method;

	    private Capabilities capabilities;

	    private String voice_method;

	    public String getUssd_fallback_url ()
	    {
	        return ussd_fallback_url;
	    }

	    private void setUssd_fallback_url (String ussd_fallback_url)
	    {
	        this.ussd_fallback_url = ussd_fallback_url;
	    }

	    public String getVoice_application_sid ()
	    {
	        return voice_application_sid;
	    }

	    private void setVoice_application_sid (String voice_application_sid)
	    {
	        this.voice_application_sid = voice_application_sid;
	    }

	    public String getPhone_number ()
	    {
	        return phone_number;
	    }

	    private void setPhone_number (String phone_number)
	    {
	        this.phone_number = phone_number;
	    }

	    public String getRefer_method ()
	    {
	        return refer_method;
	    }

	    private void setRefer_method (String refer_method)
	    {
	        this.refer_method = refer_method;
	    }

	    public String getVoice_caller_id_lookup ()
	    {
	        return voice_caller_id_lookup;
	    }

	    private void setVoice_caller_id_lookup (String voice_caller_id_lookup)
	    {
	        this.voice_caller_id_lookup = voice_caller_id_lookup;
	    }

	    public String getRefer_application_sid ()
	    {
	        return refer_application_sid;
	    }

	    private void setRefer_application_sid (String refer_application_sid)
	    {
	        this.refer_application_sid = refer_application_sid;
	    }

	    public String getDate_created ()
	    {
	        return date_created;
	    }

	    private void setDate_created (String date_created)
	    {
	        this.date_created = date_created;
	    }

	    public String getVoice_url ()
	    {
	        return voice_url;
	    }

	    private void setVoice_url (String voice_url)
	    {
	        this.voice_url = voice_url;
	    }

	    public String getApi_version ()
	    {
	        return api_version;
	    }

	    private void setApi_version (String api_version)
	    {
	        this.api_version = api_version;
	    }

	    public String getUssd_method ()
	    {
	        return ussd_method;
	    }

	    private void setUssd_method (String ussd_method)
	    {
	        this.ussd_method = ussd_method;
	    }

	    public String getUssd_url ()
	    {
	        return ussd_url;
	    }

	    private void setUssd_url (String ussd_url)
	    {
	        this.ussd_url = ussd_url;
	    }

	    public String getUssd_application_sid ()
	    {
	        return ussd_application_sid;
	    }

	    private void setUssd_application_sid (String ussd_application_sid)
	    {
	        this.ussd_application_sid = ussd_application_sid;
	    }

	    public String getSms_fallback_method ()
	    {
	        return sms_fallback_method;
	    }

	    private void setSms_fallback_method (String sms_fallback_method)
	    {
	        this.sms_fallback_method = sms_fallback_method;
	    }

	    public String getSms_application_sid ()
	    {
	        return sms_application_sid;
	    }

	    private void setSms_application_sid (String sms_application_sid)
	    {
	        this.sms_application_sid = sms_application_sid;
	    }

	    public String getSid ()
	    {
	        return sid;
	    }

	    private void setSid (String sid)
	    {
	        this.sid = sid;
	    }

	    public String getVoice_fallback_method ()
	    {
	        return voice_fallback_method;
	    }

	    private void setVoice_fallback_method (String voice_fallback_method)
	    {
	        this.voice_fallback_method = voice_fallback_method;
	    }

	    public String getVoice_fallback_url ()
	    {
	        return voice_fallback_url;
	    }

	    private void setVoice_fallback_url (String voice_fallback_url)
	    {
	        this.voice_fallback_url = voice_fallback_url;
	    }

	    public String getStatus_callback ()
	    {
	        return status_callback;
	    }

	    private void setStatus_callback (String status_callback)
	    {
	        this.status_callback = status_callback;
	    }

	    public String getSms_method ()
	    {
	        return sms_method;
	    }

	    private void setSms_method (String sms_method)
	    {
	        this.sms_method = sms_method;
	    }

	    public String getFriendly_name ()
	    {
	        return friendly_name;
	    }

	    private void setFriendly_name (String friendly_name)
	    {
	        this.friendly_name = friendly_name;
	    }

	    public String getUri ()
	    {
	        return uri;
	    }

	    private void setUri (String uri)
	    {
	        this.uri = uri;
	    }

	    public String getUssd_fallback_method ()
	    {
	        return ussd_fallback_method;
	    }

	    private void setUssd_fallback_method (String ussd_fallback_method)
	    {
	        this.ussd_fallback_method = ussd_fallback_method;
	    }

	    public String getAccount_sid ()
	    {
	        return account_sid;
	    }

	    private void setAccount_sid (String account_sid)
	    {
	        this.account_sid = account_sid;
	    }

	    public String getSms_url ()
	    {
	        return sms_url;
	    }

	    private void setSms_url (String sms_url)
	    {
	        this.sms_url = sms_url;
	    }

	    public String getSms_fallback_url ()
	    {
	        return sms_fallback_url;
	    }

	    private void setSms_fallback_url (String sms_fallback_url)
	    {
	        this.sms_fallback_url = sms_fallback_url;
	    }

	    public String getRefer_url ()
	    {
	        return refer_url;
	    }

	    private void setRefer_url (String refer_url)
	    {
	        this.refer_url = refer_url;
	    }

	    public String getDate_updated ()
	    {
	        return date_updated;
	    }

	    private void setDate_updated (String date_updated)
	    {
	        this.date_updated = date_updated;
	    }

	    public String getStatus_callback_method ()
	    {
	        return status_callback_method;
	    }

	    private void setStatus_callback_method (String status_callback_method)
	    {
	        this.status_callback_method = status_callback_method;
	    }

	    public Capabilities getCapabilities ()
	    {
	        return capabilities;
	    }

	    private void setCapabilities (Capabilities capabilities)
	    {
	        this.capabilities = capabilities;
	    }

	    public String getVoice_method ()
	    {
	        return voice_method;
	    }

	    private void setVoice_method (String voice_method)
	    {
	        this.voice_method = voice_method;
	    }
}
