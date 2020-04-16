import java.sql.Connection;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Driver;
import java.util.Properties;

public class URLClassLoaderTest
{
	private static Connection conn;
	public static Connection getConn(String url, String user, String pass) throws Exception
	{
		if(conn == null)
		{
			URL[] urls = {new URL("file:mysql-connector-java-8.0.19.jar")};
			var myClassLoader = new URLClassLoader(urls);
			var driver = (Driver) myClassLoader.loadClass("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			var props = new Properties();
			props.setProperty("user", user);
			props.setProperty("password", pass);
			conn = driver.connect(url, props);
		}
		return conn;
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println(getConn("jdbc:mysql://127.0.0.1:3306/test_db?useUnicode=true&characterEncoding=UTF-8","root","yang151750"));
	}
}
