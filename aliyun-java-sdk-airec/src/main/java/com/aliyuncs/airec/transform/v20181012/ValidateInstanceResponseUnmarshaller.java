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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.ValidateInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateInstanceResponseUnmarshaller {

	public static ValidateInstanceResponse unmarshall(ValidateInstanceResponse validateInstanceResponse, UnmarshallerContext _ctx) {
		
		validateInstanceResponse.setRequestId(_ctx.stringValue("ValidateInstanceResponse.RequestId"));
		validateInstanceResponse.setCode(_ctx.stringValue("ValidateInstanceResponse.Code"));
		validateInstanceResponse.setMessage(_ctx.stringValue("ValidateInstanceResponse.Message"));
		validateInstanceResponse.setResult(_ctx.booleanValue("ValidateInstanceResponse.Result"));
	 
	 	return validateInstanceResponse;
	}
}