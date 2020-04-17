import java.util.Properties;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class PreparedStatementTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam(String paramFile) throws Exception
	{
		var props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
		Class.forName(driver);		
	}
	public void insertUseStatement() throws Exception
	{
		long start = System.currentTimeMillis();
		try (
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement()
	    	    )
		{
			for (var i = 0; i < 100; i++)
			{
				stmt.executeUpdate("insert into student_table values(" 
						+ " null, '姓名" + i + "', 1)");
			}
			System.out.println("使用Statement费时：" + (System.currentTimeMillis() - start));
		}
	}
	public void insertUsePrepare() throws Exception
	{
		long start = System.currentTimeMillis();
		try(
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null, ?, 1)"))
		{
			for (var i = 0; i < 100; i++)
			{
				pstmt.setString(1, "姓名" + i);
				pstmt.executeUpdate();
			}
			System.out.println("使用PreparedStatement费时："
					+ (System.currentTimeMillis()-start));
		}
	}
	public static void main(String[] args) throws Exception{
		var pt = new PreparedStatementTest();
		pt.initParam("mysql.ini");
		pt.insertUseStatement();
		pt.insertUsePrepare();
	}
}
