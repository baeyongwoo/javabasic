import java.sql.*;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 문자열의 숫자를 입력하세요");
		int num = scan.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			conn = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = conn.createStatement();
			String sql = "DELETE FROM JDBCInsert WHERE num = " + num;
			System.out.println(sql);
			
			
			stmt.executeUpdate(sql);
			
			
			
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 ");
		}finally {
			try {
				if(conn != null && conn.isClosed()) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
