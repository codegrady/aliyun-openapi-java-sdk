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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepositoryResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private String instanceId;

	private String repoId;

	private String repoNamespaceName;

	private String repoName;

	private String repoStatus;

	private String repoType;

	private String repoBuildType;

	private String summary;

	private String detail;

	private Long createTime;

	private Long modifiedTime;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
	}

	public String getRepoNamespaceName() {
		return this.repoNamespaceName;
	}

	public void setRepoNamespaceName(String repoNamespaceName) {
		this.repoNamespaceName = repoNamespaceName;
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	public String getRepoStatus() {
		return this.repoStatus;
	}

	public void setRepoStatus(String repoStatus) {
		this.repoStatus = repoStatus;
	}

	public String getRepoType() {
		return this.repoType;
	}

	public void setRepoType(String repoType) {
		this.repoType = repoType;
	}

	public String getRepoBuildType() {
		return this.repoBuildType;
	}

	public void setRepoBuildType(String repoBuildType) {
		this.repoBuildType = repoBuildType;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Override
	public GetRepositoryResponse getInstance(UnmarshallerContext context) {
		return	GetRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
