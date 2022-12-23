package com.cjc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.Model.Tutor;
@Repository
public interface TutorDao extends JpaRepository<Tutor, Integer>{

}
