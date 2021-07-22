//import java.sql.*;
//import java.util.Scanner;
//
//public class OjdbcDelect {
//	public static void main(String[] args) {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		Scanner scan = new Scanner(System.in);
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
//			con = DriverManager.getConnection(url, "mytest", "mytest");
//			System.out.println("연결완료");
//			
//			String sql = "DELETE FROM OjdbcTest WHERE num = ?";
//			
//			pstmt = con.prepareStatement(sql);
//			System.out.println("문자를 삭제할 숫자를 입력하세요 : (전체 삭제는 9번 입력해주세요)");
//			int num = scan.nextInt();
//			
//			if(num == 9) {
//				sql = "DELETE FROM ojdbcTest";
//				pstmt = con.prepareStatement(sql);
//				pstmt.executeUpdate();
//				System.out.println("전체 삭제 완료");
//				return;
//			}
//			
//			pstmt.setInt(1, num);
//			//3. 입력이 모두 끝난 쿼리문을 실행
//			pstmt.executeUpdate();
//			System.out.println("숫자와 문자 삭제 완료.");
//			
//		} catch (SQLException e) {
//			System.out.println("에러 : " + e);
//		} catch (ClassNotFoundException e){
//			e.printStackTrace();
//		}
//		finally {
//			try {	
//				if(con != null && !con.isClosed()) {
//					con.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//}
import java.sql.*;

public class OjdbcDelect {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			
			
			String sql = "DELETE FROM ojdbctest";
			
			pstmt = con.prepareStatement(sql);
		
			pstmt.executeUpdate();
			
			System.out.println(sql);
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con!=null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}
