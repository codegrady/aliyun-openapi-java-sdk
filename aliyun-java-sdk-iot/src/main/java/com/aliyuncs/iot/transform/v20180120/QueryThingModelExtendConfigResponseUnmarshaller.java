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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryThingModelExtendConfigResponse;
import com.aliyuncs.iot.model.v20180120.QueryThingModelExtendConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryThingModelExtendConfigResponseUnmarshaller {

	public static QueryThingModelExtendConfigResponse unmarshall(QueryThingModelExtendConfigResponse queryThingModelExtendConfigResponse, UnmarshallerContext _ctx) {
		
		queryThingModelExtendConfigResponse.setRequestId(_ctx.stringValue("QueryThingModelExtendConfigResponse.RequestId"));
		queryThingModelExtendConfigResponse.setSuccess(_ctx.booleanValue("QueryThingModelExtendConfigResponse.Success"));
		queryThingModelExtendConfigResponse.setCode(_ctx.stringValue("QueryThingModelExtendConfigResponse.Code"));
		queryThingModelExtendConfigResponse.setErrorMessage(_ctx.stringValue("QueryThingModelExtendConfigResponse.ErrorMessage"));

		Data data = new Data();
		data.setConfiguration(_ctx.stringValue("QueryThingModelExtendConfigResponse.Data.Configuration"));
		queryThingModelExtendConfigResponse.setData(data);
	 
	 	return queryThingModelExtendConfigResponse;
	}
}