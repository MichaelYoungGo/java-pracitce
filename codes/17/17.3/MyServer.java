import java.util.List;
import java.net.Socket;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.net.ServerSocket;

public class MyServer
{
	public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>());
	public static void main(String[] args) throws IOException
	{
		var ss = new ServerSocket(30000);
		while (true)
		{
			Socket s = ss.accept();
			socketList.add(s);
			new Thread(new ServerThread(s)).start();
		}
	}
}
