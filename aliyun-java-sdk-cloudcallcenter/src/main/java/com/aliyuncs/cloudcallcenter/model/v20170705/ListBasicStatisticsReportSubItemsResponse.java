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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListBasicStatisticsReportSubItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBasicStatisticsReportSubItemsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private SubItems subItems;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public SubItems getSubItems() {
		return this.subItems;
	}

	public void setSubItems(SubItems subItems) {
		this.subItems = subItems;
	}

	public static class SubItems {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<BasicStatisticsReportSubItem> list;

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

		public List<BasicStatisticsReportSubItem> getList() {
			return this.list;
		}

		public void setList(List<BasicStatisticsReportSubItem> list) {
			this.list = list;
		}

		public static class BasicStatisticsReportSubItem {

			private String basicStatisticsReportSubItemName;

			private String value;

			private Integer count;

			private Integer percentage;

			private List<KeyValuePair> row;

			public String getBasicStatisticsReportSubItemName() {
				return this.basicStatisticsReportSubItemName;
			}

			public void setBasicStatisticsReportSubItemName(String basicStatisticsReportSubItemName) {
				this.basicStatisticsReportSubItemName = basicStatisticsReportSubItemName;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Integer getPercentage() {
				return this.percentage;
			}

			public void setPercentage(Integer percentage) {
				this.percentage = percentage;
			}

			public List<KeyValuePair> getRow() {
				return this.row;
			}

			public void setRow(List<KeyValuePair> row) {
				this.row = row;
			}

			public static class KeyValuePair {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListBasicStatisticsReportSubItemsResponse getInstance(UnmarshallerContext context) {
		return	ListBasicStatisticsReportSubItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
