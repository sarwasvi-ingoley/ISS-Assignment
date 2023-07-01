import java.sql.*;

public class BasicDBExample {
   static final String DB_URL = "jdbc:mysql://localhost/practicedb";
   static final String USER = "root";
   static final String PASS = "12345678";
   static final String CREATE_QUERY = "Create Table Students" + "(id INTEGER NOT NULL,"+"firstname VARCHAR(20),"+"lastname VARCHAR(20))";

   public static void main(String[] args) {
	   Connection conn = null;
	   PreparedStatement myStmt = null;
	   try {
		   conn = DriverManager.getConnection(DB_URL, USER, PASS); //Open a connection
		   if(conn != null) {
			   System.out.println("Connection Established Succuessfully");
		   } else {
			   System.out.println("Connection not established");
		   }
		   myStmt = conn.prepareStatement(CREATE_QUERY); //By using prepareStatement the SQL statement is precompiled for use.
		   myStmt.execute();
	   } catch(SQLException e) {
		   e.printStackTrace();
	   } finally {
//		   myStmt.close();
	   }
   }
}



