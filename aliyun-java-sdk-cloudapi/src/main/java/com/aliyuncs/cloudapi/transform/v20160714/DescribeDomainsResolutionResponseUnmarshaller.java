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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDomainsResolutionResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDomainsResolutionResponse.DomainResolution;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsResolutionResponseUnmarshaller {

	public static DescribeDomainsResolutionResponse unmarshall(DescribeDomainsResolutionResponse describeDomainsResolutionResponse, UnmarshallerContext _ctx) {
		
		describeDomainsResolutionResponse.setRequestId(_ctx.stringValue("DescribeDomainsResolutionResponse.RequestId"));
		describeDomainsResolutionResponse.setGroupId(_ctx.stringValue("DescribeDomainsResolutionResponse.GroupId"));

		List<DomainResolution> domainResolutions = new ArrayList<DomainResolution>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainsResolutionResponse.DomainResolutions.Length"); i++) {
			DomainResolution domainResolution = new DomainResolution();
			domainResolution.setDomainName(_ctx.stringValue("DescribeDomainsResolutionResponse.DomainResolutions["+ i +"].DomainName"));
			domainResolution.setDomainResolutionStatus(_ctx.stringValue("DescribeDomainsResolutionResponse.DomainResolutions["+ i +"].DomainResolutionStatus"));

			domainResolutions.add(domainResolution);
		}
		describeDomainsResolutionResponse.setDomainResolutions(domainResolutions);
	 
	 	return describeDomainsResolutionResponse;
	}
}