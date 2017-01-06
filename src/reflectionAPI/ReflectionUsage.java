package reflectionAPI;

import java.io.File;

public class ReflectionUsage {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\sprak\\IdeaProjects\\IMCS\\src\\reflectionAPI\\BookClassInfo.txt");
		ReflectUtilAPI reflectUtilAPI = new ReflectUtilAPI();
		Object object = reflectUtilAPI.constructObject(file);
		System.out.println(object);
	}
}
