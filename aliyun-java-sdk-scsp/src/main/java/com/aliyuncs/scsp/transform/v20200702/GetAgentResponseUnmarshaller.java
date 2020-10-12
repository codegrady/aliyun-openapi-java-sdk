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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetAgentResponse;
import com.aliyuncs.scsp.model.v20200702.GetAgentResponse.Data;
import com.aliyuncs.scsp.model.v20200702.GetAgentResponse.Data.GroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentResponseUnmarshaller {

	public static GetAgentResponse unmarshall(GetAgentResponse getAgentResponse, UnmarshallerContext _ctx) {
		
		getAgentResponse.setRequestId(_ctx.stringValue("GetAgentResponse.RequestId"));
		getAgentResponse.setSuccess(_ctx.booleanValue("GetAgentResponse.Success"));
		getAgentResponse.setCode(_ctx.stringValue("GetAgentResponse.Code"));

		Data data = new Data();
		data.setTenantId(_ctx.longValue("GetAgentResponse.Data.TenantId"));
		data.setAgentId(_ctx.longValue("GetAgentResponse.Data.AgentId"));
		data.setAccountName(_ctx.stringValue("GetAgentResponse.Data.AccountName"));
		data.setDisplayName(_ctx.stringValue("GetAgentResponse.Data.DisplayName"));
		data.setStatus(_ctx.integerValue("GetAgentResponse.Data.Status"));

		List<GroupListItem> groupList = new ArrayList<GroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAgentResponse.Data.GroupList.Length"); i++) {
			GroupListItem groupListItem = new GroupListItem();
			groupListItem.setSkillGroupId(_ctx.longValue("GetAgentResponse.Data.GroupList["+ i +"].SkillGroupId"));
			groupListItem.setName(_ctx.stringValue("GetAgentResponse.Data.GroupList["+ i +"].Name"));
			groupListItem.setDescription(_ctx.stringValue("GetAgentResponse.Data.GroupList["+ i +"].Description"));
			groupListItem.setDisplayName(_ctx.stringValue("GetAgentResponse.Data.GroupList["+ i +"].DisplayName"));
			groupListItem.setChannelType(_ctx.integerValue("GetAgentResponse.Data.GroupList["+ i +"].ChannelType"));

			groupList.add(groupListItem);
		}
		data.setGroupList(groupList);
		getAgentResponse.setData(data);
	 
	 	return getAgentResponse;
	}
}