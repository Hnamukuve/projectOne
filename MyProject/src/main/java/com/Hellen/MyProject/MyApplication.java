package com.Hellen.MyProject;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import com.Hellen.MyProject.Auth.AuthService;
import com.Hellen.MyProject.Auth.AuthServlet;
import com.Hellen.MyProject.Reimbursements.ReimbDAO;
import com.Hellen.MyProject.Reimbursements.ReimbService;
import com.Hellen.MyProject.Reimbursements.ReimbServlet;
import com.Hellen.MyProject.Users.UserDAO;
import com.Hellen.MyProject.Users.UserServlet;
import com.Hellen.MyProject.Users.*;

public class MyApplication {

	public static void main(String[] args) throws LifecycleException {
		
		String docBase = System.getProperty("java.io.tmpdir");
		Tomcat webServer = new Tomcat();
		
		webServer.setBaseDir(docBase);
		webServer.setPort(5000);
		webServer.getConnector();
		
		UserDAO userDAO = new UserDAO();
		AuthService authService = new AuthService(userDAO);
		UserService userService = new UserService(userDAO);
	    UserServlet userServlet = new UserServlet(userService);
        AuthServlet authServlet = new AuthServlet(authService);
        ReimbDAO reimbDAO = new ReimbDAO();
        ReimbService reimbService = new ReimbService(reimbDAO);
        ReimbServlet reimbServlet = new ReimbServlet(reimbService);
        
		
		final String rootContext = "/MyApplication";
		webServer.addContext(rootContext, docBase);
		webServer.addServlet(rootContext, "UserServlet", userServlet).addMapping("/users");
		webServer.addServlet(rootContext, "AuthServlet", authServlet).addMapping("/auth");
		webServer.addServlet(rootContext, "ReimbServlet", reimbServlet).addMapping("/reimb");
		
		webServer.start();
		webServer.getServer().await();
		
		
		
	}

}
