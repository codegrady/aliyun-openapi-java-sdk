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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainFlowDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainFlowDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainFlowDataResponseUnmarshaller {

	public static DescribeDomainFlowDataResponse unmarshall(DescribeDomainFlowDataResponse describeDomainFlowDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainFlowDataResponse.setRequestId(_ctx.stringValue("DescribeDomainFlowDataResponse.RequestId"));
		describeDomainFlowDataResponse.setDomainName(_ctx.stringValue("DescribeDomainFlowDataResponse.DomainName"));
		describeDomainFlowDataResponse.setStartTime(_ctx.stringValue("DescribeDomainFlowDataResponse.StartTime"));
		describeDomainFlowDataResponse.setEndTime(_ctx.stringValue("DescribeDomainFlowDataResponse.EndTime"));
		describeDomainFlowDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainFlowDataResponse.DataInterval"));

		List<DataModule> flowDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainFlowDataResponse.FlowDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setDynamicValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].DynamicValue"));
			dataModule.setDynamicDomesticValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].DynamicDomesticValue"));
			dataModule.setDynamicOverseasValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].DynamicOverseasValue"));
			dataModule.setStaticValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].StaticValue"));
			dataModule.setStaticDomesticValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].StaticDomesticValue"));
			dataModule.setStaticOverseasValue(_ctx.stringValue("DescribeDomainFlowDataResponse.FlowDataPerInterval["+ i +"].StaticOverseasValue"));

			flowDataPerInterval.add(dataModule);
		}
		describeDomainFlowDataResponse.setFlowDataPerInterval(flowDataPerInterval);
	 
	 	return describeDomainFlowDataResponse;
	}
}