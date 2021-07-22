import java.sql.*;
import java.util.Scanner;

public class Jdbcinsert {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		//ResultSet은 SELECT구문에 대한 결과만 처리함. 이외 구문은 불필요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			conn = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = conn.createStatement();
			String sql = "INSERT INTO JDBCInsert (num, str) VALUES (" + 
						  num +  ", '" + str + "');";
			System.out.println(sql);
			
			
			//SELECT문은 executeQuery(sql구문); 형식으로 호출하지만
			//이외구문은 executeUpdate(sql구문); 으로 호출
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
