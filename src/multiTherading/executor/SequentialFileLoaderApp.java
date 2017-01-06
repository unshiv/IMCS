package multiTherading.executor;

public class SequentialFileLoaderApp {
		public static void main(String[] args) {
			String[] files = new String[] { "file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt", "file6.txt",
					"file7.txt", "file8.txt", "file9.txt", "file10.txt", "file11.txt" };
			FileLoaderServiceApi fileLoaderServiceApi = new FileLoaderService();
			
			long startTime = System.nanoTime();
			
			for (String fileName : files) {
				fileLoaderServiceApi.loadFile(fileName);
			}
			
			long endTime = System.nanoTime();
			
			long duration = (endTime - startTime);
			System.out.println("Total time: " + duration);
		}

	}
