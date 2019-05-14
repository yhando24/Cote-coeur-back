package com.cotecoeur.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import com.cotecoeur.operation.model.Operation;
import com.cotecoeur.operation.repository.OperationRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@SqlGroup({
    @Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:data.sql"),

})
public class TestCrudOperationRepository {

	
	@Autowired
	OperationRepository or;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void test() {
		    List<Operation> ops = or.findAll();
	        System.out.println(ops.get(0).getLibelle());
	        assertNotNull(ops);
	}
 

}
