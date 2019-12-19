package com.cinema.dto;

public class User extends Person{
	private String userName;
	private String userPassword;
	private String nomComplet;

	public User(String dni, String nom, String llinatges, String email, String userName, String userPassword, String nomComplet) {
		super(dni, nom, llinatges, email);
		this.userName = userName;
		this.userPassword = userPassword;
		this.nomComplet = nomComplet;
	}

	
	/**
	 * @return the id
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param id the id to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the nom
	 */
	public String getNomComplet() {
		return nomComplet;
	}
	/**
	 * @param nomComplet the nom to set
	 */
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [" +
				"dni= " + this.getDni() +
				", nom= " + this.getNom() +
				", llinatges= " + this.getLlinatges() +
				", email= " + this.getEmail() +
				", id=" + userName + ", nomComplet=" + nomComplet + "]";
	}

}
