import java.util.HashMap;

public class ReadTestData {

	public static void main(String[] args) {
	HashMap<String,String> hash=new HashMap<String,String>();
	hash.put("Browser", "chrome");
	hash.put("application url", "http:\\facebook.com");
	hash.put("username/password", "");
		System.out.println(hash.get("Browser"));
	}

	}


