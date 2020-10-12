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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.AbortChangeResponse;
import com.aliyuncs.webplus.model.v20190320.AbortChangeResponse.EnvChange;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbortChangeResponseUnmarshaller {

	public static AbortChangeResponse unmarshall(AbortChangeResponse abortChangeResponse, UnmarshallerContext _ctx) {
		
		abortChangeResponse.setRequestId(_ctx.stringValue("AbortChangeResponse.RequestId"));
		abortChangeResponse.setCode(_ctx.stringValue("AbortChangeResponse.Code"));
		abortChangeResponse.setMessage(_ctx.stringValue("AbortChangeResponse.Message"));

		EnvChange envChange = new EnvChange();
		envChange.setEnvId(_ctx.stringValue("AbortChangeResponse.EnvChange.EnvId"));
		envChange.setChangeId(_ctx.stringValue("AbortChangeResponse.EnvChange.ChangeId"));
		envChange.setStartTime(_ctx.stringValue("AbortChangeResponse.EnvChange.StartTime"));
		abortChangeResponse.setEnvChange(envChange);
	 
	 	return abortChangeResponse;
	}
}