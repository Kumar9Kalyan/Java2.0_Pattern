import java.io.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FetchData {

	public static void main(String[] args) {
		

		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password= "7890poiu";
		String query ="INSERT INTO Customers (customerid,customername,contactname,address,city,postalcode,country) VALUES (6,'Kalyan','Shrike','Anand nagar','Rjy','05223','India')";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 // (Or) Use this java inbuilt class to load the driver: DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection established successfully");
		Statement stat =  con.createStatement();
		System.out.println(stat);
//		stat.setInt(1, 6);
//		stat.setString(2, "'Kalyan'");
//		stat.setString(3, "'Shrike'");
//		stat.setString(4, "'Anand Nagar'");
//		stat.setString(5, "'Rjy'");
//		stat.setString(6,"'05523'");
//		stat.setString(7, "'India'");
		stat.executeUpdate(query);
		con.commit();
		int result =0;
		if(result>0){
			
			System.out.println("Inserted successfully ");
		}else {
			System.out.println("Unsuccessful");
		}
		stat.close();
	 
		con.close();
		System.out.println("Connection is closed");
		}
		catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error occured in ClassNotFound");
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Error occured in SQL");
		}

	}

}
