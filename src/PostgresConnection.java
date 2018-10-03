import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Anjali
 *
 */
public class PostgresConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello project");
		
		try {
			 Class.forName("org.postgresql.Driver"); 
			Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/anjali","postgres","");
			System.out.println("Java JDBC PostgreSQL Example");
			 System.out.println("Connected to PostgreSQL database!");
			 Statement statement = connection.createStatement();
			 System.out.println("Reading car records...");
			 ResultSet resultSet = statement.executeQuery("SELECT * FROM public.myproducts");
			 while (resultSet.next()) {
				 System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("productId"), resultSet.getString("productname"));  
				            
			 
			 }

			 
		}
		catch(Exception sqlException){	
			System.out.println("connection failure");
			sqlException.printStackTrace();
		}
		finally {
		System.out.println("anjali");
		}
	}

}
