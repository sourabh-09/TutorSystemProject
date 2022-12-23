package com.cjc.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Dao.TutorDao;
import com.cjc.Model.Tutor;
import com.cjc.Service.TutorService;
@Service
public class TutorServiceIMPL implements TutorService{

	@Autowired
	private TutorDao dao;

	@Override
	public Tutor addTutor(Tutor tutor) {
	
		return dao.save(tutor);
	}

	@Override
	public List<Tutor> getallTutor() {
		
		 return dao.findAll();
	}
}
