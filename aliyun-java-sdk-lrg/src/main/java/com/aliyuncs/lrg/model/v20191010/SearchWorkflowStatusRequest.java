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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchWorkflowStatusRequest extends RoaAcsRequest<SearchWorkflowStatusResponse> {
	   

	private Long id;
	public SearchWorkflowStatusRequest() {
		super("LRG", "2019-10-10", "SearchWorkflowStatus");
		setUriPattern("/api/v2/tianji/process/[id]?action=queryStatus");
		setMethod(MethodType.GET);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putPathParameter("id", id.toString());
		}
	}

	@Override
	public Class<SearchWorkflowStatusResponse> getResponseClass() {
		return SearchWorkflowStatusResponse.class;
	}

}
