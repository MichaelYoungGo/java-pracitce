import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientThread implements Runnable
{
	private Socket s;
	BufferedReader br = null;
	public ClientThread (Socket s) throws IOException
	{
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		try
		{
			String content = null;
			content = br.readLine();
			while (content != null)
			{
				System.out.println(content);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
