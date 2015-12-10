package org.hnyy.web.controller;

import java.util.List;

import org.hnyy.core.service.BaseService;
import org.hnyy.web.entity.SysUser;
import org.hnyy.web.entity.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

		@Autowired
		BaseService systemServiceImpl;
		
		@RequestMapping("hello")
		public String hello(){
			try {
				List<TStudent> tStudents = systemServiceImpl.findAll(TStudent.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "";
		}
}
