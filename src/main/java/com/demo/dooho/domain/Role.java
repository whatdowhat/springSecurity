package com.demo.dooho.domain;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {

	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long role_id;
	
	@Column(name="role_name")
	private String role_name;

	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="role")
	private List<Authorities> authorities = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + ", authorities=" + authorities
				+ ", getAuthorities()=" + getAuthorities() + ", getRole_id()=" + getRole_id() + ", getRole_name()="
				+ getRole_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public List<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authorities> authorities) {
		this.authorities = authorities;
	}

	public long getRole_id() {
		return role_id;
	}

	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
	
	
}
