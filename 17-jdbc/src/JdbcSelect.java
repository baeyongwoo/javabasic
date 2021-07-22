import java.sql.*;

public class JdbcSelect {
	// mysql의 employees와 연결
	public static void main(String[] args) {
		Connection con = null;
		//쿼리문을 날리기 위해 먼저 구문 객체를 생성
		Statement stmt = null;
		//SELECT문은 결과물이 존재하기 때문에
		//결과데이터를 받아줄 ResultSet도 필요
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/employees";
			con = DriverManager.getConnection(url, "root", "mysql");
			//쿼리를 실행하는 stmt 객체처리
			//con 변수가 url, 아이디, 비밀번호 정보가 있기 때뭄ㄴ에
			//con변수의 정보를 stmt에 넘기는 것
			stmt = con.createStatement();
			
			//SQL쿼리를 작성한 뒤 stmt의 파라미터로 제공
			//쿼리 작성법
			//1)JDBC에서는 가장 마지막;를 생략
			//2)*를 지정하면 전체 데이터, 컬럼명만 지정하면 일부만
			String sql =
					"SELECT emp_no FROM employees limit 2";
			
			//작성된 쿼리를 수행시킴
			//결과물은 위에 rs변수에 저장
			rs = stmt.executeQuery(sql);
			
			//rs는 커서라는 개념을 사용
			//rs는 인덱스 -1부터 시작
			//rs의 길이는 로우갯수만큼 생성
			//(select문의 결과가 로우1개면 길이 1)
			//로우 10개면 길이 10
			//커서를 옮기는 방법은 rs.next()를 호출
			//system.out.println(rs.next());하면 다음 값이 있다면 true, 없으면 false
			
			//첫 호출에 따라 -1에서 0번인덱스로 커서 이동
			rs.next();
			
			//rs.get자료형(컬럼번호); 를 통해 자료를 받아올 수 있음
			//컬럼번호는 1번부터 시작
			//rs.get자료형("컬럼이름"); 으로도 가능
			System.out.println(rs.getInt(1));
			
			//하단에 10002번도 조회해서 콘솔에 찍기
			rs.next();
			System.out.println(rs.getInt(1));
			
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
