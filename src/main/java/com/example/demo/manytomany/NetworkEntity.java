package com.example.demo.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "S04DT_NETWORK")
public class NetworkEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NETWORK_CODE", length = 8)
	private String networkCode;

	@Column(name = "NETWORK_NAME", length = 60)
	private String networkName;

	@Column(name = "MANAGER_NAME", length = 60)
	private String managerName;

	@Column(name = "PHONE_NO", length = 20)
	private String phoneNo;

	@Column(name = "EMAIL", length = 80)
	private String email;

	@Column(name = "POST_CODE", length = 8)
	private String postCode;

	@Column(name = "ADDRESS", length = 120)
	private String address;

	@OneToOne(optional = false)
	@JoinColumn(name = "USER_ID", foreignKey = @ForeignKey(name = "FK_S01DT_USER6"))
	private UserEntity user;

	@Column(name = "USE_SMARTPHONE", columnDefinition = "Numeric(2,0)")
	private Integer useSmartphone;

	@Column(name = "REGISTER_PATIENT", columnDefinition = "Numeric(2,0)")
	private Integer registerPatient;

	@Column(name = "INPUT_FROM_SCREEN", columnDefinition = "Numeric(2,0)")
	private Integer inputFromScreen;

	@OneToMany(mappedBy = "network")
	private List<UserNetworkEntity> usernetworks;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the networkCode
	 */
	public String getNetworkCode() {
		return networkCode;
	}

	/**
	 * @param networkCode the networkCode to set
	 */
	public void setNetworkCode(String networkCode) {
		this.networkCode = networkCode;
	}

	/**
	 * @return the networkName
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * @param networkName the networkName to set
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
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

	/**
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserEntity user) {
		this.user = user;
	}

	/**
	 * @return the useSmartphone
	 */
	public Integer getUseSmartphone() {
		return useSmartphone;
	}

	/**
	 * @param useSmartphone the useSmartphone to set
	 */
	public void setUseSmartphone(Integer useSmartphone) {
		this.useSmartphone = useSmartphone;
	}

	/**
	 * @return the registerPatient
	 */
	public Integer getRegisterPatient() {
		return registerPatient;
	}

	/**
	 * @param registerPatient the registerPatient to set
	 */
	public void setRegisterPatient(Integer registerPatient) {
		this.registerPatient = registerPatient;
	}

	/**
	 * @return the inputFromScreen
	 */
	public Integer getInputFromScreen() {
		return inputFromScreen;
	}

	/**
	 * @param inputFromScreen the inputFromScreen to set
	 */
	public void setInputFromScreen(Integer inputFromScreen) {
		this.inputFromScreen = inputFromScreen;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
