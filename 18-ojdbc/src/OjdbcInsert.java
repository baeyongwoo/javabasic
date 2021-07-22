import java.sql.*;
import java.util.Scanner;

public class OjdbcInsert {
	public static void main(String[] args) {
		Connection con = null;
		//Statment를 대신할 수 있는 PreparedStatment 선언
		//기존 Statement는 SQL구문과 자바 구문의 경계가 불불명
		//그래서 자바코드와 SQL구문이 섞여서 굉장히 지저분했는데
		//PreparedStatement는 SQL구문만 먼저 작성해두고
		//필요한 부분에만 자바변수를 대입하는 식으로 작성해, 가독성, 작성용이 좋아졌고, 표준임
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			System.out.println("연결완료");
			
			// 1. PreparedStatement 구문은 쿼리문을 먼저 만들고 시작
			// 기존의 자바 변수가 들어갈 자리에 ? 로 대신해서 작성
			// 자료형 막론하고 문자열에도 ''붙이지 않고 ?로만 처리
			String sql = "INSERT INTO OjdbcTest(num, str) VALUES"
					+ "(?, ?)";
			// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣기
			// pstmt변수를 생성해 놓은 다음 , set자료형(?순서 , 집어넣을 변수)를 이용해 ? 다 채우기
			// 아래 코드는 첫 번째 ?에는 1을, 두 번째 ?에는 "test"를 대신 넣겠다는 의미
			pstmt = con.prepareStatement(sql);
			System.out.println("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			pstmt.setInt(1, num);
			System.out.println("문자를 입력하세요 : ");
			String text = scan.next();
			pstmt.setString(2, text);
			
			//3. 입력이 모두 끝난 쿼리문을 실행
			pstmt.executeUpdate();
			System.out.println("숫자와 문자 입력 완료.");
			
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
