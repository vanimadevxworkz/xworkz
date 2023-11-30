package com.xworkz.musicalnight.dto;

public class MusicalNightDto {
	
	private String posterName;
	private int numOfDj;
	private String partyName;
	private String djName;
	private int totalPeople;
	private int entryFees;
	private boolean isGood;
	private double time;
	private String date;
	private String day;
	private String organisedName;
	private String guestName;
	private String gameName;
	private String type;
	private boolean isCollegeFest;
	private String latestSong;
	private int numOfEquipment;
	private String atomosphere;
	private int incomeOfDj;
	private String groupName;
	private boolean isProfeesional;
	private String singerName;
	private String bestDjName;
	private String place;
	private int djPrice;
	
	
	public MusicalNightDto() {
		System.out.println("this is no-args constructor");
	}


	public MusicalNightDto(String posterName, int numOfDj, String partyName, String djName, int totalPeople,
			int entryFees, boolean isGood, double time, String date, String day, String organisedName, String guestName,
			String gameName, String type, boolean isCollegeFest, String latestSong, int numOfEquipment,
			String atomosphere, int incomeOfDj, String groupName, boolean isProfeesional, String singerName,
			String bestDjName, String place, int djPrice) {
		System.out.println("this is all args constructor");
		this.posterName = posterName;
		this.numOfDj = numOfDj;
		this.partyName = partyName;
		this.djName = djName;
		this.totalPeople = totalPeople;
		this.entryFees = entryFees;
		this.isGood = isGood;
		this.time = time;
		this.date = date;
		this.day = day;
		this.organisedName = organisedName;
		this.guestName = guestName;
		this.gameName = gameName;
		this.type = type;
		this.isCollegeFest = isCollegeFest;
		this.latestSong = latestSong;
		this.numOfEquipment = numOfEquipment;
		this.atomosphere = atomosphere;
		this.incomeOfDj = incomeOfDj;
		this.groupName = groupName;
		this.isProfeesional = isProfeesional;
		this.singerName = singerName;
		this.bestDjName = bestDjName;
		this.place = place;
		this.djPrice = djPrice;
	}


	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}


	public void setNumOfDj(int numOfDj) {
		this.numOfDj = numOfDj;
	}


	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}


	public void setDjName(String djName) {
		this.djName = djName;
	}


	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}


	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}


	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}


	public void setTime(double time) {
		this.time = time;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public void setOrganisedName(String organisedName) {
		this.organisedName = organisedName;
	}


	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setCollegeFest(boolean isCollegeFest) {
		this.isCollegeFest = isCollegeFest;
	}


	public void setLatestSong(String latestSong) {
		this.latestSong = latestSong;
	}


	public void setNumOfEquipment(int numOfEquipment) {
		this.numOfEquipment = numOfEquipment;
	}


	public void setAtomosphere(String atomosphere) {
		this.atomosphere = atomosphere;
	}


	public void setIncomeOfDj(int incomeOfDj) {
		this.incomeOfDj = incomeOfDj;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public void setProfeesional(boolean isProfeesional) {
		this.isProfeesional = isProfeesional;
	}


	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}


	public void setBestDjName(String bestDjName) {
		this.bestDjName = bestDjName;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public void setDjPrice(int djPrice) {
		this.djPrice = djPrice;
	}


	public String getPosterName() {
		return posterName;
	}


	public int getNumOfDj() {
		return numOfDj;
	}


	public String getPartyName() {
		return partyName;
	}


	public String getDjName() {
		return djName;
	}


	public int getTotalPeople() {
		return totalPeople;
	}


	public int getEntryFees() {
		return entryFees;
	}


	public boolean isGood() {
		return isGood;
	}


	public double getTime() {
		return time;
	}


	public String getDate() {
		return date;
	}


	public String getDay() {
		return day;
	}


	public String getOrganisedName() {
		return organisedName;
	}


	public String getGuestName() {
		return guestName;
	}


	public String getGameName() {
		return gameName;
	}


	public String getType() {
		return type;
	}


	public boolean isCollegeFest() {
		return isCollegeFest;
	}


	public String getLatestSong() {
		return latestSong;
	}


	public int getNumOfEquipment() {
		return numOfEquipment;
	}


	public String getAtomosphere() {
		return atomosphere;
	}


	public int getIncomeOfDj() {
		return incomeOfDj;
	}


	public String getGroupName() {
		return groupName;
	}


	public boolean isProfeesional() {
		return isProfeesional;
	}


	public String getSingerName() {
		return singerName;
	}


	public String getBestDjName() {
		return bestDjName;
	}


	public String getPlace() {
		return place;
	}


	public int getDjPrice() {
		return djPrice;
	}


	@Override
	public String toString() {		
		System.out.println("this is to sring method");
		return "MusicalNightDto [posterName=" + posterName + ", numOfDj=" + numOfDj + ", partyName=" + partyName
				+ ", djName=" + djName + ", totalPeople=" + totalPeople + ", entryFees=" + entryFees + ", isGood="
				+ isGood + ", time=" + time + ", date=" + date + ", day=" + day + ", organisedName=" + organisedName
				+ ", guestName=" + guestName + ", gameName=" + gameName + ", type=" + type + ", isCollegeFest="
				+ isCollegeFest + ", latestSong=" + latestSong + ", numOfEquipment=" + numOfEquipment + ", atomosphere="
				+ atomosphere + ", incomeOfDj=" + incomeOfDj + ", groupName=" + groupName + ", isProfeesional="
				+ isProfeesional + ", singerName=" + singerName + ", bestDjName=" + bestDjName + ", place=" + place
				+ ", djPrice=" + djPrice + "]";
	}


	@Override
	public int hashCode() {
System.out.println("this is hash code method");
		int result = 25;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicalNightDto other = (MusicalNightDto) obj;
		if (atomosphere == null) {
			if (other.atomosphere != null)
				return false;
		} else if (!atomosphere.equals(other.atomosphere))
			return false;
		if (bestDjName == null) {
			if (other.bestDjName != null)
				return false;
		} else if (!bestDjName.equals(other.bestDjName))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (djName == null) {
			if (other.djName != null)
				return false;
		} else if (!djName.equals(other.djName))
			return false;
		if (djPrice != other.djPrice)
			return false;
		if (entryFees != other.entryFees)
			return false;
		if (gameName == null) {
			if (other.gameName != null)
				return false;
		} else if (!gameName.equals(other.gameName))
			return false;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		if (guestName == null) {
			if (other.guestName != null)
				return false;
		} else if (!guestName.equals(other.guestName))
			return false;
		if (incomeOfDj != other.incomeOfDj)
			return false;
		if (isCollegeFest != other.isCollegeFest)
			return false;
		if (isGood != other.isGood)
			return false;
		if (isProfeesional != other.isProfeesional)
			return false;
		if (latestSong == null) {
			if (other.latestSong != null)
				return false;
		} else if (!latestSong.equals(other.latestSong))
			return false;
		if (numOfDj != other.numOfDj)
			return false;
		if (numOfEquipment != other.numOfEquipment)
			return false;
		if (organisedName == null) {
			if (other.organisedName != null)
				return false;
		} else if (!organisedName.equals(other.organisedName))
			return false;
		if (partyName == null) {
			if (other.partyName != null)
				return false;
		} else if (!partyName.equals(other.partyName))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (posterName == null) {
			if (other.posterName != null)
				return false;
		} else if (!posterName.equals(other.posterName))
			return false;
		if (singerName == null) {
			if (other.singerName != null)
				return false;
		} else if (!singerName.equals(other.singerName))
			return false;
		if (Double.doubleToLongBits(time) != Double.doubleToLongBits(other.time))
			return false;
		if (totalPeople != other.totalPeople)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
	

}
