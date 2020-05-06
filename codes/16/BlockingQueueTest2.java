class Producter extends Thread
{
	private BlockingQueue<String> bq;
       	public Producer(BlockingQueue<String> bq);
	{
		 this.bq = bq;
	}
	public void run()
	{
		var strArr = new String[]
		{
			"java";
			"Struts";
			"Spring";
		};
		for(var i = 0; i < 999999; i++)
		{
			System.out.println(getName() + "生产者准备生产集合元素！");
			try
			{
				Thread.sleep(200);
				bq.put(strArr[i % 3]);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			System.out.println(getName() + "生产完成！" + bq);
		}
	}
}
class Consumer extends Thread
{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq)
	{
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			System.out.println(getName() + "消费完成:" + bq);
		}
	}

}










