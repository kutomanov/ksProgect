package my.vaadin.university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDC {

	private static final String DRIVER_CLASS = "org.hsqldb.jdbcDriver";
	private static Connection conn = null;
	private static String login = "SA";
	private static String password = "";
	private static String path = "C:\\Users\\Евгения\\workspace\\university\\base\\test";
	private static final String url = "jdbc:hsqldb:file:" + path + ";shutdown=true;hsqldb.write_delay=false; ";
	
	
	public static Connection connect() throws Exception{
		if (conn == null) {
			try {
				Class.forName(DRIVER_CLASS);
				
				conn = DriverManager.getConnection(url, login, password);
				
			}
				
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return conn;		
	}
	
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
