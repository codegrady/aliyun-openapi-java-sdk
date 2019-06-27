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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeChannelParticipantsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChannelParticipantsResponseUnmarshaller {

	public static DescribeChannelParticipantsResponse unmarshall(DescribeChannelParticipantsResponse describeChannelParticipantsResponse, UnmarshallerContext context) {
		
		describeChannelParticipantsResponse.setRequestId(context.stringValue("DescribeChannelParticipantsResponse.RequestId"));
		describeChannelParticipantsResponse.setTimestamp(context.integerValue("DescribeChannelParticipantsResponse.Timestamp"));
		describeChannelParticipantsResponse.setTotalNum(context.integerValue("DescribeChannelParticipantsResponse.TotalNum"));
		describeChannelParticipantsResponse.setTotalPage(context.integerValue("DescribeChannelParticipantsResponse.TotalPage"));

		List<String> userList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeChannelParticipantsResponse.UserList.Length"); i++) {
			userList.add(context.stringValue("DescribeChannelParticipantsResponse.UserList["+ i +"]"));
		}
		describeChannelParticipantsResponse.setUserList(userList);
	 
	 	return describeChannelParticipantsResponse;
	}
}