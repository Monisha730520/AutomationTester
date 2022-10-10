package org.test;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReports {
	
	public static void generateJVMReport(String json) {
		
		File loc= new File(System.getProperty("user.dir")+"D:\\eclipse-workspace\\CucumberKavida\\src\\main\\resources");
		Configuration conf =new Configuration(loc, "Start Tour");
		conf.addClassifications("Browser", "Chrome");
		conf.addClassifications("OS", "Window");
		List<String> jsonfiles=new LinkedList<>();
		jsonfiles.add(json);		
		ReportBuilder r=new ReportBuilder(jsonfiles, conf);
		r.generateReports();
		
	}

}
