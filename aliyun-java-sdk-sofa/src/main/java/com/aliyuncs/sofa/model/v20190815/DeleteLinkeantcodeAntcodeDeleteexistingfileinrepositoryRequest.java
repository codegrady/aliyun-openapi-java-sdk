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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest extends RpcAcsRequest<DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse> {
	   

	private String filePath;

	private String id;

	private String branchName;

	private String requestGitOperate;

	private String commitMessage;
	public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest() {
		super("SOFA", "2019-08-15", "DeleteLinkeantcodeAntcodeDeleteexistingfileinrepository", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putBodyParameter("FilePath", filePath);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
		if(branchName != null){
			putBodyParameter("BranchName", branchName);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getCommitMessage() {
		return this.commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
		if(commitMessage != null){
			putBodyParameter("CommitMessage", commitMessage);
		}
	}

	@Override
	public Class<DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse> getResponseClass() {
		return DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.class;
	}

}
