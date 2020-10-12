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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinkaTaskstatisticsinfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinkaTaskstatisticsinfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorCode;

	private String errorMsg;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long codeLines;

		private Long contentLines;

		private Long costs;

		private Long duplicateCodeLines;

		private String message;

		private Long publicApis;

		private Long publicCommentedApis;

		private String status;

		private String taskId;

		public Long getCodeLines() {
			return this.codeLines;
		}

		public void setCodeLines(Long codeLines) {
			this.codeLines = codeLines;
		}

		public Long getContentLines() {
			return this.contentLines;
		}

		public void setContentLines(Long contentLines) {
			this.contentLines = contentLines;
		}

		public Long getCosts() {
			return this.costs;
		}

		public void setCosts(Long costs) {
			this.costs = costs;
		}

		public Long getDuplicateCodeLines() {
			return this.duplicateCodeLines;
		}

		public void setDuplicateCodeLines(Long duplicateCodeLines) {
			this.duplicateCodeLines = duplicateCodeLines;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getPublicApis() {
			return this.publicApis;
		}

		public void setPublicApis(Long publicApis) {
			this.publicApis = publicApis;
		}

		public Long getPublicCommentedApis() {
			return this.publicCommentedApis;
		}

		public void setPublicCommentedApis(Long publicCommentedApis) {
			this.publicCommentedApis = publicCommentedApis;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public QueryLinkeLinkaTaskstatisticsinfoResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinkaTaskstatisticsinfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
