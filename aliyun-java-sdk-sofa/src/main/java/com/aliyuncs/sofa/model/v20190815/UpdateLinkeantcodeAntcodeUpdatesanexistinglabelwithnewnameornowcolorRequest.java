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
public class UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse> {
	   

	private String color;

	private String description;

	private String id;

	private String requestGitOperate;

	private String idOrName;

	private String newName;
	public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolor", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
		if(color != null){
			putBodyParameter("Color", color);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
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

	public String getIdOrName() {
		return this.idOrName;
	}

	public void setIdOrName(String idOrName) {
		this.idOrName = idOrName;
		if(idOrName != null){
			putBodyParameter("IdOrName", idOrName);
		}
	}

	public String getNewName() {
		return this.newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
		if(newName != null){
			putBodyParameter("NewName", newName);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse.class;
	}

}
