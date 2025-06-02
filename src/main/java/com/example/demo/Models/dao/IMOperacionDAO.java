package com.example.demo.Models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.entity.MOperaciones;

public interface IMOperacionDAO extends CrudRepository<MOperaciones,Long> {
	
   //public List<MOperaciones>findAll();
   //public void save(MOperaciones moperaciones);
   //public void saveEdit(MOperaciones moperaciones);
   //public MOperaciones findOne(long id);
   //public void delete(Long id);

}
