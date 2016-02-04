package com.training.domain;

public class Patient implements Comparable<Patient> {

	private long patientId;
	private String patientName;
	private double patientPhoneNumber;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(long patientId, String patientName, double patientPhoneNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientPhoneNumber = patientPhoneNumber;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public double getPatientPhoneNumber() {
		return patientPhoneNumber;
	}

	public void setPatientPhoneNumber(double patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}

	@Override
	public int compareTo(Patient o) {
		if (patientId < o.patientId)
			return -1;
		if (patientId > o.patientId)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientPhoneNumber="
				+ patientPhoneNumber + "]";
	}

}
