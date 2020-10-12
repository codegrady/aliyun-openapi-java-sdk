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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaMetadataRequest extends RpcAcsRequest<DescribeHanaMetadataResponse> {
	   

	private String endSnapshotId;

	private String clientId;

	private String vaultId;

	private String clusterId;

	private String startPaths;

	private String token;

	private String sid;

	private String startSnapshotId;

	private String endPaths;

	private String endTags;

	private String startTags;
	public DescribeHanaMetadataRequest() {
		super("hbr", "2017-09-08", "DescribeHanaMetadata", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndSnapshotId() {
		return this.endSnapshotId;
	}

	public void setEndSnapshotId(String endSnapshotId) {
		this.endSnapshotId = endSnapshotId;
		if(endSnapshotId != null){
			putQueryParameter("EndSnapshotId", endSnapshotId);
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getStartPaths() {
		return this.startPaths;
	}

	public void setStartPaths(String startPaths) {
		this.startPaths = startPaths;
		if(startPaths != null){
			putQueryParameter("StartPaths", startPaths);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid);
		}
	}

	public String getStartSnapshotId() {
		return this.startSnapshotId;
	}

	public void setStartSnapshotId(String startSnapshotId) {
		this.startSnapshotId = startSnapshotId;
		if(startSnapshotId != null){
			putQueryParameter("StartSnapshotId", startSnapshotId);
		}
	}

	public String getEndPaths() {
		return this.endPaths;
	}

	public void setEndPaths(String endPaths) {
		this.endPaths = endPaths;
		if(endPaths != null){
			putQueryParameter("EndPaths", endPaths);
		}
	}

	public String getEndTags() {
		return this.endTags;
	}

	public void setEndTags(String endTags) {
		this.endTags = endTags;
		if(endTags != null){
			putQueryParameter("EndTags", endTags);
		}
	}

	public String getStartTags() {
		return this.startTags;
	}

	public void setStartTags(String startTags) {
		this.startTags = startTags;
		if(startTags != null){
			putQueryParameter("StartTags", startTags);
		}
	}

	@Override
	public Class<DescribeHanaMetadataResponse> getResponseClass() {
		return DescribeHanaMetadataResponse.class;
	}

}
