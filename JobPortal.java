package com.xworkz.test.things;

public class JobPortal {
	private String portalName;
	private int totalJobPortal;
	private String jobPlace;
	private Naukri naukri;
	private Linkdin linkdin;
	
	public JobPortal() {
		System.out.println("no args constructor");
	}

	public JobPortal(String portalName, int totalJobPortal, String jobPlace, Naukri naukri, Linkdin linkdin) {
		System.out.println("all args constructor");
		this.portalName = portalName;
		this.totalJobPortal = totalJobPortal;
		this.jobPlace = jobPlace;
		this.naukri = naukri;
		this.linkdin = linkdin;
	}

	public void setPoratlName(String portalName) {
		this.portalName = portalName;
	}

	public void setTotalJobPortal(int totalJobPortal) {
		this.totalJobPortal = totalJobPortal;
	}

	public void setJobPlace(String jobPlace) {
		this.jobPlace = jobPlace;
	}

	public void setNaukri(Naukri naukri) {
		this.naukri = naukri;
	}

	public void setLinkdin(Linkdin linkdin) {
		this.linkdin = linkdin;
	}

	public String getPortalName() {
		return portalName;
	}

	public int getTotalJobPortal() {
		return totalJobPortal;
	}

	public String getJobPlace() {
		return jobPlace;
	}

	public Naukri getNaukri() {
		return naukri;
	}

	public Linkdin getLinkdin() {
		return linkdin;
	}
}
