package com.infinite.SpringBootMvc.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LoginDaoImpl implements ILoginDao {

	@Autowired
	private SessionFactory lfactory;

	public void setSfactory(SessionFactory lfactory) {
		this.lfactory = lfactory;
	}
}
