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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeSystemEventMetaListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSystemEventMetaListResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemEventMetaListResponseUnmarshaller {

	public static DescribeSystemEventMetaListResponse unmarshall(DescribeSystemEventMetaListResponse describeSystemEventMetaListResponse, UnmarshallerContext _ctx) {
		
		describeSystemEventMetaListResponse.setRequestId(_ctx.stringValue("DescribeSystemEventMetaListResponse.RequestId"));
		describeSystemEventMetaListResponse.setSuccess(_ctx.booleanValue("DescribeSystemEventMetaListResponse.Success"));
		describeSystemEventMetaListResponse.setCode(_ctx.integerValue("DescribeSystemEventMetaListResponse.Code"));
		describeSystemEventMetaListResponse.setMessage(_ctx.stringValue("DescribeSystemEventMetaListResponse.Message"));

		List<Resource> data = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSystemEventMetaListResponse.Data.Length"); i++) {
			Resource resource = new Resource();
			resource.setProduct(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Product"));
			resource.setName(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Name"));
			resource.setNameDesc(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].NameDesc"));
			resource.setNameDescEn(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].NameDesc.En"));
			resource.setLevel(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Level"));
			resource.setStatus(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].Status"));
			resource.setStatusDesc(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].StatusDesc"));
			resource.setEventType(_ctx.stringValue("DescribeSystemEventMetaListResponse.Data["+ i +"].EventType"));

			data.add(resource);
		}
		describeSystemEventMetaListResponse.setData(data);
	 
	 	return describeSystemEventMetaListResponse;
	}
}