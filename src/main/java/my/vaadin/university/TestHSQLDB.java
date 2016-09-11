package my.vaadin.university;

import java.sql.Connection;

public class TestHSQLDB {
 
	public static void main(String[] args) throws Exception{ 
	  
		
	 Connection conn = JBDC.connect();
	  
	 if (conn == null)
		 System.out.println("Нет соединения!");
		 else
			 System.out.println("Соединение установлено!!!");
	 
	}	
}