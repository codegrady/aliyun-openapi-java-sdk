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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDatabaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDatabaseResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Database database;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Database getDatabase() {
		return this.database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public static class Database {

		private String instanceId;

		private String databaseId;

		private String envType;

		private String schemaName;

		private String catalogName;

		private String encoding;

		private String searchName;

		private String state;

		private String dbType;

		private String host;

		private Integer port;

		private String sid;

		private String dbaName;

		private String dbaId;

		private List<String> ownerIdList;

		private List<String> ownerNameList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDatabaseId() {
			return this.databaseId;
		}

		public void setDatabaseId(String databaseId) {
			this.databaseId = databaseId;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getCatalogName() {
			return this.catalogName;
		}

		public void setCatalogName(String catalogName) {
			this.catalogName = catalogName;
		}

		public String getEncoding() {
			return this.encoding;
		}

		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}

		public String getSearchName() {
			return this.searchName;
		}

		public void setSearchName(String searchName) {
			this.searchName = searchName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getSid() {
			return this.sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getDbaName() {
			return this.dbaName;
		}

		public void setDbaName(String dbaName) {
			this.dbaName = dbaName;
		}

		public String getDbaId() {
			return this.dbaId;
		}

		public void setDbaId(String dbaId) {
			this.dbaId = dbaId;
		}

		public List<String> getOwnerIdList() {
			return this.ownerIdList;
		}

		public void setOwnerIdList(List<String> ownerIdList) {
			this.ownerIdList = ownerIdList;
		}

		public List<String> getOwnerNameList() {
			return this.ownerNameList;
		}

		public void setOwnerNameList(List<String> ownerNameList) {
			this.ownerNameList = ownerNameList;
		}
	}

	@Override
	public GetDatabaseResponse getInstance(UnmarshallerContext context) {
		return	GetDatabaseResponseUnmarshaller.unmarshall(this, context);
	}
}
