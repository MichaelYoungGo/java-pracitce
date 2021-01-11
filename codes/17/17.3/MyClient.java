import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MyClient
{
	public static void main(String[] args) throws Exception
	{
		var s = new Socket("127.0.0.1", 30000);
		new Thread(new ClientThread(s)).start();
		var ps = new PrintStream(s.getOutputStream());
		String line = null;
		var br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null)
		{
			ps.println(line);
		}
	}
}
