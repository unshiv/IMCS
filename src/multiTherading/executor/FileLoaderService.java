package multiTherading.executor;

import java.util.Random;

public class FileLoaderService implements FileLoaderServiceApi {

	public void loadFile(String fileName) {
		System.out.println("Started loading file... " + fileName);
		
		try {
			Thread.sleep(new Random().nextInt(3) * 1000); //new Random().nextInt(3)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed loading file... " + fileName);
	}

}
