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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountsResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<Account> accountList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<Account> getAccountList() {
		return this.accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public static class Account {

		private String accountName;

		private String accountStatus;

		private String accountDescription;

		private String accountType;

		private List<DatabasePrivilege> databasePrivileges;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAccountDescription() {
			return this.accountDescription;
		}

		public void setAccountDescription(String accountDescription) {
			this.accountDescription = accountDescription;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public List<DatabasePrivilege> getDatabasePrivileges() {
			return this.databasePrivileges;
		}

		public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
			this.databasePrivileges = databasePrivileges;
		}

		public static class DatabasePrivilege {

			private String dBName;

			private String accountPrivilege;

			private String accountPrivilegeDetail;

			public String getDBName() {
				return this.dBName;
			}

			public void setDBName(String dBName) {
				this.dBName = dBName;
			}

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
			}

			public String getAccountPrivilegeDetail() {
				return this.accountPrivilegeDetail;
			}

			public void setAccountPrivilegeDetail(String accountPrivilegeDetail) {
				this.accountPrivilegeDetail = accountPrivilegeDetail;
			}
		}
	}

	@Override
	public DescribeAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountsResponseUnmarshaller.unmarshall(this, context);
	}
}
