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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.DeleteDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDatabaseResponseUnmarshaller {

	public static DeleteDatabaseResponse unmarshall(DeleteDatabaseResponse deleteDatabaseResponse, UnmarshallerContext _ctx) {
		
		deleteDatabaseResponse.setRequestId(_ctx.stringValue("DeleteDatabaseResponse.RequestId"));
		deleteDatabaseResponse.setCode(_ctx.integerValue("DeleteDatabaseResponse.Code"));
		deleteDatabaseResponse.setErrMsg(_ctx.stringValue("DeleteDatabaseResponse.ErrMsg"));
	 
	 	return deleteDatabaseResponse;
	}
}