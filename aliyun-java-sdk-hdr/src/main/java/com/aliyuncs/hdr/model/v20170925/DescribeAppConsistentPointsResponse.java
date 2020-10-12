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

package com.aliyuncs.hdr.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeAppConsistentPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppConsistentPointsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private List<AppConsistentPoint> appConsistentPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AppConsistentPoint> getAppConsistentPoints() {
		return this.appConsistentPoints;
	}

	public void setAppConsistentPoints(List<AppConsistentPoint> appConsistentPoints) {
		this.appConsistentPoints = appConsistentPoints;
	}

	public static class AppConsistentPoint {

		private Long snapshotTime;

		private String snapshotId;

		public Long getSnapshotTime() {
			return this.snapshotTime;
		}

		public void setSnapshotTime(Long snapshotTime) {
			this.snapshotTime = snapshotTime;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}
	}

	@Override
	public DescribeAppConsistentPointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppConsistentPointsResponseUnmarshaller.unmarshall(this, context);
	}
}
