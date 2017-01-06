package multiTherading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileLoaderTaskExecutor {

	public void executeTasks(String[] files) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (String fileName : files) {
			executorService.execute(new FileLoaderTask(fileName));
		}

		System.out.println("Completed scheduling the jobs..");

		executorService.shutdown();

		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		String[] files = new String[] { "file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt", "file6.txt",
				"file7.txt", "file8.txt", "file9.txt", "file10.txt", "file11.txt" };
		long startTime = System.nanoTime();

		FileLoaderTaskExecutor fileLoaderTaskExecutor = new FileLoaderTaskExecutor();
		fileLoaderTaskExecutor.executeTasks(files);

		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Total time: " + duration);

	}
}
