package magnificent.service.thread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import magnificent.service.ResponseDetails;
/**
*Class is for checking response for url:  http://localhost:12345/
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/
public class ResponseCodeCheck {
	ResponseCodeCheck() {
	}
	//method for checking responses for http://localhost:12345/
	public ResponseDetails getStatus(String url) throws IOException {
		Date date= new Date();	 
		long time = date.getTime();
		String result = "";
		int code = 200;
		try {
			URL siteURL = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.connect();
			code = connection.getResponseCode();
			return new ResponseDetails(new SimpleDateFormat("yyyyMMddHHmmss").format(time),Integer.toString(code));
			
		} catch (Exception e) {
			result = "Wrong domain - Exception: " + e.getMessage();
		}
		System.out.println(url + "\t\tStatus:" + result);
		return new ResponseDetails("","");
	}
}
