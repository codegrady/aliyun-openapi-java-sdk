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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cspro.transform.v20180315.GetIndexBaselineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIndexBaselineResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String baselinePic;

		private String baselineSource;

		private Long checkId;

		public String getBaselinePic() {
			return this.baselinePic;
		}

		public void setBaselinePic(String baselinePic) {
			this.baselinePic = baselinePic;
		}

		public String getBaselineSource() {
			return this.baselineSource;
		}

		public void setBaselineSource(String baselineSource) {
			this.baselineSource = baselineSource;
		}

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}
	}

	@Override
	public GetIndexBaselineResponse getInstance(UnmarshallerContext context) {
		return	GetIndexBaselineResponseUnmarshaller.unmarshall(this, context);
	}
}
