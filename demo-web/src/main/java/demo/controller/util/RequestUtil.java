package demo.controller.util;

import java.util.ArrayList;
import java.util.List;

public class RequestUtil {
	
	private static List<String> operations;
	
	static {
		operations = new ArrayList<String>();
		operations.add("select");
		operations.add("update");
		operations.add("insert");
	}
	
	public static boolean checkOperation(String operation){
		return operations.contains(operation);
	}
	
}
