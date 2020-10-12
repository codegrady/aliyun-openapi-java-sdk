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

package com.aliyuncs.fnf.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fnf.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportTaskFailedRequest extends RpcAcsRequest<ReportTaskFailedResponse> {
	   

	private String cause;

	private String error;

	private String requestId;

	private String taskToken;
	public ReportTaskFailedRequest() {
		super("fnf", "2019-03-15", "ReportTaskFailed");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
		if(cause != null){
			putBodyParameter("Cause", cause);
		}
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
		if(error != null){
			putBodyParameter("Error", error);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getTaskToken() {
		return this.taskToken;
	}

	public void setTaskToken(String taskToken) {
		this.taskToken = taskToken;
		if(taskToken != null){
			putQueryParameter("TaskToken", taskToken);
		}
	}

	@Override
	public Class<ReportTaskFailedResponse> getResponseClass() {
		return ReportTaskFailedResponse.class;
	}

}
