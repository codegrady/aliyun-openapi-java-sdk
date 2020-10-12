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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.QueryRedialIndicatorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRedialIndicatorResponseUnmarshaller {

	public static QueryRedialIndicatorResponse unmarshall(QueryRedialIndicatorResponse queryRedialIndicatorResponse, UnmarshallerContext _ctx) {
		
		queryRedialIndicatorResponse.setRequestId(_ctx.stringValue("QueryRedialIndicatorResponse.RequestId"));
		queryRedialIndicatorResponse.setSuccess(_ctx.booleanValue("QueryRedialIndicatorResponse.Success"));
		queryRedialIndicatorResponse.setCode(_ctx.stringValue("QueryRedialIndicatorResponse.Code"));
		queryRedialIndicatorResponse.setMessage(_ctx.stringValue("QueryRedialIndicatorResponse.Message"));
		queryRedialIndicatorResponse.setHttpStatusCode(_ctx.integerValue("QueryRedialIndicatorResponse.HttpStatusCode"));
		queryRedialIndicatorResponse.setRedial(_ctx.booleanValue("QueryRedialIndicatorResponse.Redial"));
	 
	 	return queryRedialIndicatorResponse;
	}
}