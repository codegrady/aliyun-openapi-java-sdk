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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryEcsElasticUpgradeInfoRequest extends RpcAcsRequest<QueryEcsElasticUpgradeInfoResponse> {
	
	public QueryEcsElasticUpgradeInfoRequest() {
		super("EcsInc", "2016-03-14", "QueryEcsElasticUpgradeInfo", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String callerBid;

	private Long ownerId;

	private String instanceId;

	private Long callerUid;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(String callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putQueryParameter("callerBid", callerBid);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(Long callerUid) {
		this.callerUid = callerUid;
		if(callerUid != null){
			putQueryParameter("callerUid", callerUid.toString());
		}
	}

	@Override
	public Class<QueryEcsElasticUpgradeInfoResponse> getResponseClass() {
		return QueryEcsElasticUpgradeInfoResponse.class;
	}

}
