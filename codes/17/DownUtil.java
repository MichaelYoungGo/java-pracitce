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
		
	}
	//内部类
	private class DownThread extends Thread 
	{
		//当前线程的下载位置
		private int startPos;
		//定义当前进程负责下载的文件大小
		private int currentPartSize;
		//当前线程已下载的字节数
		private RandomAccesssFile currentPart;


	}
}
