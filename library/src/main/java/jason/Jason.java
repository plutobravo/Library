package jason;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class Jason {

	public static void main(String[] args) throws IOException {
		String pa = "C:\\Users\\pooja\\Desktop\\New.json";
		String jason = new String(Files.readAllBytes(Paths.get(pa)));
		JSONObject obj = new JSONObject(jason);
		String s = obj.getJSONObject("user").getString("user name");
		System.out.println(s);

	}

}
