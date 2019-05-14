package com.cotecoeur.operation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotecoeur.operation.repository.OperationRepository;

@Service
public class OperationService {
	
	@Autowired
	OperationRepository or;

}
