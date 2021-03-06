package com.jbk.hibernate;
// Generated 2 May, 2020 4:43:20 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Operator generated by hbm2java
 */
@Entity
@Table(name = "operator", catalog = "mvcwithhibernate")
public class Operator implements java.io.Serializable {

	private Integer id;
	private String person;
	private String for_;
	private String contact;
	private String timing;
	private String whatsupp;
	private String phonecall;
	private String sms;
	private String email;

	public Operator() {
	}

	public Operator(String person, String for_, String contact, String timing, String whatsupp, String phonecall,
			String sms, String email) {
		this.person = person;
		this.for_ = for_;
		this.contact = contact;
		this.timing = timing;
		this.whatsupp = whatsupp;
		this.phonecall = phonecall;
		this.sms = sms;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "person", nullable = false, length = 45)
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Column(name = "for", nullable = false, length = 45)
	public String getFor_() {
		return this.for_;
	}

	public void setFor_(String for_) {
		this.for_ = for_;
	}

	@Column(name = "contact", nullable = false, length = 45)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "timing", nullable = false, length = 45)
	public String getTiming() {
		return this.timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Column(name = "whatsupp", nullable = false, length = 45)
	public String getWhatsupp() {
		return this.whatsupp;
	}

	public void setWhatsupp(String whatsupp) {
		this.whatsupp = whatsupp;
	}

	@Column(name = "phonecall", nullable = false, length = 45)
	public String getPhonecall() {
		return this.phonecall;
	}

	public void setPhonecall(String phonecall) {
		this.phonecall = phonecall;
	}

	@Column(name = "sms", nullable = false, length = 45)
	public String getSms() {
		return this.sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Operator [id=" + id + ", person=" + person + ", for_=" + for_ + ", contact=" + contact + ", timing="
				+ timing + ", whatsupp=" + whatsupp + ", phonecall=" + phonecall + ", sms=" + sms + ", email=" + email
				+ "]";
	}

}
