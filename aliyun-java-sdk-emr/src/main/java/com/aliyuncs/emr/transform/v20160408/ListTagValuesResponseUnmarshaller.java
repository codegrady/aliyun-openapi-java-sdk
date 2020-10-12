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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListTagValuesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagValuesResponseUnmarshaller {

	public static ListTagValuesResponse unmarshall(ListTagValuesResponse listTagValuesResponse, UnmarshallerContext _ctx) {
		
		listTagValuesResponse.setRequestId(_ctx.stringValue("ListTagValuesResponse.RequestId"));
		listTagValuesResponse.setCode(_ctx.stringValue("ListTagValuesResponse.Code"));
		listTagValuesResponse.setMessage(_ctx.stringValue("ListTagValuesResponse.Message"));
		listTagValuesResponse.setSuccess(_ctx.booleanValue("ListTagValuesResponse.Success"));
		listTagValuesResponse.setNextToken(_ctx.stringValue("ListTagValuesResponse.NextToken"));
		listTagValuesResponse.setPageSize(_ctx.integerValue("ListTagValuesResponse.PageSize"));
		listTagValuesResponse.setTotalCount(_ctx.integerValue("ListTagValuesResponse.TotalCount"));

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTagValuesResponse.Values.Length"); i++) {
			values.add(_ctx.stringValue("ListTagValuesResponse.Values["+ i +"]"));
		}
		listTagValuesResponse.setValues(values);
	 
	 	return listTagValuesResponse;
	}
}