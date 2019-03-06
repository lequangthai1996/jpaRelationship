package com.example.demo.manytomany;

import javax.persistence.*;

@Entity
@Table(name = "S06DT_USER_NETWORK")
public class UserNetworkEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "USER_ID", foreignKey = @ForeignKey(name = "FK_S01DT_USER3"))
	private UserEntity user;

	@ManyToOne(optional = false)
	@JoinColumn(name = "NETWORK_ID", foreignKey = @ForeignKey(name = "FK_S04DT_NETWORK1"))
	private NetworkEntity network;

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

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
