package com.example.book.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@Column(name = "Rllo_number")
	private Long enrollmentNumber;
	@Column(name = "My_name")
	private String name;
	@Column(name = "My_age")
	private Integer age;
	private Long className;
	@Temporal(TemporalType.TIMESTAMP)
	private Date admissionDate;
	private String fatherName;
	private Long mobileNumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private AddressEntity addressEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(Long enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getClassName() {
		return className;
	}

	public void setClassName(Long className) {
		this.className = className;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", enrollmentNumber=" + enrollmentNumber + ", name=" + name + ", age=" + age
				+ ", className=" + className + ", admissionDate=" + admissionDate + ", fatherName=" + fatherName
				+ ", mobileNumber=" + mobileNumber + ", addressEntity=" + addressEntity + "]";
	}

}
