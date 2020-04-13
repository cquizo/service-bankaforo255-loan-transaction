package com.app.aforo255.loan.transaction.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transaccion")
public class Transaction implements Serializable {

	private static final long serialVersionUID = 4913093L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	@Column(name = "nro_prestamo")
	private int nroPrestamo;
	@NotNull
	private int cuota;
	@NotNull
	@Column(name = "importe_cuota")
	private double importeCuota;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNroPrestamo() {
		return nroPrestamo;
	}

	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public double getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}
}
