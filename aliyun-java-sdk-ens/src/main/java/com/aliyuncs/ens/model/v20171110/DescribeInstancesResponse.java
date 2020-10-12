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
import com.aliyuncs.ens.transform.v20171110.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String instanceId;

		private String instanceName;

		private String ensRegionId;

		private String cpu;

		private Integer memory;

		private Integer disk;

		private Integer internetMaxBandwidthIn;

		private Integer internetMaxBandwidthOut;

		private String creationTime;

		private String status;

		private String hostName;

		private String imageId;

		private String expiredTime;

		private String instanceResourceType;

		private String specName;

		private String oSName;

		private List<DataDiskItem> dataDisk;

		private List<PublicIpAddress> publicIpAddresses;

		private List<PrivateIpAddress> privateIpAddresses;

		private List<String> securityGroupIds;

		private List<String> innerIpAddress;

		private List<String> publicIpAddress;

		private SystemDisk systemDisk;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public Integer getDisk() {
			return this.disk;
		}

		public void setDisk(Integer disk) {
			this.disk = disk;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getInstanceResourceType() {
			return this.instanceResourceType;
		}

		public void setInstanceResourceType(String instanceResourceType) {
			this.instanceResourceType = instanceResourceType;
		}

		public String getSpecName() {
			return this.specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public List<DataDiskItem> getDataDisk() {
			return this.dataDisk;
		}

		public void setDataDisk(List<DataDiskItem> dataDisk) {
			this.dataDisk = dataDisk;
		}

		public List<PublicIpAddress> getPublicIpAddresses() {
			return this.publicIpAddresses;
		}

		public void setPublicIpAddresses(List<PublicIpAddress> publicIpAddresses) {
			this.publicIpAddresses = publicIpAddresses;
		}

		public List<PrivateIpAddress> getPrivateIpAddresses() {
			return this.privateIpAddresses;
		}

		public void setPrivateIpAddresses(List<PrivateIpAddress> privateIpAddresses) {
			this.privateIpAddresses = privateIpAddresses;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public SystemDisk getSystemDisk() {
			return this.systemDisk;
		}

		public void setSystemDisk(SystemDisk systemDisk) {
			this.systemDisk = systemDisk;
		}

		public static class DataDiskItem {

			private String device_type;

			private Integer storage;

			private String uuid;

			private String disk_type;

			private String name;

			private String category;

			private Integer size;

			private String diskId;

			private String diskName;

			public String getDevice_type() {
				return this.device_type;
			}

			public void setDevice_type(String device_type) {
				this.device_type = device_type;
			}

			public Integer getStorage() {
				return this.storage;
			}

			public void setStorage(Integer storage) {
				this.storage = storage;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getDisk_type() {
				return this.disk_type;
			}

			public void setDisk_type(String disk_type) {
				this.disk_type = disk_type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}
		}

		public static class PublicIpAddress {

			private String ip;

			private String gateWay;

			private String isp;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getGateWay() {
				return this.gateWay;
			}

			public void setGateWay(String gateWay) {
				this.gateWay = gateWay;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}
		}

		public static class PrivateIpAddress {

			private String ip;

			private String gateWay;

			private String isp;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getGateWay() {
				return this.gateWay;
			}

			public void setGateWay(String gateWay) {
				this.gateWay = gateWay;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}
		}

		public static class SystemDisk {

			private String device_type;

			private Integer storage;

			private String uuid;

			private String disk_type;

			private String name;

			private String category;

			private Integer size;

			private String diskId;

			private String diskName;

			public String getDevice_type() {
				return this.device_type;
			}

			public void setDevice_type(String device_type) {
				this.device_type = device_type;
			}

			public Integer getStorage() {
				return this.storage;
			}

			public void setStorage(Integer storage) {
				this.storage = storage;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getDisk_type() {
				return this.disk_type;
			}

			public void setDisk_type(String disk_type) {
				this.disk_type = disk_type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
