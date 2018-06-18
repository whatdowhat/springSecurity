package com.demo.dooho.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Authorities")
public class Authorities {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long seq;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="role_id")
	private String role_id;

	@ManyToOne
	@JoinColumn(name="role_id",insertable=false,updatable=false)	
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="user_id",insertable=false,updatable=false)	
	private Role user;
 
	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Role getUser() {
		return user;
	}

	public void setUser(Role user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Authorities [seq=" + seq + ", userId=" + userId + ", role_id=" + role_id + ", role=" + role + ", user="
				+ user + ", getSeq()=" + getSeq() + ", getUserId()=" + getUserId() + ", getRole_id()=" + getRole_id()
				+ ", getRole()=" + getRole() + ", getUser()=" + getUser() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
