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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.BindEslDeviceShelfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindEslDeviceShelfResponseUnmarshaller {

	public static BindEslDeviceShelfResponse unmarshall(BindEslDeviceShelfResponse bindEslDeviceShelfResponse, UnmarshallerContext _ctx) {
		
		bindEslDeviceShelfResponse.setRequestId(_ctx.stringValue("BindEslDeviceShelfResponse.RequestId"));
		bindEslDeviceShelfResponse.setErrorMessage(_ctx.stringValue("BindEslDeviceShelfResponse.ErrorMessage"));
		bindEslDeviceShelfResponse.setErrorCode(_ctx.stringValue("BindEslDeviceShelfResponse.ErrorCode"));
		bindEslDeviceShelfResponse.setMessage(_ctx.stringValue("BindEslDeviceShelfResponse.Message"));
		bindEslDeviceShelfResponse.setDynamicCode(_ctx.stringValue("BindEslDeviceShelfResponse.DynamicCode"));
		bindEslDeviceShelfResponse.setCode(_ctx.stringValue("BindEslDeviceShelfResponse.Code"));
		bindEslDeviceShelfResponse.setDynamicMessage(_ctx.stringValue("BindEslDeviceShelfResponse.DynamicMessage"));
		bindEslDeviceShelfResponse.setSuccess(_ctx.booleanValue("BindEslDeviceShelfResponse.Success"));
	 
	 	return bindEslDeviceShelfResponse;
	}
}