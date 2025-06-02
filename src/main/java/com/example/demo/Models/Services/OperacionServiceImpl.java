package com.example.demo.Models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Models.dao.IMOperacionDAO;
import com.example.demo.Models.entity.MOperaciones;

@Service
public class OperacionServiceImpl implements IMOperacionService {
	@Autowired
	private IMOperacionDAO mOperacionDAO;
	
	@Override
	@Transactional
	public List<MOperaciones> findAll() {
		// TODO Auto-generated method stub
		return mOperacionDAO.findAll();
	}

	@Override
	@Transactional
	public void save(MOperaciones moperaciones) {
		// TODO Auto-generated method stub
		mOperacionDAO.save(moperaciones);
		
	}

	@Override
	@Transactional
	public void saveEdit(MOperaciones moperaciones) {
		// TODO Auto-generated method stub
		mOperacionDAO.saveEdit(moperaciones);
		
	}

	@Override
	@Transactional
	public MOperaciones findOne(long id) {
		// TODO Auto-generated method stub
		return mOperacionDAO.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		mOperacionDAO.delete(id);
	}
}
