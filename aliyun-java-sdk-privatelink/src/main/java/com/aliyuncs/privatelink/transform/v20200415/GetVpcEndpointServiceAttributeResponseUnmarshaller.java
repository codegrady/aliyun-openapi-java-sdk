/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.GetVpcEndpointServiceAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcEndpointServiceAttributeResponseUnmarshaller {

	public static GetVpcEndpointServiceAttributeResponse unmarshall(GetVpcEndpointServiceAttributeResponse getVpcEndpointServiceAttributeResponse, UnmarshallerContext _ctx) {
		
		getVpcEndpointServiceAttributeResponse.setRequestId(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.RequestId"));
		getVpcEndpointServiceAttributeResponse.setServiceId(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.ServiceId"));
		getVpcEndpointServiceAttributeResponse.setServiceName(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.ServiceName"));
		getVpcEndpointServiceAttributeResponse.setServiceDomain(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.ServiceDomain"));
		getVpcEndpointServiceAttributeResponse.setServiceDescription(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.ServiceDescription"));
		getVpcEndpointServiceAttributeResponse.setServiceBusinessStatus(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.ServiceBusinessStatus"));
		getVpcEndpointServiceAttributeResponse.setServiceStatus(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.ServiceStatus"));
		getVpcEndpointServiceAttributeResponse.setAutoAcceptEnabled(_ctx.booleanValue("GetVpcEndpointServiceAttributeResponse.AutoAcceptEnabled"));
		getVpcEndpointServiceAttributeResponse.setCreateTime(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.CreateTime"));
		getVpcEndpointServiceAttributeResponse.setMaxBandwidth(_ctx.integerValue("GetVpcEndpointServiceAttributeResponse.MaxBandwidth"));
		getVpcEndpointServiceAttributeResponse.setMinBandwidth(_ctx.integerValue("GetVpcEndpointServiceAttributeResponse.MinBandwidth"));
		getVpcEndpointServiceAttributeResponse.setConnectBandwidth(_ctx.integerValue("GetVpcEndpointServiceAttributeResponse.ConnectBandwidth"));
		getVpcEndpointServiceAttributeResponse.setRegionId(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.RegionId"));

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcEndpointServiceAttributeResponse.Zones.Length"); i++) {
			zones.add(_ctx.stringValue("GetVpcEndpointServiceAttributeResponse.Zones["+ i +"]"));
		}
		getVpcEndpointServiceAttributeResponse.setZones(zones);
	 
	 	return getVpcEndpointServiceAttributeResponse;
	}
}