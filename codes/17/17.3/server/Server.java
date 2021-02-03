import java.io.PrintStream;
import java.net.ServerSocket;
import java.io.IOException;

public class Server
{
	private static final int SERVER_PORT = 30000;
	//使用CrazyitMap对象来保存每个客户的名字和对应输出流之间的对应关系
	public static CrazyitMap<String, PrintStream> clients = new CrazyitMap<>();
	public void init()
	{
		try(var ss = new ServerSocket(SERVER_PORT))
		{
			while (true)
			{
				var socket = ss.accept();
				new ServerThread(socket).start();
			}
		}
		catch(IOException ex)
		{
			System.out.println("服务器启动失败，是否端口" + SERVER_PORT + "已被占用？");
		}
	}
	public static void main(String[] args)
	{
		var server = new Server();
		server.init();
	}
}
