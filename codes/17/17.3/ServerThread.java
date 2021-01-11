import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ServerThread implements Runnable {
	Socket s = null;
	BufferedReader br = null;
	public ServerThread(Socket s) throws IOException{
		this.s = s;
	       	br = new BufferedReader(new InputStreamReader(s.getInputStream()));	
	}
	public void run(){
		try{
			String content = null;
			while((content = readFromClient()) != null){
				for (var s: MyServer.socketList){
					var ps = new PrintStream(s.getOutputStream());
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	private String readFromClient(){
		try
		{
			return br.readLine();
		}
		catch (IOException e)
		{
			MyServer.socketList.remove(s);
		}
		return null;
	}
}
