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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyRouteDistributionStrategyRequest extends RpcAcsRequest<ModifyRouteDistributionStrategyResponse> {
	   

	private String routeSource;

	private Long resourceOwnerId;

	private String hcInstanceId;

	private String sourceType;

	private String destCidrBlock;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String routeDistribution;

	private Long ownerId;

	private String smartAGId;
	public ModifyRouteDistributionStrategyRequest() {
		super("Smartag", "2018-03-13", "ModifyRouteDistributionStrategy", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRouteSource() {
		return this.routeSource;
	}

	public void setRouteSource(String routeSource) {
		this.routeSource = routeSource;
		if(routeSource != null){
			putQueryParameter("RouteSource", routeSource);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getHcInstanceId() {
		return this.hcInstanceId;
	}

	public void setHcInstanceId(String hcInstanceId) {
		this.hcInstanceId = hcInstanceId;
		if(hcInstanceId != null){
			putQueryParameter("HcInstanceId", hcInstanceId);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getDestCidrBlock() {
		return this.destCidrBlock;
	}

	public void setDestCidrBlock(String destCidrBlock) {
		this.destCidrBlock = destCidrBlock;
		if(destCidrBlock != null){
			putQueryParameter("DestCidrBlock", destCidrBlock);
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

	public String getRouteDistribution() {
		return this.routeDistribution;
	}

	public void setRouteDistribution(String routeDistribution) {
		this.routeDistribution = routeDistribution;
		if(routeDistribution != null){
			putQueryParameter("RouteDistribution", routeDistribution);
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	@Override
	public Class<ModifyRouteDistributionStrategyResponse> getResponseClass() {
		return ModifyRouteDistributionStrategyResponse.class;
	}

}
