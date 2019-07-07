package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PersonalId")
public class PersonalId {

	
	@Id
	@Column(name="person_id")
	private int personId;
	@Column(name="person_name")
	private String personeName;
	@Column(name="phone_no")
	private int proneNumber;
	@Column(name="religion")
	private String religion;
	@Column(name="on_duty")
	private String onDuty;
	@Column(name="occupation")
private String occupation;	
	@Column(name="to_give")
private String toGive;	
	@Column(name="to_ask")
	private String toAsk;
	@Column(name="hear_from_us")
	private String hearFromUs;
	
	public PersonalId() {
		super();
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersoneName() {
		return personeName;
	}

	public void setPersoneName(String personeName) {
		this.personeName = personeName;
	}

	public int getProneNumber() {
		return proneNumber;
	}

	public void setProneNumber(int proneNumber) {
		this.proneNumber = proneNumber;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getOnDuty() {
		return onDuty;
	}

	public void setOnDuty(String onDuty) {
		this.onDuty = onDuty;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getToGive() {
		return toGive;
	}

	public void setToGive(String toGive) {
		this.toGive = toGive;
	}

	public String getToAsk() {
		return toAsk;
	}

	public void setToAsk(String toAsk) {
		this.toAsk = toAsk;
	}

	public String getHearFromUs() {
		return hearFromUs;
	}

	public void setHearFromUs(String hearFromUs) {
		this.hearFromUs = hearFromUs;
	}
	
}
