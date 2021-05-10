package lesson10.labs.prob6;

public class Main {
	static Queue queue;

	public static void main(String[] args) throws InterruptedException {
		queue = new Queue();
		createAndTestThreads();
		Thread.sleep(100);
		System.out.println(queue.count()); // expected 400000
	}

	private static void createAndTestThreads() {
		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				queue.add("Item" + i);
			}
		};

		for (int i = 0; i < 400; i++) {
			new Thread(r).start();
		}
	}
}
