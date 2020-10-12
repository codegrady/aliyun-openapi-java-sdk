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

package com.aliyuncs.acms_open.model.v20200206;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.acms_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteNamespaceRequest extends RoaAcsRequest<DeleteNamespaceResponse> {
	   

	private String namespaceId;
	public DeleteNamespaceRequest() {
		super("acms-open", "2020-02-06", "DeleteNamespace", "acms");
		setUriPattern("/diamond-ops/pop/namespace");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	@Override
	public Class<DeleteNamespaceResponse> getResponseClass() {
		return DeleteNamespaceResponse.class;
	}

}
