package com.example.demo.Models;


public class Operacion {
   
	public int IdOperacion;
	public String Codigo;
	public String Descripcion;
	public int Cantidad;
	public float Importe;
	public float Igv;
	public float Total;

	public Operacion() {
		
		// TODO Auto-generated constructor stub
	}

	public Operacion(int idOperacion, String codigo, String descripcion, int cantidad, float importe, float igv,
			float total) {
		
		IdOperacion = idOperacion;
		Codigo = codigo;
		Descripcion = descripcion;
		Cantidad = cantidad;
		Importe = importe;
		Igv = igv;
		Total = total;
	}

	public int getIdOperacion() {
		return IdOperacion;
	}

	public void setIdOperacion(int idOperacion) {
		IdOperacion = idOperacion;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public float getImporte() {
		return Importe;
	}

	public void setImporte(float importe) {
		Importe = importe;
	}

	public float getIgv() {
		return Igv;
	}

	public void setIgv(float igv) {
		Igv = igv;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}
	
	

}
