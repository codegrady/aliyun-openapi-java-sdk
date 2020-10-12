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

package com.aliyuncs.oam.model.v20170101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oam.transform.v20170101.ListTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTagResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<OamMutexTagResult> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OamMutexTagResult> getData() {
		return this.data;
	}

	public void setData(List<OamMutexTagResult> data) {
		this.data = data;
	}

	public static class OamMutexTagResult {

		private String tagId;

		private String description;

		private String name;

		private String userId;

		private String gmtCreated;

		private String gmtModified;

		private String userModified;

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getUserModified() {
			return this.userModified;
		}

		public void setUserModified(String userModified) {
			this.userModified = userModified;
		}
	}

	@Override
	public ListTagResponse getInstance(UnmarshallerContext context) {
		return	ListTagResponseUnmarshaller.unmarshall(this, context);
	}
}
