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

package com.aliyuncs.idrsservice.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.JoinLiveResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class JoinLiveResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer code;

		private TokenData tokenData;

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public TokenData getTokenData() {
			return this.tokenData;
		}

		public void setTokenData(TokenData tokenData) {
			this.tokenData = tokenData;
		}

		public static class TokenData {

			private String appId;

			private String liveId;

			private String nonce;

			private Long timestamp;

			private String token;

			private String userId;

			private List<String> gslb;

			private Turn turn;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getLiveId() {
				return this.liveId;
			}

			public void setLiveId(String liveId) {
				this.liveId = liveId;
			}

			public String getNonce() {
				return this.nonce;
			}

			public void setNonce(String nonce) {
				this.nonce = nonce;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public List<String> getGslb() {
				return this.gslb;
			}

			public void setGslb(List<String> gslb) {
				this.gslb = gslb;
			}

			public Turn getTurn() {
				return this.turn;
			}

			public void setTurn(Turn turn) {
				this.turn = turn;
			}

			public static class Turn {

				private String password;

				private String username;

				public String getPassword() {
					return this.password;
				}

				public void setPassword(String password) {
					this.password = password;
				}

				public String getUsername() {
					return this.username;
				}

				public void setUsername(String username) {
					this.username = username;
				}
			}
		}
	}

	@Override
	public JoinLiveResponse getInstance(UnmarshallerContext context) {
		return	JoinLiveResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
