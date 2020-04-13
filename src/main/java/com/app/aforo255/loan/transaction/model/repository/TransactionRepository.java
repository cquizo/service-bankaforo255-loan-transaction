package com.app.aforo255.loan.transaction.model.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.aforo255.loan.transaction.model.entity.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

	List<Transaction> findByNroPrestamo(int nroPrestamo);
}
