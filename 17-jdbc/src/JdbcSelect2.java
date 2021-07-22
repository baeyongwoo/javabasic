import java.io.ObjectInputStream.GetField;
import java.sql.*;
import java.util.Scanner;

public class JdbcSelect2 {

	public static void main(String[] args) {
		// 1. employees DB를 연결
		// 2. 조회구문은 SELECT emp_no, first_name from employees limit 10;
		// 3. 위 조회구문을 조회한 결과물을 while문을 활용해서
		// 4. 콘솔창에 사번 : emp_no, 성 : first_name과 같은 형태로 10줄 출력
		// 정확하게 result에 저장된 만큼만
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scan = new Scanner(System.in);

		try {
			
			System.out.println("몇 명을 조회합니까?");
			int Maxnum = scan.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/employees";
			con = DriverManager.getConnection(url, "root", "mysql");

			stmt = con.createStatement();

			String sql = "SELECT emp_no, first_name, hire_date FROM employees";
			
			rs = stmt.executeQuery(sql);
			int num = 0;
			while(rs.next()) {
				num++;
				if(num <= Maxnum) {
					System.out.println("사번 : " + rs.getInt(1) + 
							", 성 : " + rs.getString(2) + 
							", \t" + rs.getString(3));
				}
			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
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
