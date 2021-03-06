/* 
 * Copyright 2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dell.sm.wsman.utility;

/**
 * Enumeration class for WSMan Methods
 * @author GARGI_PRIYADARSHINI
 */
public enum WSManMethodEnum {

    DRIVER_PACK_INFO("GetDriverPackInfo"),
    HOST_MAC_INFO("GetHostMACInfo"),
    BOOT_TO_PXE("BootToPXE"),
    BOOT_REMOTE_ISO("BootToNetworkISO"),
    UNPACK_AND_ATTACH("UnpackAndAttach"),
    DETACH_ISO("DetachISOImage"),
    DETACH_DRIVERS("DetachDrivers"),
    DETACH_ISO_VFLASH("DetachISOFromVFlash"),
    DELETE_ISO_VFLASH("DeleteISOFromVFlash"),
    DOWNLOAD_ISO_VFLASH("DownloadISOToVFlash"),
    BOOT_ISO_VFLASH("BootToISOFromVFlash"),
    CREATE_REBOOT_JOB("CreateRebootJob"),
    DELETE_JOB_QUEUE("DeleteJobQueue"),
    SETUP_JOB_QUEUE("SetupJobQueue"),
    INSTALL_FROM_URI("InstallFromURI"),
    CHANGE_BOOT_ORDER("ChangeBootOrderByInstanceID"),
    CHANGE_BOOT_STATUS("ChangeBootSourceState"),
    CREATE_TARGET_CONFIG_JOB("CreateTargetedConfigJob"),
    CREATE_LC_SERVICE_CONFIG_JOB("CreateConfigJob"),
    SET_ATTRIBUTE("SetAttribute"),
    SET_ATTRIBUTES("SetAttributes"),
    SEND_CMD("SendCmd"),
    REQUESTED_STATE_CHANGE("RequestStateChange"),
    REINITIATE_DHS("ReInitiateDHS"),
    GET_RS_STATUS("GetRSStatus"),
    GET_NETWORK_ISO_IMAGE_CONNECTION_INFO("GetNetworkISOImageConnectionInfo"),
    CONNECT_TO_NEWORK_ISO_IMAGE("ConnectNetworkISOImage"),
    DISCONNECT_NETWORK_ISO_IMAGE("DisconnectNetworkISOImage"),
    EXPORT_LICENSE("ExportLicense"),
    CLEAR_SEL_LOG("ClearLog"),
    BLINK_LED("IdentifyChassis"),
    SKIP_ISO_IMAGE_BOOT("SkipISOImageBoot"),
    CONFIGURABLE_BOOT_TO_NETWORK_ISO("ConfigurableBootToNetworkISO"),
    UNPACK_AND_SHARE("UnpackAndShare"),
    SHOW_LICENSE_BITS("ShowLicenseBits"),
    MANAGE_TIME("ManageTime");
    ;
	String enumValue;

    WSManMethodEnum(String value) {
        enumValue = value;
    }

    @Override
    public String toString() {
        return enumValue;
    }

}
