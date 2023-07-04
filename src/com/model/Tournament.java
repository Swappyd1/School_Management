package com.model;

public class Tournament 
{
	private int tournamentid;
	private String tournamentname, startdate, location, noofstudent;
	public int getTournamentid() {
		return tournamentid;
	}
	public void setTournamentid(int tournamentid) {
		this.tournamentid = tournamentid;
	}
	public String getTournamentname() {
		return tournamentname;
	}
	public void setTournamentname(String tournamentname) {
		this.tournamentname = tournamentname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNoofstudent() {
		return noofstudent;
	}
	public void setNoofstudent(String noofstudent) {
		this.noofstudent = noofstudent;
	}

}
