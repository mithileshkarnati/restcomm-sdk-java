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
public class Capabilities
{
    private String mms_capable;

    private String fax_capable;

    private String sms_capable;

    private String voice_capable;

    public String getMms_capable ()
    {
        return mms_capable;
    }

    public void setMms_capable (String mms_capable)
    {
        this.mms_capable = mms_capable;
    }

    public String getFax_capable ()
    {
        return fax_capable;
    }

    public void setFax_capable (String fax_capable)
    {
        this.fax_capable = fax_capable;
    }

    public String getSms_capable ()
    {
        return sms_capable;
    }

    public void setSms_capable (String sms_capable)
    {
        this.sms_capable = sms_capable;
    }

    public String getVoice_capable ()
    {
        return voice_capable;
    }

    public void setVoice_capable (String voice_capable)
    {
        this.voice_capable = voice_capable;
    }
}