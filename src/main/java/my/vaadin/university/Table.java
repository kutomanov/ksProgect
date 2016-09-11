package my.vaadin.university;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class Table {
	
	public static void main(String[] args) throws Exception {
	
		//createTable();
		//insertTable();
		getAllStudents();
				
				
	}
	/*public static void createTable() throws Exception {
	
	try {
		Connection conn = JBDC.connect();
		PreparedStatement create = conn.prepareStatement("CREATE TABLE primer(first varchar(225), last varchar(225))");
		create.executeUpdate();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Таблица создана!");
	}
}*/
	
	/*public static void insertTable() throws Exception {
		
		try {
			Connection conn = JBDC.connect();
			PreparedStatement created = conn.prepareStatement("INSERT INTO students(lastname, firstname, patronymic, birthday, grup) VALUES ('Иванов', 'Иван', 'Иванович', '1990-10-05', '402')");

			created.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Данные вставлены!");
		}
		
	}*/
	
	public static Collection<String> getAllStudents() throws Exception {
		
		Collection<String> array = new ArrayList<String>();
		
		try {
			
			Connection conn = JBDC.connect();
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM students");
			ResultSet result = statement.executeQuery();
			
			
			while (result.next()) {
				array.add(result.getString("lastname"));
				array.add(result.getString("firstname"));
				array.add(result.getString("patronymic"));
				array.add(result.getString("birthday"));
				array.add(result.getString("grup"));
				
				System.out.println(array);
				
				}
			
			System.out.println("Все данные выбраны!");
			return array;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	
	
}

	
