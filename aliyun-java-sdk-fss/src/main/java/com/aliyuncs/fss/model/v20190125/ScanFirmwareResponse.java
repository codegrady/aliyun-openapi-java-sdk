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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.fss.transform.v20190125.ScanFirmwareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScanFirmwareResponse extends AcsResponse {

	private String requestId;

	private String data;

	private Integer fssCode;

	private String fssMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getFssCode() {
		return this.fssCode;
	}

	public void setFssCode(Integer fssCode) {
		this.fssCode = fssCode;
	}

	public String getFssMessage() {
		return this.fssMessage;
	}

	public void setFssMessage(String fssMessage) {
		this.fssMessage = fssMessage;
	}

	@Override
	public ScanFirmwareResponse getInstance(UnmarshallerContext context) {
		return	ScanFirmwareResponseUnmarshaller.unmarshall(this, context);
	}
}
