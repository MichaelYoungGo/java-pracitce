import java.util.ArrayDequeQueue;

public class ArrayDequeQueue {
	public static void main(String[] args){
		ArrayDeque queue = new ArrayDeque();
		//依次添加三个元素
		queue.offer("疯狂Java讲义");
		queue.offer("轻量级JavaEE企业应用实战");
		queue.offer("疯狂Android讲义");

		System.out.println(queue);

		System.out.println(queue.peek());


	}
}
