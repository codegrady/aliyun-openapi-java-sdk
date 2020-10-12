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

package com.aliyuncs.xtrace.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xtrace.transform.v20190808.ListSpanNamesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSpanNamesResponse extends AcsResponse {

	private String requestId;

	private List<String> spanNames;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getSpanNames() {
		return this.spanNames;
	}

	public void setSpanNames(List<String> spanNames) {
		this.spanNames = spanNames;
	}

	@Override
	public ListSpanNamesResponse getInstance(UnmarshallerContext context) {
		return	ListSpanNamesResponseUnmarshaller.unmarshall(this, context);
	}
}
