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

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.QueryDevicesByAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicesByAccountResponseUnmarshaller {

	public static QueryDevicesByAccountResponse unmarshall(QueryDevicesByAccountResponse queryDevicesByAccountResponse, UnmarshallerContext _ctx) {
		
		queryDevicesByAccountResponse.setRequestId(_ctx.stringValue("QueryDevicesByAccountResponse.RequestId"));

		List<String> deviceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicesByAccountResponse.DeviceIds.Length"); i++) {
			deviceIds.add(_ctx.stringValue("QueryDevicesByAccountResponse.DeviceIds["+ i +"]"));
		}
		queryDevicesByAccountResponse.setDeviceIds(deviceIds);
	 
	 	return queryDevicesByAccountResponse;
	}
}