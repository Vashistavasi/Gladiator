package com.lti.daoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dao.AdminDao;
import com.lti.dao.AdminDaoImpl;
import com.lti.dto.QuestionDto;
import com.lti.dto.optionsDto;
import com.lti.services.AdminService;
import com.lti.services.AdminServiceImpl;
@SpringBootTest
class AdminDaoImplTest {
	@Autowired
	AdminService adminService ;
	@Test
	void test() {
	System.out.println(adminService.getquestions(102));
		System.out.println("her");
		List<QuestionDto> a=new ArrayList<QuestionDto> ();
		List<optionsDto> o= new ArrayList<optionsDto>();
		QuestionDto q= new QuestionDto();
		optionsDto o0,o1,o2,o3 ;
		o0=new optionsDto();
		o1=new optionsDto();
		o2=new optionsDto();
		o3=new optionsDto();
		o0.setOption("public sample operator + (sample a, sample b)");
		o1.setOption("public abstract operator + (sample a,sample b)");
		o2.setOption("public static sample operator + (sample a, sample b)");
		o3.setOption("all of the mentioned");
		o.add(o0);
		o.add(o1);
		o.add(o2);
		o.add(o3);
		
	
		q.setOptions(o);
		q.setExam_Id(102);
		q.setQues_Id(12);
		q.setQuestion("Correct way to overload +operator?");
		q.setResponse("all of the mentioned");
		a.add(q);
		 System.out.println("Size of questionlist "+ a.size());
	Assertions.assertEquals(a.get(0).getExam_Id(), adminService.getquestions(102).get(0).getExam_Id(),"Checking Exam Id");
	Assertions.assertEquals(a.get(0).getResponse(), adminService.getquestions(102).get(0).getResponse(),"Checking Correct Answer");
	}

}
