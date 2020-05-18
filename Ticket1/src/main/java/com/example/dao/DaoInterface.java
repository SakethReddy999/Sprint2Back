package com.example.dao;

import java.util.List;

import com.example.entity.Ticket;

public interface DaoInterface {

	Ticket Ticketgeneration(Ticket mv);

	Ticket getTicketById(int id);

	List<Ticket> getAllTicket();

}
