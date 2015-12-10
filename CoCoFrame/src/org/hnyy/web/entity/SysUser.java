package org.hnyy.web.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**   
 * @Title:SysUser表
 * @Description: 系统用户表
 * @date 2014-06-07
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SysUser implements Serializable{
	private String id;//主键
	private String createBy;//创建者
	private String createName;//创建者名
	private Date createDate;//创建时间
	private Date updateDate;//更新时间
	private String updateBy;//更新者
	private String updateName;//更新者名
	private String userName;//   用户名
	
	private String isAuth;
	
	private String barnNo;// 分配的仓房编号
	
	
	private String fileName;
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * @return the isAuth
	 */
	public String getIsAuth() {
		return isAuth;
	}
	/**
	 * @param isAuth the isAuth to set
	 */
	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	public String getUserName() {
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public String getSignatureFile() {
	public String getBarnNo() {
		return barnNo;
	}
	public void setBarnNo(String barnNo) {
		this.barnNo = barnNo;
	}
	
	
	
	
	

}