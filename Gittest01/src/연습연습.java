import java.sql.DriverManager;
import java.sql.SQLException;

public class 연습연습 {

	private void connetion() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.connection 연결
			// -연결하기 위해서는 3개의 정보 필요(주소,계정,비밀번호)
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			if (conn != null) {
				System.out.println("Connection 연결성공");
			} else {
				System.out.println("연결실패");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
