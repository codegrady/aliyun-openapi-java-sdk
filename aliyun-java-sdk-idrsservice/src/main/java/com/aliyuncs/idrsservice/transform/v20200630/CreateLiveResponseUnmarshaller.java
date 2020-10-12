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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.CreateLiveResponse;
import com.aliyuncs.idrsservice.model.v20200630.CreateLiveResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLiveResponseUnmarshaller {

	public static CreateLiveResponse unmarshall(CreateLiveResponse createLiveResponse, UnmarshallerContext _ctx) {
		
		createLiveResponse.setRequestId(_ctx.stringValue("CreateLiveResponse.RequestId"));
		createLiveResponse.setCode(_ctx.stringValue("CreateLiveResponse.Code"));
		createLiveResponse.setMessage(_ctx.stringValue("CreateLiveResponse.Message"));

		Data data = new Data();
		data.setChannel(_ctx.stringValue("CreateLiveResponse.Data.Channel"));
		data.setId(_ctx.stringValue("CreateLiveResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLiveResponse.Data.Name"));
		createLiveResponse.setData(data);
	 
	 	return createLiveResponse;
	}
}