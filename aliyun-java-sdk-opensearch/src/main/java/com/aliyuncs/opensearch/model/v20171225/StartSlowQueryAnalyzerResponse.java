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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.StartSlowQueryAnalyzerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartSlowQueryAnalyzerResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getResult() {
		return this.result;
	}

	public void setResult(Map<Object,Object> result) {
		this.result = result;
	}

	@Override
	public StartSlowQueryAnalyzerResponse getInstance(UnmarshallerContext context) {
		return	StartSlowQueryAnalyzerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
