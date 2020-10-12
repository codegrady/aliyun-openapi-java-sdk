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

package com.aliyuncs.aligreen_console.model.v20191115;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aligreen_console.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSfaceAuditTasksRequest extends RpcAcsRequest<ListSfaceAuditTasksResponse> {
	   

	private List<String> dataIds;
	public ListSfaceAuditTasksRequest() {
		super("aligreen-console", "2019-11-15", "ListSfaceAuditTasks");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDataIds() {
		return this.dataIds;
	}

	public void setDataIds(List<String> dataIds) {
		this.dataIds = dataIds;	
		if (dataIds != null) {
			for (int i = 0; i < dataIds.size(); i++) {
				putQueryParameter("DataId." + (i + 1) , dataIds.get(i));
			}
		}	
	}

	@Override
	public Class<ListSfaceAuditTasksResponse> getResponseClass() {
		return ListSfaceAuditTasksResponse.class;
	}

}
