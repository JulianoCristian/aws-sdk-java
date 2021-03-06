/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UdpOutputSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UdpOutputSettingsMarshaller {

    private static final MarshallingInfo<Integer> BUFFERMSEC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bufferMsec").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerSettings").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<StructuredPojo> FECOUTPUTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fecOutputSettings").build();

    private static final UdpOutputSettingsMarshaller instance = new UdpOutputSettingsMarshaller();

    public static UdpOutputSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UdpOutputSettings udpOutputSettings, ProtocolMarshaller protocolMarshaller) {

        if (udpOutputSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(udpOutputSettings.getBufferMsec(), BUFFERMSEC_BINDING);
            protocolMarshaller.marshall(udpOutputSettings.getContainerSettings(), CONTAINERSETTINGS_BINDING);
            protocolMarshaller.marshall(udpOutputSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(udpOutputSettings.getFecOutputSettings(), FECOUTPUTSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
