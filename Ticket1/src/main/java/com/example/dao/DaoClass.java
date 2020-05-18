
package com.example.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.entity.Ticket;
@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Ticket Ticketgeneration(Ticket mv) {
		// TODO Auto-generated method stub
		Ticket t=em.merge(mv);
		return t;
	}
	
	@Override
	public Ticket getTicketById(int id) {
		
		return  em.find(Ticket.class,id);
	}
	
	@Override
	public List<Ticket> getAllTicket() {
		Query q=em.createQuery("select m from Ticket m ");
		List<Ticket> mvlist=q.getResultList();
		return mvlist;
	}
}
	
	
				


	