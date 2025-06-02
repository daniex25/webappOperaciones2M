package com.example.demo.Models.Services;

import java.util.List;

import com.example.demo.Models.entity.MOperaciones;

public interface IMOperacionService {
	public List<MOperaciones> findAll();

	public void save(MOperaciones moperaciones);

	public void saveEdit(MOperaciones moperaciones);

	public MOperaciones findOne(long id);

	public void delete(Long id);
}
