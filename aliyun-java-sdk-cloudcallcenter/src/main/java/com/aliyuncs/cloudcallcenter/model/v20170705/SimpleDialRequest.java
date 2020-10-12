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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SimpleDialRequest extends RpcAcsRequest<SimpleDialResponse> {
	
	public SimpleDialRequest() {
		super("CloudCallCenter", "2017-07-05", "SimpleDial", "CloudCallCenter", "innerAPI");
	}

	private String caller;

	private String instanceId;

	private String contractFlowId;

	private String callee;

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
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

	public String getContractFlowId() {
		return this.contractFlowId;
	}

	public void setContractFlowId(String contractFlowId) {
		this.contractFlowId = contractFlowId;
		if(contractFlowId != null){
			putQueryParameter("ContractFlowId", contractFlowId);
		}
	}

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = callee;
		if(callee != null){
			putQueryParameter("Callee", callee);
		}
	}

	@Override
	public Class<SimpleDialResponse> getResponseClass() {
		return SimpleDialResponse.class;
	}

}
