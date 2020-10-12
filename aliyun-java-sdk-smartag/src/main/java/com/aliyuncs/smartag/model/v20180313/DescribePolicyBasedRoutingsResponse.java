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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribePolicyBasedRoutingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyBasedRoutingsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<PolicyBasedRouting> policyBasedRoutings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<PolicyBasedRouting> getPolicyBasedRoutings() {
		return this.policyBasedRoutings;
	}

	public void setPolicyBasedRoutings(List<PolicyBasedRouting> policyBasedRoutings) {
		this.policyBasedRoutings = policyBasedRoutings;
	}

	public static class PolicyBasedRouting {

		private String pbrInstanceId;

		private Integer priority;

		private String name;

		private String description;

		public String getPbrInstanceId() {
			return this.pbrInstanceId;
		}

		public void setPbrInstanceId(String pbrInstanceId) {
			this.pbrInstanceId = pbrInstanceId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribePolicyBasedRoutingsResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyBasedRoutingsResponseUnmarshaller.unmarshall(this, context);
	}
}
