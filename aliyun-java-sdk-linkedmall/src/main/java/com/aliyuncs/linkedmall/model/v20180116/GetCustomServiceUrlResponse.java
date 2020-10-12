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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.GetCustomServiceUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomServiceUrlResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private UrlData urlData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public UrlData getUrlData() {
		return this.urlData;
	}

	public void setUrlData(UrlData urlData) {
		this.urlData = urlData;
	}

	public static class UrlData {

		private String returnUrl;

		public String getReturnUrl() {
			return this.returnUrl;
		}

		public void setReturnUrl(String returnUrl) {
			this.returnUrl = returnUrl;
		}
	}

	@Override
	public GetCustomServiceUrlResponse getInstance(UnmarshallerContext context) {
		return	GetCustomServiceUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
