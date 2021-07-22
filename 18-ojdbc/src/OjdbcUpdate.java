import java.sql.*;
import java.util.Scanner;

public class OjdbcUpdate {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			System.out.println("연결완료");
			
			String sql = "UPDATE ojdbctest SET str = ? WHERE num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			System.out.println("문자를 수정할 숫자를 입력하세요 : ");
			int num = scan.nextInt();
			
			System.out.println("문자를 입력해주세요 : ");
			String text = scan.next();
			
			pstmt.setInt(2, num);
			pstmt.setString(1, text);
			
			pstmt.executeUpdate();
			System.out.println(num + "번  문자 변경 완료.");
			
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
