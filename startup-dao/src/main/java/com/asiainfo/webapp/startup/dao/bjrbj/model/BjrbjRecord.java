package com.asiainfo.webapp.startup.dao.bjrbj.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

//设置别名注解后，可以在Mapper.xml中直接使用，如parameterType="BjrbjRecord"
@Alias("BjrbjRecord")  
public class BjrbjRecord {
    
    private Integer id;
    private String phone;
    private String userName;
    private String idcardNo;
    private String sex;
    private String birthday;
    private String nation;
    private String country = "中国";
    private String certificateAddress;
    private String certificateZipCode;
    private String currentAddress;
    private String zipCode;
    private String education;
    private String maritalStatus;
    private String hospital1;
    private String hospital2;
    private String hospital3;
    private byte[] pic;
    private Date createTime;
    private Date updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdcardNo() {
		return idcardNo;
	}
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCertificateAddress() {
		return certificateAddress;
	}
	public void setCertificateAddress(String certificateAddress) {
		this.certificateAddress = certificateAddress;
	}
	public String getCertificateZipCode() {
		return certificateZipCode;
	}
	public void setCertificateZipCode(String certificateZipCode) {
		this.certificateZipCode = certificateZipCode;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getHospital1() {
		return hospital1;
	}
	public void setHospital1(String hospital1) {
		this.hospital1 = hospital1;
	}
	public String getHospital2() {
		return hospital2;
	}
	public void setHospital2(String hospital2) {
		this.hospital2 = hospital2;
	}
	public String getHospital3() {
		return hospital3;
	}
	public void setHospital3(String hospital3) {
		this.hospital3 = hospital3;
	}

	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
    
    
    
}