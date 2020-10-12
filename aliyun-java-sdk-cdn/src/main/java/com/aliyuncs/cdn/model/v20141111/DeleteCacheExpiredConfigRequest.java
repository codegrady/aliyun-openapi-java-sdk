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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteCacheExpiredConfigRequest extends RpcAcsRequest<DeleteCacheExpiredConfigResponse> {
	   

	private String domainName;

	private Long ownerId;

	private String cacheType;

	private String securityToken;

	private String configID;
	public DeleteCacheExpiredConfigRequest() {
		super("Cdn", "2014-11-11", "DeleteCacheExpiredConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getCacheType() {
		return this.cacheType;
	}

	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
		if(cacheType != null){
			putQueryParameter("CacheType", cacheType);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getConfigID() {
		return this.configID;
	}

	public void setConfigID(String configID) {
		this.configID = configID;
		if(configID != null){
			putQueryParameter("ConfigID", configID);
		}
	}

	@Override
	public Class<DeleteCacheExpiredConfigResponse> getResponseClass() {
		return DeleteCacheExpiredConfigResponse.class;
	}

}
