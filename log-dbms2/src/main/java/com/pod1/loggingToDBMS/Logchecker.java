package com.pod1.loggingToDBMS;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod1.loggingToDBMS.model.Logs;
import com.pod1.loggingToDBMS.repository.LoggingToDbmsDTO;

@Service
public class Logchecker {
   
   @Autowired
   private LoggingToDbmsDTO ldto;
   
   public Logchecker() {
	// TODO Auto-generated constructor stub
   }
   
   public void checkLog() {
	   Logs l=new Logs();
	   l.setUser_id(1);
	   l.setDated(new Date());
	   l.setLogger("shashank");
	   l.setLevel("INFO");
	   l.setMessage("this is info message");
	   System.out.println(l);
	   ldto.save(l);
 }
}
