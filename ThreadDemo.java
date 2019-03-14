package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {

	public static void main(String[] args) {
		
		// Die Dateien müssen vorher erstellt wurden sein.
		String[] inFiles = {"C:\\Users\\Lukas\\my-eclipse-workspace\\ProjectsPluralsight\\src\\multithreading\\file1.txt", "./file2.txt", "./file3.txt", "./file4.txt", "./file5.txt", "./file6.txt" }; // Pfade der Dateien werden hier eingefügt.
		String[] outFiles = {
				"C:\\Users\\Lukas\\my-eclipse-workspace\\ProjectsPluralsight\\src\\multithreading\\file1.out.txt, ./file2.out.txt, ./file3.out.txt, ./file4.out.txt, ./file5.out.txt, ./file6.out.txt" }; // Pfade der Dateien werden hier eingefügt.

		// So werden alle Threads erzeugt und durchlaufen.
		// Wird erst beendet wenn alle Threads gleichzeitig durchlaufen sind, 
		// egal ob es 10 oder 1000 Threads sind.
		// Kann zu sehr langen Laufzeiten führen.
//		Thread[] threads = new Thread[inFiles.length];
//
//		for (int i = 0; i < inFiles.length; i++) {
//			Adder adder = new Adder(inFiles[i], outFiles[i]);
//			threads[i] = new Thread(adder);
//			threads[i].start();
//		}
//
//		for(Thread thread: threads) {
//			try {
//				thread.join();  // Blocks waiting for thread completion
//			} catch (InterruptedException e) {
//				e.getMessage();
//			}
//		}
		
		// Durch ExecutorService kann festgelegt werden, wie viele Threads gleichzeitig laufen.
		// Hier zum Beispiel 2.
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// Schaut, ob die Threads im Hintergrund erfolgreich sind oder nicht (guckt sich das Resultat an)
		// Falls nicht wird die Exception an den Mainthread weitergegeben und dargestellt.
		Future<Integer>[] results = new Future[inFiles.length];
		
		for(int i = 0; i < inFiles.length; i++) {
			Adder adder = new Adder(inFiles[i]);
			results[i] = es.submit(adder);
		}
		
//		try{
//	        es.shutdown(); // Um ExcecutorService wieder zu schließen.
//	        System.out.println(es.awaitTermination(60, TimeUnit.SECONDS));
//      } catch(Exception e) {
//	        e.getMessage();
//      }
		
		for(Future<Integer> result: results) {
			try {
				int value = result.get(); // blockt, bis Wiedergabewert gegeben ist
				System.out.println("total: " + value);
			} catch(ExecutionException e) {
				Throwable adderEx = e.getCause();
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}
