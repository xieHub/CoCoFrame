package org.hnyy.core.service.impl;

import java.io.Serializable;

import org.hnyy.core.dao.JdbcTemplateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BaseServiceImpl<T,PK extends Serializable > {
	@Autowired
	public JdbcTemplateDao jdbcDao;
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
}
