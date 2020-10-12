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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeSuspiciousUUIDConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspiciousUUIDConfigResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<String> uUIDList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<String> getUUIDList() {
		return this.uUIDList;
	}

	public void setUUIDList(List<String> uUIDList) {
		this.uUIDList = uUIDList;
	}

	@Override
	public DescribeSuspiciousUUIDConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspiciousUUIDConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
