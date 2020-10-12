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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.DeleteDiversifyResponse;
import com.aliyuncs.airec.model.v20181012.DeleteDiversifyResponse.Result;
import com.aliyuncs.airec.model.v20181012.DeleteDiversifyResponse.Result.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDiversifyResponseUnmarshaller {

	public static DeleteDiversifyResponse unmarshall(DeleteDiversifyResponse deleteDiversifyResponse, UnmarshallerContext _ctx) {
		
		deleteDiversifyResponse.setRequestId(_ctx.stringValue("DeleteDiversifyResponse.RequestId"));
		deleteDiversifyResponse.setCode(_ctx.stringValue("DeleteDiversifyResponse.Code"));
		deleteDiversifyResponse.setMessage(_ctx.stringValue("DeleteDiversifyResponse.Message"));

		Result result = new Result();
		result.setName(_ctx.stringValue("DeleteDiversifyResponse.Result.Name"));
		result.setGmtCreate(_ctx.stringValue("DeleteDiversifyResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("DeleteDiversifyResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();
		parameter.setCategoryIndex(_ctx.integerValue("DeleteDiversifyResponse.Result.Parameter.CategoryIndex"));
		parameter.setWindow(_ctx.integerValue("DeleteDiversifyResponse.Result.Parameter.Window"));
		result.setParameter(parameter);
		deleteDiversifyResponse.setResult(result);
	 
	 	return deleteDiversifyResponse;
	}
}