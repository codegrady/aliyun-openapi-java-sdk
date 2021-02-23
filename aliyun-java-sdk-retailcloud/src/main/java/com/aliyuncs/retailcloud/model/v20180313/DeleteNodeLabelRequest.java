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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteNodeLabelRequest extends RpcAcsRequest<DeleteNodeLabelResponse> {
	   

	private String labelKey;

	private String labelValue;

	private Boolean force;

	private String clusterId;
	public DeleteNodeLabelRequest() {
		super("retailcloud", "2018-03-13", "DeleteNodeLabel");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLabelKey() {
		return this.labelKey;
	}

	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
		if(labelKey != null){
			putQueryParameter("LabelKey", labelKey);
		}
	}

	public String getLabelValue() {
		return this.labelValue;
	}

	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
		if(labelValue != null){
			putQueryParameter("LabelValue", labelValue);
		}
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
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

	@Override
	public Class<DeleteNodeLabelResponse> getResponseClass() {
		return DeleteNodeLabelResponse.class;
	}

}
