package programme;

public class SynchedThread1 implements Runnable {

	private static final long LIMIT = 10000000000L; // 10 Milliarden

	// volatile bedeutet schwankende Varialbe und
	// kann nur auf Instanz-Variablen angewendet werden.
	// volatile zwingt, dass nach jedem Lesezugriff ein Refresh und 
	// nach jedem Schreibzugriff ein Flush der Variablen erfolgt.
	// Stellt sequentiell Consistency sicher, bloß es werden keine Logs benötigt, deswegen schneller.
	// Stellt nur sequentiell Consistency sicher keine Race-Conditions.
	// volatile funktioniert nur bei nicht unterbrechbaren (atomaren) Funktionen = einfacher Lesezugriff/Schreibzugriff
	
	volatile boolean alive;
	volatile long i;

	@Override
	public void run() {
		System.out.println("Thread starts...");
		i = 0;
		alive = true;
		while (true) {
			// synchronized (this) {
				if (alive) {
					i++;
				} else {
					break;
				}
			// }
		}
		System.out.println("Thread ends...");
	}

	public static void main(String[] args) {
		SynchedThread1 c = new SynchedThread1();
		new Thread(c).start();

		while (Thread.activeCount() > 1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			long iNow;
			synchronized (c) {
				iNow = c.i;
			}
			System.out.println(iNow);
			if (iNow > LIMIT) {
				synchronized (c) {
					c.alive = false;
				}
				System.out.println("THREAD STOPPED! (alive = " + c.alive + ")");
			}
		}
		System.out.println("Program exits...");
	}

}
