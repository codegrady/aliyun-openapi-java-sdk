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

package com.aliyuncs.cloudesl.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20190801.DescribeEslDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEslDevicesResponse extends AcsResponse {

	private String errorMessage;

	private String errorCode;

	private Integer pageSize;

	private String message;

	private Integer totalCount;

	private String dynamicCode;

	private String code;

	private Integer pageNumber;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private List<EslDeviceInfo> eslDevices;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

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

	public List<EslDeviceInfo> getEslDevices() {
		return this.eslDevices;
	}

	public void setEslDevices(List<EslDeviceInfo> eslDevices) {
		this.eslDevices = eslDevices;
	}

	public static class EslDeviceInfo {

		private Boolean beBind;

		private String positionCode;

		private String eslStatus;

		private String storeId;

		private String type;

		private String mac;

		private Integer itemActionPrice;

		private String connectAp;

		private String itemPriceUnit;

		private String shelfCode;

		private Integer screenWidth;

		private String itemTitle;

		private Integer screenHeight;

		private String lastCommunicateTime;

		private String model;

		private String eslBarCode;

		private Integer batteryLevel;

		private String itemBarCode;

		private Long itemId;

		private String companyId;

		private String vendor;

		public Boolean getBeBind() {
			return this.beBind;
		}

		public void setBeBind(Boolean beBind) {
			this.beBind = beBind;
		}

		public String getPositionCode() {
			return this.positionCode;
		}

		public void setPositionCode(String positionCode) {
			this.positionCode = positionCode;
		}

		public String getEslStatus() {
			return this.eslStatus;
		}

		public void setEslStatus(String eslStatus) {
			this.eslStatus = eslStatus;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public Integer getItemActionPrice() {
			return this.itemActionPrice;
		}

		public void setItemActionPrice(Integer itemActionPrice) {
			this.itemActionPrice = itemActionPrice;
		}

		public String getConnectAp() {
			return this.connectAp;
		}

		public void setConnectAp(String connectAp) {
			this.connectAp = connectAp;
		}

		public String getItemPriceUnit() {
			return this.itemPriceUnit;
		}

		public void setItemPriceUnit(String itemPriceUnit) {
			this.itemPriceUnit = itemPriceUnit;
		}

		public String getShelfCode() {
			return this.shelfCode;
		}

		public void setShelfCode(String shelfCode) {
			this.shelfCode = shelfCode;
		}

		public Integer getScreenWidth() {
			return this.screenWidth;
		}

		public void setScreenWidth(Integer screenWidth) {
			this.screenWidth = screenWidth;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public Integer getScreenHeight() {
			return this.screenHeight;
		}

		public void setScreenHeight(Integer screenHeight) {
			this.screenHeight = screenHeight;
		}

		public String getLastCommunicateTime() {
			return this.lastCommunicateTime;
		}

		public void setLastCommunicateTime(String lastCommunicateTime) {
			this.lastCommunicateTime = lastCommunicateTime;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public Integer getBatteryLevel() {
			return this.batteryLevel;
		}

		public void setBatteryLevel(Integer batteryLevel) {
			this.batteryLevel = batteryLevel;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getCompanyId() {
			return this.companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}
	}

	@Override
	public DescribeEslDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEslDevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
