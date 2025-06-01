package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.Operacion;
@Controller
//@RequestMapping("/app")
public class IndexController {
	@GetMapping({"/index",""})
	public String index(Model model) {
		model.addAttribute("contenido","Bienvenidos al Modulo de Operaciones");
		
		return "index";
	}
	@RequestMapping("/operaciones")
	public String operaciones(Model model)
	{
	   Operacion operacion=new Operacion();
	   operacion.setIdOperacion(1);
	   operacion.setCodigo("O001");
	   operacion.setDescripcion("Construccion de viviendas");
	   operacion.setCantidad(1);
	   operacion.setImporte(100000);
	   operacion.setIgv(18000);
	   operacion.setTotal(118000);
	   model.addAttribute("operacion",operacion);
	   return "operaciones";
	}
	//@GetMapping({"/loperaciones"})
	@RequestMapping("/loperaciones")
	public String loperaciones(Model model)
	{
		List<Operacion> loperaciones=new ArrayList<>();
		loperaciones.add(new Operacion(1,"O001","Construccion de Viviendas",1,1000000,18000,118000));
		loperaciones.add(new Operacion(2,"O002","Construccion de SSHH",1,50000,9000,59000));
		loperaciones.add(new Operacion(3,"O003","Trabajos de Afirmado",1,1000000,18000,118000));
		loperaciones.add(new Operacion(4,"O004","Fabricacion de Motores",2,1000000,36000,236000));
		loperaciones.add(new Operacion(5,"O005","Construccion sala",1,1000000,18000,118000));
		loperaciones.add(new Operacion(6,"O006","Construccion Auditorio",3,1000000,54000,354000));
		model.addAttribute("loperaciones",loperaciones);
		return "loperaciones";
	}
}
