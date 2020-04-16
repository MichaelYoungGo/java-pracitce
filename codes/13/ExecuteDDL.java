import java.util.Properties;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteDDL
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam( String paramFile) throws Exception
	{
		var props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void createTable(String sql) throws Exception
	{
		Class.forName(driver);
		try (
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement())
		{
			stmt.executeUpdate(sql);
		}
	}
	public static void main(String[] args) throws Exception
	{
		var ed = new ExecuteDDL();
		ed.initParam("mysql.ini");
		System.out.println("------开始创建数据库表------");
		System.out.println("jdbc的url:"+ed.url);
		System.out.println("jdbc的user:"+ed.user);
		System.out.println("jdbc的password:"+ed.pass);
		System.out.println("jdbc的Driver:"+ed.driver);

		ed.createTable("create table jdbc_test "
				+ "( jdbc_id int auto_increment primary key, "
				+ "jdbc_name varchar(255), "
				+ "jdbc_desc int);");
	}
}
