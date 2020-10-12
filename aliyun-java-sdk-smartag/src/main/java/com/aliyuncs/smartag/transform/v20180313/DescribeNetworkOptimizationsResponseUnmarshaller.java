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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeNetworkOptimizationsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeNetworkOptimizationsResponse.NetworkOptimization;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkOptimizationsResponseUnmarshaller {

	public static DescribeNetworkOptimizationsResponse unmarshall(DescribeNetworkOptimizationsResponse describeNetworkOptimizationsResponse, UnmarshallerContext _ctx) {
		
		describeNetworkOptimizationsResponse.setRequestId(_ctx.stringValue("DescribeNetworkOptimizationsResponse.RequestId"));
		describeNetworkOptimizationsResponse.setTotalCount(_ctx.integerValue("DescribeNetworkOptimizationsResponse.TotalCount"));
		describeNetworkOptimizationsResponse.setPageNumber(_ctx.integerValue("DescribeNetworkOptimizationsResponse.PageNumber"));
		describeNetworkOptimizationsResponse.setPageSize(_ctx.integerValue("DescribeNetworkOptimizationsResponse.PageSize"));

		List<NetworkOptimization> networkOptimizations = new ArrayList<NetworkOptimization>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations.Length"); i++) {
			NetworkOptimization networkOptimization = new NetworkOptimization();
			networkOptimization.setInstanceId(_ctx.stringValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations["+ i +"].InstanceId"));
			networkOptimization.setName(_ctx.stringValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations["+ i +"].Name"));
			networkOptimization.setState(_ctx.stringValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations["+ i +"].State"));
			networkOptimization.setCreateTime(_ctx.longValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations["+ i +"].CreateTime"));
			networkOptimization.setSagCount(_ctx.integerValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations["+ i +"].SagCount"));
			networkOptimization.setCcnId(_ctx.stringValue("DescribeNetworkOptimizationsResponse.NetworkOptimizations["+ i +"].CcnId"));

			networkOptimizations.add(networkOptimization);
		}
		describeNetworkOptimizationsResponse.setNetworkOptimizations(networkOptimizations);
	 
	 	return describeNetworkOptimizationsResponse;
	}
}