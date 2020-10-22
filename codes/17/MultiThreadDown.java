public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		final var downUtil = new DownUtil("https://www.baidu.com/","ios.jpg", 4);
		downUtil.download();
		new Thread(() -> {
			while (downUtil.getCompleteRate() < 1 )
			{
				System.out.println("已经完成:" + downUtil.getCompleteRate());
				try
				{
					Thread.sleep(100);
				}
				catch (Exception ex){}
			}
		}).start();
	}
}
