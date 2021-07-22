import java.sql.*;
import java.util.Scanner;

public class Jdbcupdate {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("바꿀 문자의 숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.println("바꿀 문자열을 입력하세요");
		String str = scan.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			conn = DriverManager.getConnection(url, "root", "mysql");
			
			//update jdbcinsert set str=str where num = num
			stmt = conn.createStatement();
			String sql = "UPDATE JDBCInsert SET str = '" + str + "' WHERE num = '" + num + "';"; 
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
