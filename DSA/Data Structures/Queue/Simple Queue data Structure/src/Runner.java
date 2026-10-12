
import data.models.Queue;

public class Runner {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(4);	

		queue.enqueue(10);	

		queue.enqueue(-2);
		
		System.out.println("Removing number:" + queue.dequeue());

		System.out.println("Removing number:" + queue.dequeue());

		queue.show();
	}
	
}
