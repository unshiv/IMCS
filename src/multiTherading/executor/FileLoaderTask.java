package multiTherading.executor;

public class FileLoaderTask implements Runnable {
	
	//This is input to your task, set any such input like this.
	private String fileName;
	
	FileLoaderServiceApi fileLoaderServiceApi;

	{
		fileLoaderServiceApi = new FileLoaderService();
	}
	
	public FileLoaderTask(String fileName) {
		super();
		this.fileName = fileName;
	}

/*	public FileLoaderTask() {
		super();
	}
*/
	public void run() {
		fileLoaderServiceApi.loadFile(fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
