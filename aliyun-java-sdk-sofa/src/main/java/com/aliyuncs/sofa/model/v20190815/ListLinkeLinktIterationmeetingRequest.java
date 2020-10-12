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
public class ListLinkeLinktIterationmeetingRequest extends RpcAcsRequest<ListLinkeLinktIterationmeetingResponse> {
	   

	private String iterationSign;

	private String length;

	private String begin;
	public ListLinkeLinktIterationmeetingRequest() {
		super("SOFA", "2019-08-15", "ListLinkeLinktIterationmeeting", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIterationSign() {
		return this.iterationSign;
	}

	public void setIterationSign(String iterationSign) {
		this.iterationSign = iterationSign;
		if(iterationSign != null){
			putBodyParameter("IterationSign", iterationSign);
		}
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
		if(length != null){
			putBodyParameter("Length", length);
		}
	}

	public String getBegin() {
		return this.begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
		if(begin != null){
			putBodyParameter("Begin", begin);
		}
	}

	@Override
	public Class<ListLinkeLinktIterationmeetingResponse> getResponseClass() {
		return ListLinkeLinktIterationmeetingResponse.class;
	}

}
