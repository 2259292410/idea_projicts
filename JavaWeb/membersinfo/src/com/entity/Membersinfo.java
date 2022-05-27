package com.entity;

public class Membersinfo {
	private Integer id;
	private String mname;
	private String mgender;
	private String mage;
	private String maddress;
	private String memail;
	public Membersinfo(Integer id, String mname, String mgender, String mage,
			String maddress, String memail) {
		super();
		this.id = id;
		this.mname = mname;
		this.mgender = mgender;
		this.mage = mage;
		this.maddress = maddress;
		this.memail = memail;
	}
	public Membersinfo() {
		super();
	}
	@Override
	public String toString() {
		return "Membersinfo [id=" + id + ", mname=" + mname + ", mgender="
				+ mgender + ", mage=" + mage + ", maddress=" + maddress
				+ ", memail=" + memail + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMgender() {
		return mgender;
	}
	public void setMgender(String mgender) {
		this.mgender = mgender;
	}
	public String getMage() {
		return mage;
	}
	public void setMage(String mage) {
		this.mage = mage;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	
}
