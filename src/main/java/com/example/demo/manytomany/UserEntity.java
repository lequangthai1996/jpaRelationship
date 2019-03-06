package com.example.demo.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "S01DT_USER")
public class UserEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "LOGIN_ID", length = 10)
	private String loginId;

	@Column(name = "PASSWORD", length = 100)
	private String password;

	@Column(name = "FULL_NAME", length = 30)
	private String fullName;

	@Column(name = "PHONE", length = 20)
	private String phone;

	@Column(name = "FULL_ADDRESS", length = 60)
	private String fullAddress;

	@Column(name = "EMAIL", length = 80)
	private String email;

	@Column(name = "IS_LOCKED", columnDefinition = "Numeric(2,0) default '0'")
	private Integer isLocked;



	@OneToMany(mappedBy = "user")
	private List<UserNetworkEntity> userNetworks;

	@OneToOne(mappedBy = "user")
	private NetworkEntity network;

	/**
	 * @return the network
	 */
	public NetworkEntity getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(NetworkEntity network) {
		this.network = network;
	}

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param loginId
	 * @param password
	 * @param fullName
	 * @param phone
	 * @param fullAddress
	 * @param email
	 * @param isLocked
	 */
	public UserEntity(Long id, String loginId, String password, String fullName, String phone, String fullAddress,
			String email, Integer isLocked) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.fullName = fullName;
		this.phone = phone;
		this.fullAddress = fullAddress;
		this.email = email;
		this.isLocked = isLocked;
	}

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
	 * @return the loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the fullAddress
	 */
	public String getFullAddress() {
		return fullAddress;
	}

	/**
	 * @param fullAddress the fullAddress to set
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
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
	 * @return the isLocked
	 */
	public Integer getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setIsLocked(Integer isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * @return the userNetworks
	 */
	public List<UserNetworkEntity> getUserNetworks() {
		return userNetworks;
	}

	/**
	 * @param userNetworks the userNetworks to set
	 */
	public void setUserNetworks(List<UserNetworkEntity> userNetworks) {
		this.userNetworks = userNetworks;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
