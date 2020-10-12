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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.InsertRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertRoleResponseUnmarshaller {

	public static InsertRoleResponse unmarshall(InsertRoleResponse insertRoleResponse, UnmarshallerContext _ctx) {
		
		insertRoleResponse.setRequestId(_ctx.stringValue("InsertRoleResponse.RequestId"));
		insertRoleResponse.setCode(_ctx.integerValue("InsertRoleResponse.Code"));
		insertRoleResponse.setMessage(_ctx.stringValue("InsertRoleResponse.Message"));
		insertRoleResponse.setRoleId(_ctx.integerValue("InsertRoleResponse.RoleId"));
	 
	 	return insertRoleResponse;
	}
}