package Database;
import java.sql.*;

//public class Postgrees {

	
/*	static  String JDBC_DRIVER = “org.postgresql.Driver”;
	static  String DB_URL = “jdbc:postgresql://localhost:5432/SPS_Sales_DB”;

	//  Database credentials
	static  String USER = “youtilitydba”;
	static  String PASS = “Youtility11”;

	public static void main(String[] args) {

	Connection conn = null;
	Statement stmt = null;

	try{

	//STEP 2: Register JDBC driver
	Class.forName(“org.postgresql.Driver”);

	//STEP 3: Open a connection
	System.out.println(“Connecting to database…”);
	conn = DriverManager.getConnection(DB_URL,USER,PASS);

	//STEP 4: Execute a query
	System.out.println(“Creating statement…”);
	stmt = conn.createStatement();
	String sql;
	sql = “SELECT id, model FROM devices”;
	ResultSet rs = stmt.executeQuery(sql);

	//STEP 5: Extract data from result set
	while(rs.next()){

	//Retrieve by column name
	int id  = rs.getInt(1);
	String model = rs.getString(2);

	//Display values
	System.out.print(“ID: ” + id);
	System.out.print(“model: ” + model);
	}

	//STEP 6: Clean-up environment
	rs.close();
	stmt.close();
	conn.close();
	}catch(SQLException se){
	//Handle errors for JDBC
	se.printStackTrace();
	}catch(Exception e){
	//Handle errors for Class.forName
	e.printStackTrace();
	}finally{
	try{
	if(conn!=null)
	conn.close();
	}catch(SQLException se){
	se.printStackTrace();
	}//end finally try
	}//end try
	System.out.println(“Goodbye!”);
	}//end main
	}//end FirstExample

}*/
