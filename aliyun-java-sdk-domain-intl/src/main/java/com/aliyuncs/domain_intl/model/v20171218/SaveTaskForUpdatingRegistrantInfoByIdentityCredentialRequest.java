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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest extends RpcAcsRequest<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> {
	
	public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest() {
		super("Domain-intl", "2017-12-18", "SaveTaskForUpdatingRegistrantInfoByIdentityCredential", "domain");
		setMethod(MethodType.POST);
	}

	private String country;

	private String identityCredentialType;

	private String address;

	private String telArea;

	private String city;

	private String registrantType;

	private List<String> domainNames;

	private String identityCredential;

	private String telephone;

	private Boolean transferOutProhibited;

	private String registrantOrganization;

	private String telExt;

	private String province;

	private String postalCode;

	private String userClientIp;

	private String lang;

	private String identityCredentialNo;

	private String email;

	private String registrantName;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public String getIdentityCredentialType() {
		return this.identityCredentialType;
	}

	public void setIdentityCredentialType(String identityCredentialType) {
		this.identityCredentialType = identityCredentialType;
		if(identityCredentialType != null){
			putQueryParameter("IdentityCredentialType", identityCredentialType);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getTelArea() {
		return this.telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
		if(telArea != null){
			putQueryParameter("TelArea", telArea);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getRegistrantType() {
		return this.registrantType;
	}

	public void setRegistrantType(String registrantType) {
		this.registrantType = registrantType;
		if(registrantType != null){
			putQueryParameter("RegistrantType", registrantType);
		}
	}

	public List<String> getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(List<String> domainNames) {
		this.domainNames = domainNames;	
		if (domainNames != null) {
			for (int i = 0; i < domainNames.size(); i++) {
				putQueryParameter("DomainName." + (i + 1) , domainNames.get(i));
			}
		}	
	}

	public String getIdentityCredential() {
		return this.identityCredential;
	}

	public void setIdentityCredential(String identityCredential) {
		this.identityCredential = identityCredential;
		if(identityCredential != null){
			putBodyParameter("IdentityCredential", identityCredential);
		}
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
		if(telephone != null){
			putQueryParameter("Telephone", telephone);
		}
	}

	public Boolean getTransferOutProhibited() {
		return this.transferOutProhibited;
	}

	public void setTransferOutProhibited(Boolean transferOutProhibited) {
		this.transferOutProhibited = transferOutProhibited;
		if(transferOutProhibited != null){
			putQueryParameter("TransferOutProhibited", transferOutProhibited.toString());
		}
	}

	public String getRegistrantOrganization() {
		return this.registrantOrganization;
	}

	public void setRegistrantOrganization(String registrantOrganization) {
		this.registrantOrganization = registrantOrganization;
		if(registrantOrganization != null){
			putQueryParameter("RegistrantOrganization", registrantOrganization);
		}
	}

	public String getTelExt() {
		return this.telExt;
	}

	public void setTelExt(String telExt) {
		this.telExt = telExt;
		if(telExt != null){
			putQueryParameter("TelExt", telExt);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		if(postalCode != null){
			putQueryParameter("PostalCode", postalCode);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getIdentityCredentialNo() {
		return this.identityCredentialNo;
	}

	public void setIdentityCredentialNo(String identityCredentialNo) {
		this.identityCredentialNo = identityCredentialNo;
		if(identityCredentialNo != null){
			putQueryParameter("IdentityCredentialNo", identityCredentialNo);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getRegistrantName() {
		return this.registrantName;
	}

	public void setRegistrantName(String registrantName) {
		this.registrantName = registrantName;
		if(registrantName != null){
			putQueryParameter("RegistrantName", registrantName);
		}
	}

	@Override
	public Class<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> getResponseClass() {
		return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse.class;
	}

}
