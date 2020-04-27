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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddPackageSnapshotRequest extends RoaAcsRequest<AddPackageSnapshotResponse> {
	   
	public AddPackageSnapshotRequest() {
		super("LRG", "2019-10-10", "AddPackageSnapshot");
		setUriPattern("/api/v2/package-snapshot");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<AddPackageSnapshotResponse> getResponseClass() {
		return AddPackageSnapshotResponse.class;
	}

}
