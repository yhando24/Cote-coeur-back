package com.cotecoeur.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.cotecoeur.operation.model.Operation;
import com.cotecoeur.operation.model.Sens;

public class JPAHibernateCRUDTestOperation extends JPAHibernateTest {

	

	 @Test
	    public void testGetObjectById_success() {
	        Operation op = em.find(Operation.class, 1L);
	        assertNotNull(op);
	    }

	    @Test
	    public void testGetAll_success() {
	        List<Operation> ops = em.createNamedQuery("Operation.getAll", Operation.class).getResultList();
	        System.out.println(ops.get(0).getLibelle());
	        assertEquals(1, ops.size());
	    }

	    @Test
	    public void testPersist_success() {
	        em.getTransaction().begin();
	        Operation o= new Operation("ACHAT DE MARCHANDISES", LocalDate.now(), 125.01, Sens.DEBIT,"WWW.here.com");
	   
	        em.persist(o);
	        em.getTransaction().commit();

	        List<Operation> ops = em.createNamedQuery("Operation.getAll", Operation.class).getResultList();
	        	System.err.println(ops.get(1).getLibelle());
	        assertNotNull(ops);
	        assertEquals(2, ops.size());
	    }

	    @Test
	    public void testDelete_success(){
	    	Operation op = em.find(Operation.class, 1L);
	        em.getTransaction().begin();
	        em.remove(op);
	        em.getTransaction().commit();
	        List<Operation> ops = em.createNamedQuery("Operation.getAll", Operation.class).getResultList();
	        assertEquals(0, ops.size());
	    }

}
