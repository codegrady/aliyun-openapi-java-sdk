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

package com.aliyuncs.mpaas.model.v20190821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMcubeWhitelistRequest extends RpcAcsRequest<UpdateMcubeWhitelistResponse> {
	   

	private Boolean onexFlag;

	private String tenantId;

	private String id;

	private String keyIds;

	private String ossUrl;

	private String appId;

	private String workspaceId;
	public UpdateMcubeWhitelistRequest() {
		super("mPaaS", "2019-08-21", "UpdateMcubeWhitelist", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getOnexFlag() {
		return this.onexFlag;
	}

	public void setOnexFlag(Boolean onexFlag) {
		this.onexFlag = onexFlag;
		if(onexFlag != null){
			putBodyParameter("OnexFlag", onexFlag.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
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

	public String getKeyIds() {
		return this.keyIds;
	}

	public void setKeyIds(String keyIds) {
		this.keyIds = keyIds;
		if(keyIds != null){
			putBodyParameter("KeyIds", keyIds);
		}
	}

	public String getOssUrl() {
		return this.ossUrl;
	}

	public void setOssUrl(String ossUrl) {
		this.ossUrl = ossUrl;
		if(ossUrl != null){
			putBodyParameter("OssUrl", ossUrl);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<UpdateMcubeWhitelistResponse> getResponseClass() {
		return UpdateMcubeWhitelistResponse.class;
	}

}
