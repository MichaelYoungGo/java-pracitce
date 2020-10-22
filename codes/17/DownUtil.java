import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStream;

public class DownUtil
{
	// 定义下载路径
	private String path;
	// 指定下载文件的位置
	private String targetFile;
	// 定义需要使用多少个线程去下载资源
	private int threadNum;
	// 定义下载资源的线程对象
	private DownThread[] threads;
	// 定义下载文件的大小
	private int fileSize;

	public DownUtil(String path, String targetFile, int threadNum)
	{
		this.path = path;
		this.threadNum = threadNum;
		// 初始化threads数组
		threads = new DownThread[4];
		this.targetFile = targetFile;
	}
	public void download() throws Exception
	{
		var url = new URL(path);
		var conn = (HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setRequestMethod("GET");
		conn.setRequestProperty(
			"Accept",
			"image/gif, image/jpeg, image/pjpeg, image/pjpsg, "
			+ "apllication/x-shockwave-flash, aplication/xaml+xml,"
			+ "apllication/vnd.ms-xpsdocument, aplication/x-ms-xbap,"
			+ "apllication/x-ms-application, aplication/vnd.ms-excel,"
			+ "apllication/vnd.ms-powerpoint, aplication/msword, */*");
		conn.setRequestProperty("Accept-Language", "zh-CN");
		conn.setRequestProperty("Charset", "UTF-8");
		conn.setRequestProperty("Connection", "Keep-Alive");

	}
	// 获取下载的完成百分比
	public double getCompleteRate()
	{
		var sumSize = 0;
		//统计多个线程已经下载的总ption in thread "Thread-0" java.lang.NullPointerException sumSize = 0;
		for (var i = 0; i < threadNum; i++)
		{
			System.out.println("point A");
			System.out.println(threads[i]);
			//System.out.println(threads[i].length);
			//sumSize += threads[i].length; 
		}
		return sumSize * 1.0 / fileSize;
	}
	//内部类
	private class DownThread extends Thread 
	{
		//当前线程的下载位置
		private int startPos;
		//定义当前进程负责下载的文件大小
		private int currentPartSize;
		//当前线程已下载的文件块
		private RandomAccessFile currentPart;
		//定义该线程已经下载的字节数 
		public int length;
		public DownThread(int startPos, int currentPartSize, RandomAccessFile currentPart)
		{
			this.startPos = startPos;
			this.currentPartSize = currentPartSize;
			this.currentPart = currentPart;
		}
		public void run()
		{
			try
			{
				System.out.println("线程启动");
				var url = new URL(path);
				var conn = (HttpURLConnection)url.openConnection();
				conn.setConnectTimeout(5*1000);
				conn.setRequestMethod("GET");
				conn.setRequestProperty(
					"Accept",
					"image/gif, image/jpeg, image/pjpeg, image/pjpsg, " 
					+ "apllication/x-shockwave-flash, aplication/xaml+xml,"
					+ "apllication/vnd.ms-xpsdocument, aplication/x-ms-xbap,"
					+ "apllication/x-ms-application, aplication/vnd.ms-excel,"
					+ "apllication/vnd.ms-powerpoint, aplication/msword, */*");
				conn.setRequestProperty("Accept-Language", "zh-CN");
				conn.setRequestProperty("Charset", "UTF-8");
				InputStream inStream = conn.getInputStream();
				inStream.skip(this.startPos);
				var buffer = new byte[1024];
				var hasRead = 0;
				while ( length < currentPartSize && (hasRead = inStream.read(buffer)) != -1 )
				{
					currentPart.write(buffer, 0, hasRead);
					// 累计该线程下载的总大小
					length += hasRead; 
				}
				currentPart.close();
				inStream.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
