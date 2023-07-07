package com.javatechie.UserLogin;

import static java.lang.System.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public boolean processRequest(String request,Integer categoryDao) {
		if(request == "null") {
			out.println("You're not logged in");
			return false;
		}
		else {
			if(request.equals("DELETE")) {
				out.println("Enter integer for category");
				
				if(categoryDao > 0) {
					out.println("Deleted");
					return true;
				}else {
					out.println("Failed");
					return false;
				}
			}
			if(request.equals("CREATE")) {
				if(request.isEmpty()) {
					out.print("You're being directory to the category page");
					return false;
				}else {
					out.println("Enter an integer between 0 and 3 for category");
					if(categoryDao > 0) {
						out.print("Category has been added successfully");
						return true;
					}else {
						out.println("An error occured while adding product");
						out.println("You're being directed to the category page");
						return false;
					}
				}
			}
		}
		return false;
	}
}
