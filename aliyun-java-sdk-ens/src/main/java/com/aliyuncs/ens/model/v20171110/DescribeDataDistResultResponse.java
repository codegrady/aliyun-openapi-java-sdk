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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeDataDistResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataDistResultResponse extends AcsResponse {

	private String requestId;

	private String requestId1;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DistResult> distResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestId1() {
		return this.requestId1;
	}

	public void setRequestId1(String requestId1) {
		this.requestId1 = requestId1;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<DistResult> getDistResults() {
		return this.distResults;
	}

	public void setDistResults(List<DistResult> distResults) {
		this.distResults = distResults;
	}

	public static class DistResult {

		private String version;

		private String name;

		private List<StatusStat> statusStats;

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<StatusStat> getStatusStats() {
			return this.statusStats;
		}

		public void setStatusStats(List<StatusStat> statusStats) {
			this.statusStats = statusStats;
		}

		public static class StatusStat {

			private String status;

			private String instanceCount;

			private List<Instance> instances;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getInstanceCount() {
				return this.instanceCount;
			}

			public void setInstanceCount(String instanceCount) {
				this.instanceCount = instanceCount;
			}

			public List<Instance> getInstances() {
				return this.instances;
			}

			public void setInstances(List<Instance> instances) {
				this.instances = instances;
			}

			public static class Instance {

				private String instanceId;

				private String startTime;

				private String updateTime;

				private String statusDescrip;

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(String updateTime) {
					this.updateTime = updateTime;
				}

				public String getStatusDescrip() {
					return this.statusDescrip;
				}

				public void setStatusDescrip(String statusDescrip) {
					this.statusDescrip = statusDescrip;
				}
			}
		}
	}

	@Override
	public DescribeDataDistResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataDistResultResponseUnmarshaller.unmarshall(this, context);
	}
}
