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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMsSgCircuitBreakerRuleRequest extends RpcAcsRequest<UpdateMsSgCircuitBreakerRuleResponse> {
	   

	private String httpMethod;

	private String mode;

	private Long id;

	private String methodName;

	private String appNames;

	private String circuitBreakerRuleItems;

	private String resource;

	private String httpPath;

	private String resType;

	private String instanceId;

	private String dataId;

	private String name;

	private String trafficType;

	private String conditions;

	private String config;
	public UpdateMsSgCircuitBreakerRuleRequest() {
		super("SOFA", "2019-08-15", "UpdateMsSgCircuitBreakerRule", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHttpMethod() {
		return this.httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
		if(httpMethod != null){
			putBodyParameter("HttpMethod", httpMethod);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
		if(methodName != null){
			putBodyParameter("MethodName", methodName);
		}
	}

	public String getAppNames() {
		return this.appNames;
	}

	public void setAppNames(String appNames) {
		this.appNames = appNames;
		if(appNames != null){
			putBodyParameter("AppNames", appNames);
		}
	}

	public String getCircuitBreakerRuleItems() {
		return this.circuitBreakerRuleItems;
	}

	public void setCircuitBreakerRuleItems(String circuitBreakerRuleItems) {
		this.circuitBreakerRuleItems = circuitBreakerRuleItems;
		if(circuitBreakerRuleItems != null){
			putBodyParameter("CircuitBreakerRuleItems", circuitBreakerRuleItems);
		}
	}

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putBodyParameter("Resource", resource);
		}
	}

	public String getHttpPath() {
		return this.httpPath;
	}

	public void setHttpPath(String httpPath) {
		this.httpPath = httpPath;
		if(httpPath != null){
			putBodyParameter("HttpPath", httpPath);
		}
	}

	public String getResType() {
		return this.resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
		if(resType != null){
			putBodyParameter("ResType", resType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putBodyParameter("DataId", dataId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getTrafficType() {
		return this.trafficType;
	}

	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
		if(trafficType != null){
			putBodyParameter("TrafficType", trafficType);
		}
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
		if(conditions != null){
			putBodyParameter("Conditions", conditions);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putBodyParameter("Config", config);
		}
	}

	@Override
	public Class<UpdateMsSgCircuitBreakerRuleResponse> getResponseClass() {
		return UpdateMsSgCircuitBreakerRuleResponse.class;
	}

}
