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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeStreamResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamResponseUnmarshaller {

	public static DescribeStreamResponse unmarshall(DescribeStreamResponse describeStreamResponse, UnmarshallerContext _ctx) {
		
		describeStreamResponse.setRequestId(_ctx.stringValue("DescribeStreamResponse.RequestId"));
		describeStreamResponse.setId(_ctx.stringValue("DescribeStreamResponse.Id"));
		describeStreamResponse.setName(_ctx.stringValue("DescribeStreamResponse.Name"));
		describeStreamResponse.setPushDomain(_ctx.stringValue("DescribeStreamResponse.PushDomain"));
		describeStreamResponse.setPlayDomain(_ctx.stringValue("DescribeStreamResponse.PlayDomain"));
		describeStreamResponse.setApp(_ctx.stringValue("DescribeStreamResponse.App"));
		describeStreamResponse.setBizProtocol(_ctx.stringValue("DescribeStreamResponse.Protocol"));
		describeStreamResponse.setGroupId(_ctx.stringValue("DescribeStreamResponse.GroupId"));
		describeStreamResponse.setDeviceId(_ctx.stringValue("DescribeStreamResponse.DeviceId"));
		describeStreamResponse.setEnabled(_ctx.booleanValue("DescribeStreamResponse.Enabled"));
		describeStreamResponse.setStatus(_ctx.stringValue("DescribeStreamResponse.Status"));
		describeStreamResponse.setHeight(_ctx.integerValue("DescribeStreamResponse.Height"));
		describeStreamResponse.setWidth(_ctx.integerValue("DescribeStreamResponse.Width"));
		describeStreamResponse.setCreatedTime(_ctx.stringValue("DescribeStreamResponse.CreatedTime"));
	 
	 	return describeStreamResponse;
	}
}