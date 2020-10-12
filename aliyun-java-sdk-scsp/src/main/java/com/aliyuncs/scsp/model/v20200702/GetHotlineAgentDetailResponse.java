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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetHotlineAgentDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHotlineAgentDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long tenantId;

		private Long agentId;

		private Integer agentStatus;

		private Boolean assigned;

		private String token;

		private Integer restType;

		private String agentStatusCode;

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Long getAgentId() {
			return this.agentId;
		}

		public void setAgentId(Long agentId) {
			this.agentId = agentId;
		}

		public Integer getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(Integer agentStatus) {
			this.agentStatus = agentStatus;
		}

		public Boolean getAssigned() {
			return this.assigned;
		}

		public void setAssigned(Boolean assigned) {
			this.assigned = assigned;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getRestType() {
			return this.restType;
		}

		public void setRestType(Integer restType) {
			this.restType = restType;
		}

		public String getAgentStatusCode() {
			return this.agentStatusCode;
		}

		public void setAgentStatusCode(String agentStatusCode) {
			this.agentStatusCode = agentStatusCode;
		}
	}

	@Override
	public GetHotlineAgentDetailResponse getInstance(UnmarshallerContext context) {
		return	GetHotlineAgentDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
