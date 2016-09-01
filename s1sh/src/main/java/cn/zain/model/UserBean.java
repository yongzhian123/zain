/**
 * UserBean.java V1.0 2014-9-23 下午9:42:32 
 * Copyright reapfruit Co. ,Ltd. All rights reserved.  
 * Author: yongzhian
 * Description:
 */

package cn.zain.model;

public class UserBean {
	private Integer id;
	private String userName;
	private String className;
	private String gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.userName + "  " + this.className + "  " + this.gender;

	}
}
