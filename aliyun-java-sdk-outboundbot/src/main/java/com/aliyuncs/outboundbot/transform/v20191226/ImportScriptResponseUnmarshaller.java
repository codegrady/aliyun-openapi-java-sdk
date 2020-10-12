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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.ImportScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportScriptResponseUnmarshaller {

	public static ImportScriptResponse unmarshall(ImportScriptResponse importScriptResponse, UnmarshallerContext _ctx) {
		
		importScriptResponse.setRequestId(_ctx.stringValue("ImportScriptResponse.RequestId"));
		importScriptResponse.setCode(_ctx.stringValue("ImportScriptResponse.Code"));
		importScriptResponse.setHttpStatusCode(_ctx.integerValue("ImportScriptResponse.HttpStatusCode"));
		importScriptResponse.setMessage(_ctx.stringValue("ImportScriptResponse.Message"));
		importScriptResponse.setScriptId(_ctx.stringValue("ImportScriptResponse.ScriptId"));
		importScriptResponse.setSuccess(_ctx.booleanValue("ImportScriptResponse.Success"));
	 
	 	return importScriptResponse;
	}
}