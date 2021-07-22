import java.sql.*;
import java.text.DecimalFormat;

public class OjdbcSelect {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();

			String sql =
					"SELECT employee_id, first_name, hire_date, job_id, salary "
							+ "FROM employees";
			rs = stmt.executeQuery(sql);
			DecimalFormat df = new DecimalFormat("###,###만원");
			while(rs.next()) {
				
					System.out.println("아이디 : " + rs.getString("employee_id") 
							+ ", 성 : " +rs.getString("first_name")
							+ ", 입사일 : " + rs.getDate("hire_date")
							+ ", 직무명 : " + rs.getString("job_id")
							+ ", 연봉" + df.format(rs.getInt("salary")));
					rs.next();
					

			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
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
