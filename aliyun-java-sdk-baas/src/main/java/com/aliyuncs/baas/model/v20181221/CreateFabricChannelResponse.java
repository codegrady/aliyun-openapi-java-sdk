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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.CreateFabricChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFabricChannelResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String channelId;

		private String channelName;

		private String consortiumId;

		private String state;

		private String ownerBid;

		private Long ownerUid;

		private String ownerName;

		private Integer memberCount;

		private Integer chaincodeCount;

		private Integer blockCount;

		private String requestId;

		private String createTime;

		private String updateTime;

		private String consortiumName;

		private Integer batchTimeout;

		private Integer maxMessageCount;

		private Integer preferredMaxBytes;

		private Boolean supportConfig;

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getOwnerBid() {
			return this.ownerBid;
		}

		public void setOwnerBid(String ownerBid) {
			this.ownerBid = ownerBid;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Integer getMemberCount() {
			return this.memberCount;
		}

		public void setMemberCount(Integer memberCount) {
			this.memberCount = memberCount;
		}

		public Integer getChaincodeCount() {
			return this.chaincodeCount;
		}

		public void setChaincodeCount(Integer chaincodeCount) {
			this.chaincodeCount = chaincodeCount;
		}

		public Integer getBlockCount() {
			return this.blockCount;
		}

		public void setBlockCount(Integer blockCount) {
			this.blockCount = blockCount;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getConsortiumName() {
			return this.consortiumName;
		}

		public void setConsortiumName(String consortiumName) {
			this.consortiumName = consortiumName;
		}

		public Integer getBatchTimeout() {
			return this.batchTimeout;
		}

		public void setBatchTimeout(Integer batchTimeout) {
			this.batchTimeout = batchTimeout;
		}

		public Integer getMaxMessageCount() {
			return this.maxMessageCount;
		}

		public void setMaxMessageCount(Integer maxMessageCount) {
			this.maxMessageCount = maxMessageCount;
		}

		public Integer getPreferredMaxBytes() {
			return this.preferredMaxBytes;
		}

		public void setPreferredMaxBytes(Integer preferredMaxBytes) {
			this.preferredMaxBytes = preferredMaxBytes;
		}

		public Boolean getSupportConfig() {
			return this.supportConfig;
		}

		public void setSupportConfig(Boolean supportConfig) {
			this.supportConfig = supportConfig;
		}
	}

	@Override
	public CreateFabricChannelResponse getInstance(UnmarshallerContext context) {
		return	CreateFabricChannelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
