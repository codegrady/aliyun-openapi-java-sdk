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

package com.aliyuncs.gdb.transform.v20181129;

import com.aliyuncs.gdb.model.v20181129.DescribeBackupTasksResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupTasksResponseUnmarshaller {

	public static DescribeBackupTasksResponse unmarshall(DescribeBackupTasksResponse describeBackupTasksResponse, UnmarshallerContext context) {
		
		describeBackupTasksResponse.setRequestId(context.stringValue("DescribeBackupTasksResponse.RequestId"));
		describeBackupTasksResponse.setCode(context.stringValue("DescribeBackupTasksResponse.Code"));
		describeBackupTasksResponse.setData(context.stringValue("DescribeBackupTasksResponse.Data"));
		describeBackupTasksResponse.setMessage(context.stringValue("DescribeBackupTasksResponse.Message"));
		describeBackupTasksResponse.setSuccess(context.stringValue("DescribeBackupTasksResponse.Success"));
		describeBackupTasksResponse.setSynchro(context.stringValue("DescribeBackupTasksResponse.Synchro"));
	 
	 	return describeBackupTasksResponse;
	}
}