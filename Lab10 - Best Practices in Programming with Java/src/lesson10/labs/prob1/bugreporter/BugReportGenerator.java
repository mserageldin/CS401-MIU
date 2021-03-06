package lesson10.labs.prob1.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import lesson10.labs.prob1.classfinder.ClassFinder;
import lesson10.labs.prob2.NewFileIO;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	 final static String FILE_LOCATION = "src/lesson10/labs/prob3/bug_report.txt";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> names = new ArrayList<String>();
		StringBuilder builder=new StringBuilder();
		Map<String, StringBuilder> map = new HashMap<String, StringBuilder>();
		
		for(Class<?> cl : classes) {
			
			
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();
				String assignedTo = annotation.assignedTo();
				
				boolean newDeveloper = !map.containsKey(assignedTo);
				
				builder.append("\n   reportedBy: "+annotation.reportedBy());
				builder.append("\n   className: "+cl.getName());
				builder.append("\n   description: "+annotation.description());
				builder.append("\n   severity: "+annotation.severity());
				builder.append("\n");
				
				if(newDeveloper) 	
					map.put(assignedTo, builder);
				else 
					map.get(assignedTo).append("\n"+builder);
			}
			 builder = new StringBuilder();
				
			}
		map.forEach((key, value) -> System.out.println(key +" "+value));
		NewFileIO nf=new NewFileIO();
		nf.writeText(FILE_LOCATION, map.toString().replace("=", "").replace("{", "").replace("}", ""));
		}
		//System.out.println(names);
		
	}
	
	

