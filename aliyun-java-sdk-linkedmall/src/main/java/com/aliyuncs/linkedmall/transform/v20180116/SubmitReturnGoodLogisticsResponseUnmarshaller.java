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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.SubmitReturnGoodLogisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitReturnGoodLogisticsResponseUnmarshaller {

	public static SubmitReturnGoodLogisticsResponse unmarshall(SubmitReturnGoodLogisticsResponse submitReturnGoodLogisticsResponse, UnmarshallerContext _ctx) {
		
		submitReturnGoodLogisticsResponse.setRequestId(_ctx.stringValue("SubmitReturnGoodLogisticsResponse.RequestId"));
		submitReturnGoodLogisticsResponse.setCode(_ctx.stringValue("SubmitReturnGoodLogisticsResponse.Code"));
		submitReturnGoodLogisticsResponse.setMessage(_ctx.stringValue("SubmitReturnGoodLogisticsResponse.Message"));
	 
	 	return submitReturnGoodLogisticsResponse;
	}
}