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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListBackupsRequest extends RpcAcsRequest<ListBackupsResponse> {
	   

	private Long resourceOwnerId;

	private Integer pageCount;

	private String orderMode;

	private String backupPlanId;

	private Integer pageNumber;

	private Integer limit;

	private Integer pageSize;

	private String serviceName;

	private Long id;

	private Integer currentSize;

	private List<String> backupIds;

	private String clusterId;

	private String metadataType;

	private String bizId;

	private String status;
	public ListBackupsRequest() {
		super("Emr", "2016-04-08", "ListBackups");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
		if(pageCount != null){
			putQueryParameter("PageCount", pageCount.toString());
		}
	}

	public String getOrderMode() {
		return this.orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
		if(orderMode != null){
			putQueryParameter("OrderMode", orderMode);
		}
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
		if(backupPlanId != null){
			putQueryParameter("BackupPlanId", backupPlanId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Integer getCurrentSize() {
		return this.currentSize;
	}

	public void setCurrentSize(Integer currentSize) {
		this.currentSize = currentSize;
		if(currentSize != null){
			putQueryParameter("CurrentSize", currentSize.toString());
		}
	}

	public List<String> getBackupIds() {
		return this.backupIds;
	}

	public void setBackupIds(List<String> backupIds) {
		this.backupIds = backupIds;	
		if (backupIds != null) {
			for (int i = 0; i < backupIds.size(); i++) {
				putQueryParameter("BackupId." + (i + 1) , backupIds.get(i));
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getMetadataType() {
		return this.metadataType;
	}

	public void setMetadataType(String metadataType) {
		this.metadataType = metadataType;
		if(metadataType != null){
			putQueryParameter("MetadataType", metadataType);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListBackupsResponse> getResponseClass() {
		return ListBackupsResponse.class;
	}

}
