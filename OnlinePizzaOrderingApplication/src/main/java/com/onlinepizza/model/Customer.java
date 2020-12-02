package com.onlinepizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
@SequenceGenerator(name="sequence", initialValue = 1,allocationSize = 100)
public class Customer implements Serializable {

	/**
	 * Author Sriragavendran
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence")
	@Column
	private Integer customerId;
	@Column
	private String customerName;
	@Column
	private Long customerMobile;
	@Column
	private String customerEmail;
	@Column
	private String customerAddress;
	@Column
	private String userName;
	@Column
	private String password;
	
	/**
	 * Default constructor
	 */
	
	public Customer() {
		
	}
	
	/**
	 * Parameterized constructor 
	 * @param customerId
	 * @param customerName
	 * @param customerMobile
	 * @param customerMail
	 * @param customerAddress
	 * @param userName
	 * @param password
	 */

	public Customer(String customerName, Long customerMobile, String customerEmail,
			String customerAddress, String userName, String password) {
		super();
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.userName = userName;
		this.password = password;
	}
	/**
	 * Getters and Setters
	 * 
	 */

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(Long customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobile="
				+ customerMobile + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress
				+ ", userName=" + userName + ", password=" + password + "]";
	}
}