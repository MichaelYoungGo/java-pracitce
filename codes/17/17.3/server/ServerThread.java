public class ServerThread extends Thread
{
	private Socket socket;
	BufferedReader br = null;
	PrintStream ps = null;
	public ServerThread(Socket socket)
	{
		this.socket = socket;
	}
	public void run()
	{
		try
		{
			//获取Socket对用的输入流
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//获取Socketd对应的输出流
			ps = new PrintStream(socket.getOutputStream());
			String line = null;
			while((line = br.readLine()) != null)
			{
				if (line.startsWith(CrazyitProtocol.USER_ROUND) && line.endsWith(CrazyitProtocol.USER_ROUND))
				{
					//得到真实信息
					String username = getRealMsg(line);
					//如果真实信息
					if(Server.clients.map.containsKey(userName))
					{
						System.out.println("");
					}
					else
					{
					
					}
				}
				else if ()
				{}
				else 
				{}	
			}
		}
		catch ()
		{}
		//将读到的文字去掉前后的协议字符，恢复成真实数据
		return line.substring(CrazyitProtocol.PROTOCOL_LEN,
				line.length() - CrazyitProtocol.PROTOCOL_LEN);
	}
}
