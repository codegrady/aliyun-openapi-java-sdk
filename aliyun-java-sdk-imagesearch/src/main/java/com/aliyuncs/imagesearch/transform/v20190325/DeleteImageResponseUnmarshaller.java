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

package com.aliyuncs.imagesearch.transform.v20190325;

import com.aliyuncs.imagesearch.model.v20190325.DeleteImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteImageResponseUnmarshaller {

	public static DeleteImageResponse unmarshall(DeleteImageResponse deleteImageResponse, UnmarshallerContext context) {
		
		deleteImageResponse.setRequestId(context.stringValue("DeleteImageResponse.RequestId"));
		deleteImageResponse.setSuccess(context.booleanValue("DeleteImageResponse.Success"));
		deleteImageResponse.setMessage(context.stringValue("DeleteImageResponse.Message"));
		deleteImageResponse.setCode(context.integerValue("DeleteImageResponse.Code"));
	 
	 	return deleteImageResponse;
	}
}