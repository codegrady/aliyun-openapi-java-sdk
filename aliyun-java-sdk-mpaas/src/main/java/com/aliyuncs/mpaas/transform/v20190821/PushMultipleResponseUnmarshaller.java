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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.PushMultipleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushMultipleResponseUnmarshaller {

	public static PushMultipleResponse unmarshall(PushMultipleResponse pushMultipleResponse, UnmarshallerContext _ctx) {
		
		pushMultipleResponse.setRequestId(_ctx.stringValue("PushMultipleResponse.RequestId"));
		pushMultipleResponse.setResultCode(_ctx.stringValue("PushMultipleResponse.ResultCode"));
		pushMultipleResponse.setResultMessage(_ctx.stringValue("PushMultipleResponse.ResultMessage"));
	 
	 	return pushMultipleResponse;
	}
}