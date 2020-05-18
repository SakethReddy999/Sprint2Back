
package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticketdata")
public class Ticket {
	@Id
	private int ticketid;
	private int noofseats;
	private String seatname;
	private Boolean ticketstatus;
	private String screenName;
	private int bookingRef;
	public int getTicketid() {

		return ticketid;
	}
	public int getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(int bookingRef) {
		this.bookingRef = bookingRef;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	public String getSeatname() {
		return seatname;
	}
	public void setSeatname(String seatname) {
		this.seatname = seatname;
	}
	public Boolean getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(Boolean ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
}

	