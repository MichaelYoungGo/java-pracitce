interface Person
{
	void walk();
	void sayHello();
}
class MyInvokationHandler implements InvocationHandler 
{
	/* 执行动态代理对象的所有方法，都会被替换成执行如下的invoke方法
	其中：
	proxy:代表动态代理的对象
	method:代表正在执行的方法
	args:代表调入目标方法时传入的实参
	 */
	public Objection invoke(Object proxy, Method method, Object[] args)
	{
		
	}
}
