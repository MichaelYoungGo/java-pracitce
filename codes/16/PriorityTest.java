public class PriorityTest extends Thread
{
	public PriorityTest(String[] args)
	{
		super(name);
	}
	public void run()
	{
		for (var i = 0; i < 50; i++ )
		{	
			System.out.println(getName() + ",其优先级是：" + getPriority() + ",循环变量的值为：" + i);
		}
	}
	public static void main(String[] args)
	{
		Thread.currentThread().setPriority(6);
		for( var i = 0; i < 30; i++)
		{
			var low = new PriorityTest("低级");
			low.start();

		}
		
	}
}
