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
public class CreateLinkeantcodeAntcodeProjecttagRequest extends RpcAcsRequest<CreateLinkeantcodeAntcodeProjecttagResponse> {
	   

	private String ref;

	private String tagName;

	private String releaseDescription;

	private String id;

	private String requestGitOperate;

	private String message;
	public CreateLinkeantcodeAntcodeProjecttagRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeantcodeAntcodeProjecttag", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
		if(ref != null){
			putBodyParameter("Ref", ref);
		}
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		if(tagName != null){
			putBodyParameter("TagName", tagName);
		}
	}

	public String getReleaseDescription() {
		return this.releaseDescription;
	}

	public void setReleaseDescription(String releaseDescription) {
		this.releaseDescription = releaseDescription;
		if(releaseDescription != null){
			putBodyParameter("ReleaseDescription", releaseDescription);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putBodyParameter("Message", message);
		}
	}

	@Override
	public Class<CreateLinkeantcodeAntcodeProjecttagResponse> getResponseClass() {
		return CreateLinkeantcodeAntcodeProjecttagResponse.class;
	}

}
