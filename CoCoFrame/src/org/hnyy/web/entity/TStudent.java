/**
 * Copyright (C) 2015 CoCoCoder
 *
 *
 * @className:org.hnyy.web.entity.TStudent
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:谢达
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015年12月9日     谢达       v1.0.0        create
 *
 *
 */
package org.hnyy.web.entity;
public class TStudent {
	/**主键id**/
	private Integer id;
	/**姓名**/
	private String stu_name;
	/**性别**/
	private Integer gender;
	/**年龄**/
	private Integer age;
	/**地址**/
	private String address;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the gender
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * @return the stu_name
	 */
	public String getStu_name() {
		return stu_name;
	}
	/**
	 * @param stu_name the stu_name to set
	 */
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
