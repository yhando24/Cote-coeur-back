package com.cotecoeur.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cotecoeur.operation.model.Operation;


@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

}
