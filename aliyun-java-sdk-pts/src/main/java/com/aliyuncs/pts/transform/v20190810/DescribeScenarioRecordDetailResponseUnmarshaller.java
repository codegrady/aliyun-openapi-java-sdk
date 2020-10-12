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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeScenarioRecordDetailResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScenarioRecordDetailResponseUnmarshaller {

	public static DescribeScenarioRecordDetailResponse unmarshall(DescribeScenarioRecordDetailResponse describeScenarioRecordDetailResponse, UnmarshallerContext _ctx) {
		
		describeScenarioRecordDetailResponse.setRequestId(_ctx.stringValue("DescribeScenarioRecordDetailResponse.RequestId"));
		describeScenarioRecordDetailResponse.setCode(_ctx.stringValue("DescribeScenarioRecordDetailResponse.Code"));
		describeScenarioRecordDetailResponse.setMessage(_ctx.stringValue("DescribeScenarioRecordDetailResponse.Message"));
		describeScenarioRecordDetailResponse.setRouteResponseBody(_ctx.mapValue("DescribeScenarioRecordDetailResponse.RouteResponseBody"));
		describeScenarioRecordDetailResponse.setSuccess(_ctx.stringValue("DescribeScenarioRecordDetailResponse.Success"));
	 
	 	return describeScenarioRecordDetailResponse;
	}
}