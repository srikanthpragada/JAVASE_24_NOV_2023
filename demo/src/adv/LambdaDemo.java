package adv;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread with Runnable!");
	}
}

public class LambdaDemo {

	public static void print() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task());
		t1.start();

		// Lambda Expression
		Thread t2 = new Thread(() -> System.out.println("Lambda Thread"));
		t2.start();

		// Lambda Block
		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t3.start();

		// Method Reference
		Thread t4 = new Thread(LambdaDemo::print);
		t4.start();

	}

}
