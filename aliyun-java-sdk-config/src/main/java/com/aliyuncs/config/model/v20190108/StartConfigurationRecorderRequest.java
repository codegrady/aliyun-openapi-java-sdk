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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartConfigurationRecorderRequest extends RpcAcsRequest<StartConfigurationRecorderResponse> {
	   

	private Boolean enterpriseEdition;
	public StartConfigurationRecorderRequest() {
		super("Config", "2019-01-08", "StartConfigurationRecorder", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getEnterpriseEdition() {
		return this.enterpriseEdition;
	}

	public void setEnterpriseEdition(Boolean enterpriseEdition) {
		this.enterpriseEdition = enterpriseEdition;
		if(enterpriseEdition != null){
			putBodyParameter("EnterpriseEdition", enterpriseEdition.toString());
		}
	}

	@Override
	public Class<StartConfigurationRecorderResponse> getResponseClass() {
		return StartConfigurationRecorderResponse.class;
	}

}
