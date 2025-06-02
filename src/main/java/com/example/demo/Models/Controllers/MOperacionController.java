package com.example.demo.Models.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.dao.IMOperacionDAO;
import com.example.demo.Models.entity.MOperaciones;

@Controller
public class MOperacionController {
 @Autowired
 private IMOperacionDAO mOperacionDAO;
 @RequestMapping(value="/listar",method=RequestMethod.GET)
 public String Listar(Model model) {
	 model.addAttribute("Titulo", "Listado de Operaciones");
	 model.addAttribute("MOperaciones",mOperacionDAO.findAll());
	 //MOperacionDAO
	 return "listar";
 }
 @RequestMapping(value="/create")
 public String crear(Map<String,Object>model) {
	 MOperaciones mOperacion=new MOperaciones();
	 model.put("mOperacion", mOperacion);
	 model.put("Titulo", "Formulario de Operaciones");
	 return "create";
 }
 @RequestMapping(value="/create",method=RequestMethod.POST)
 public String guardar(MOperaciones moperacion,Model model) {
	 mOperacionDAO.save(moperacion);
	 model.addAttribute("MOperaciones", mOperacionDAO.findAll());
	 return "listar";
 }

 @RequestMapping(value="/edit/{id}")
 public String Edit(@PathVariable(value="id")long id,Map<String, Object>model) {
	 MOperaciones mOperacion=null;
	 if(id>0) {
		 mOperacion=mOperacionDAO.findOne(id);
	 }else {
		 return "listar";
	 }
	 model.put("mOperacion", mOperacion);
	 model.put("Titulo", "Formulario de Operaciones");
	 return "edit";
 }

@PostMapping("/edit")
public String guardarOperacion(@ModelAttribute("mOperacion") MOperaciones mOperacion, Model model) {
       try {
           mOperacionDAO.saveEdit(mOperacion); 
           model.addAttribute("MOperaciones", mOperacionDAO.findAll());
           return "listar"; 
       } catch (Exception e) {
           model.addAttribute("error", "Error al guardar: " + e.getMessage());

           model.addAttribute("MOperaciones", mOperacionDAO.findAll());
           return "listar"; 
       }
   }
@RequestMapping(value="/delete/{id}")
public String delete(@PathVariable(value="id")long id,Map<String,Object>model) {
	MOperaciones mOperacion=null;
	if(id>0)
	{
		mOperacion=mOperacionDAO.findOne(id);
	}else {
		return "listar";
	}
	model.put("mOperacion", mOperacion);
	model.put("Titulo", "Formulario de eliminar Operaciones");
	return "delete";
}
@PostMapping("/delete")
public String eliminarOperacion(@RequestParam("mIdOperacion")Long id,Model model)
{
	try {
		mOperacionDAO.delete(id);//Eliminamos el registro
		model.addAttribute("MOperaciones",mOperacionDAO.findAll());
		return "listar";
	}
	catch(Exception e){
		model.addAttribute("error", "Error al eliminar:"+e.getMessage());
		model.addAttribute("MOperaciones",mOperacionDAO.findAll());
		return "listar";
	}
	}

	@RequestMapping(value="/details/{id}")
	public String Details(@PathVariable(value="id")long id, Map<String,Object> model) {
		MOperaciones mOperacion = null;
		if (id > 0) {
			mOperacion = mOperacionDAO.findOne(id);
		}else {
			return "listar";
		}
		model.put("mOperacion", mOperacion);
		return "details";
	}
 }

