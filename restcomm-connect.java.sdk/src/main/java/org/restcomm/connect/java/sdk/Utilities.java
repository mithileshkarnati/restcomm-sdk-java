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
package org.restcomm.connect.java.sdk;

import com.google.gson.Gson;

import org.restcomm.connect.java.sdk.Calls.Call;

import org.restcomm.connect.java.sdk.Applications.Application;

import org.restcomm.connect.java.sdk.Accounts.Account;
import org.restcomm.connect.java.sdk.Clients.Client;
import org.restcomm.connect.java.sdk.Recordings.Recording;
import org.restcomm.connect.java.sdk.SMS.SMS;
import org.restcomm.connect.java.sdk.Transcriptions.Transcription;
import org.restcomm.connect.java.sdk.Emails.Email;
import org.restcomm.connect.java.sdk.Notifications.Notification;
import org.restcomm.connect.java.sdk.Conferences.Conference;
import org.restcomm.connect.java.sdk.Conferences.Participant;
//import org.restcomm.connect.java.sdk.OutboundProxy.OutboundProxy;
import org.restcomm.connect.java.sdk.AvailablePhoneNumbers.PhoneNumber;
import org.restcomm.connect.java.sdk.IncomingPhoneNumbers.IncomingPhoneNumber;
public class Utilities {

	public static Account AccountObject(String jsonResponse) {
		
				Gson gson = new Gson();
				return gson.fromJson(jsonResponse,Account.class);
	}
	public static Application ApplicationObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Application.class);
	}
	public static Call CallObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Call.class);
	}
	public static Client ClientObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Client.class);
	}
	public static Notification NotificationObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Notification.class);
	}
	public static SMS SMSObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,SMS.class);
	}
	public static Email EmailObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Email.class);
	}
	public static Recording RecordingObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Recording.class);
	}
	public static Transcription TranscriptionObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Transcription.class);
	}
	public static Conference ConferenceObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Conference.class);
	}
	public static Participant ParticipantObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,Participant.class);
	}
	/*public static OutboundProxy OutboundProxyObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,OutboundProxy.class);
	}*/
	public static PhoneNumber PhoneNumberObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,PhoneNumber.class);
	}
	public static IncomingPhoneNumber IncomingPhoneNumberObject(String jsonResponse) {
		
		Gson gson = new Gson();
		return gson.fromJson(jsonResponse,IncomingPhoneNumber.class);
	}
}
