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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutAonetenantpathiterationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutAonetenantpathiterationsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String code;

	private String message;

	private Long responseStatusCode;

	private List<ResultsItem> results;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public List<ResultsItem> getResults() {
		return this.results;
	}

	public void setResults(List<ResultsItem> results) {
		this.results = results;
	}

	public static class ResultsItem {

		private String text;

		private String url;

		private String value;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public GetLinkeBahamutAonetenantpathiterationsResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutAonetenantpathiterationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
