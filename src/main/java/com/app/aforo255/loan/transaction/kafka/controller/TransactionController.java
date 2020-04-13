package com.app.aforo255.loan.transaction.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.loan.transaction.model.entity.Transaction;
import com.app.aforo255.loan.transaction.model.repository.TransactionRepository;

@RestController
public class TransactionController {

	@Autowired
	private TransactionRepository service;

	@GetMapping("/listar/{nroPrestamo}")
	public List<Transaction> listar(@PathVariable int nroPrestamo) {
		return service.findByNroPrestamo(nroPrestamo);
	}
}
