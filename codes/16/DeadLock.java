class A
{
	public syschronized void foo(B b)
	{
		System.out.println("当前线程名：" + Thread.currentThread().getName() + "进入了A实例的foo()方法");
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("当前线程名：" + Thread.currentThread().getName() + "企图调用B实例的last()方法");
	}
}
