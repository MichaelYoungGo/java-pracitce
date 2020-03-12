import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;

public class LoggerTest {
	public static void main(String[] args) throws Exception {
		//设置System.Logger对象
		var logger = System.getLogger("fkjava");
		//设置系统日志级别（FINE对应DEBUG）
		Logger.getLogger("fkjava").setLevel(Level.FINE);
		//设置a.xml保存日志记录
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		logger.log(System.Logger.Level.DEBUG, "debug信息");
		logger.log(System.Logger.Level.INFO, "info信息");
		logger.log(System.Logger.Level.ERROR, "error信息");
	}
}
