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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBgpPeerRequest extends RpcAcsRequest<CreateBgpPeerResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String bgpGroupId;

	private String peerIpAddress;

	private Integer bfdMultiHop;

	private String ipVersion;

	private Boolean enableBfd;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public CreateBgpPeerRequest() {
		super("Vpc", "2016-04-28", "CreateBgpPeer", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBgpGroupId() {
		return this.bgpGroupId;
	}

	public void setBgpGroupId(String bgpGroupId) {
		this.bgpGroupId = bgpGroupId;
		if(bgpGroupId != null){
			putQueryParameter("BgpGroupId", bgpGroupId);
		}
	}

	public String getPeerIpAddress() {
		return this.peerIpAddress;
	}

	public void setPeerIpAddress(String peerIpAddress) {
		this.peerIpAddress = peerIpAddress;
		if(peerIpAddress != null){
			putQueryParameter("PeerIpAddress", peerIpAddress);
		}
	}

	public Integer getBfdMultiHop() {
		return this.bfdMultiHop;
	}

	public void setBfdMultiHop(Integer bfdMultiHop) {
		this.bfdMultiHop = bfdMultiHop;
		if(bfdMultiHop != null){
			putQueryParameter("BfdMultiHop", bfdMultiHop.toString());
		}
	}

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion);
		}
	}

	public Boolean getEnableBfd() {
		return this.enableBfd;
	}

	public void setEnableBfd(Boolean enableBfd) {
		this.enableBfd = enableBfd;
		if(enableBfd != null){
			putQueryParameter("EnableBfd", enableBfd.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<CreateBgpPeerResponse> getResponseClass() {
		return CreateBgpPeerResponse.class;
	}

}
