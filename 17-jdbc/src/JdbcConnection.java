import java.io.ObjectInputStream.GetField;
import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) {
		// JAVA와 DB를 연동하기 위해서 JDBC라는 API가 필요
		// MySQL은 그 중에서도 Conector J 라는 라이브러리 이용
		// Connector J는 mysql 공홈이나, jar파일만 구해서 바로 적용

		//연결은 Connection 자료형으로 진행
		Connection con = null;

		//DB연결에 관련된 로직은 무조건 try~catch구문을 활용하도록 강요
		try {
			//MYSQL DB와 연동할것을 나타냄
			Class.forName("com.mysql.jdbc.Driver");

			//접속 url은 jdbc:mysql://localhost/db명
			String url = "jdbc:mysql://localhost/employees";

			//접속주소, 계정, 비밀번호를 이용해 접속요청을 넣기
			con = DriverManager.getConnection(url, "root", "mysql");

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
