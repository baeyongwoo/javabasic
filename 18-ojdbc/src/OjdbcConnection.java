import java.sql.*;

public class OjdbcConnection {

	public static void main(String[] args) {
		// OracleSql
		// .jar파일을 import
		// .jar 파일의 위치 : C:\Users\ict03-18\Desktop\Class\sqldeveloper\jdbc\lib
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "mytest", "mytest");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		}
		finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
	}
}
