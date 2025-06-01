package com.example.demo.Models.entity;

import java.io.Serializable;
//import java.sql.Date;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="moperaciones")
public class MOperaciones implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="midoperacion")
	public long mIdOperacion;
	
	@Column(name="mcodigo",length=15,nullable=false)
	public String mCodigo;
	
	@Column(name="mdescripcion",length=60,nullable=false)
	public String mDescripcion;
	
	@Column(name="mcantidad",nullable=false)
	public int mCantidad;

	@Column(name="mimporte",nullable=false)
	public int mImporte;
	
	@Column(name="migv",nullable=false)
	public int mIgv;
	
	@Column(name="mtotal", nullable=false)
	public int mTotal;
	
	@Column(name="mregistro")
	@Temporal(TemporalType.DATE)
	private Date mRegistro;
	
	@PrePersist
	public void prePersist() {
		mRegistro=new Date();
	}

	public long getmIdOperacion() {
		return mIdOperacion;
	}

	public void setmIdOperacion(long mIdOperacion) {
		this.mIdOperacion = mIdOperacion;
	}

	public String getmCodigo() {
		return mCodigo;
	}

	public void setmCodigo(String mCodigo) {
		this.mCodigo = mCodigo;
	}

	public String getmDescripcion() {
		return mDescripcion;
	}

	public void setmDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}

	public int getmCantidad() {
		return mCantidad;
	}

	public void setmCantidad(int mCantidad) {
		this.mCantidad = mCantidad;
	}

	public int getmImporte() {
		return mImporte;
	}

	public void setmImporte(int mImporte) {
		this.mImporte = mImporte;
	}

	public int getmIgv() {
		return mIgv;
	}

	public void setmIgv(int mIgv) {
		this.mIgv = mIgv;
	}

	public int getmTotal() {
		return mTotal;
	}

	public void setmTotal(int mTotal) {
		this.mTotal = mTotal;
	}

	public Date getmRegistro() {
		return mRegistro;
	}

	public void setmRegistro(Date mRegistro) {
		this.mRegistro = mRegistro;
	}

	
}
