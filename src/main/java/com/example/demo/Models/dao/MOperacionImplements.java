package com.example.demo.Models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Models.entity.MOperaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Repository
public class MOperacionImplements implements IMOperacionDAO {
	@PersistenceContext
	private EntityManager em;
	@SuppressWarnings("unchecked")
	//@Transactional(readOnly=true)
	@Transactional(readOnly=true)
	@Override
	public List<MOperaciones> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from MOperaciones").getResultList();
	}
	@Override
	@Transactional
	public void save(MOperaciones moperaciones) {
		em.persist(moperaciones);
	}
	@Override
	public MOperaciones findOne(long id) {
		return em.find(MOperaciones.class,id);
	}
	@Override
	@Transactional
	public void saveEdit(MOperaciones moperaciones) {
		if(moperaciones.getmIdOperacion()>0) {
			em.merge(moperaciones);
		}
		else {
			em.persist(moperaciones);
		}
	}
	@Override
	@Transactional
	public void delete(Long id) {
		
		em.remove(findOne(id));
	}



}
