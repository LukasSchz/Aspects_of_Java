package programme;

// Hier wird durch das synchronized der Rumpf refreshed und geflushed
// Durch das lock-Object wird die Zuweisung des derzeitigen Threads geregelt.
// Wenn ein Thread das lock-Object hat, kann der andere Thread solange nicht fortfahren bis das lock-Object wieder freigegeben wird.

public class SynchedThread2 implements Runnable {

	static Object lock = new Object();

	int x;

	@Override
	public void run() {
		int i;
		for (i = 0; i < 2000; i++) {
			synchronized (this) {
				x++;
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished after " + i + " loops");
	}

	public static void main(String[] args) {

		SynchedThread2 c = new SynchedThread2();
		new Thread(c).start();
		new Thread(c).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (c) {
			System.out.println("x is: " + c.x);
		}
	}
}
