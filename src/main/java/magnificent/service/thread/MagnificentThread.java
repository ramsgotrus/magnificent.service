package magnificent.service.thread;
import java.io.IOException;
/**
* Class to start thread
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magnificent.service.HealthResponse;
import magnificent.service.ResponseDetails;
import magnificent.service.ResponseService;
@Service
public class MagnificentThread extends ResponseCodeCheck{
	@Autowired
	private ResponseService responseService;
    //method to start thread
	public void responseServiceStart() {
		// run in a second
		  final long timeInterval = 5000;
		  Runnable runnable = new Runnable() {
			  public void run() {
			    while (true) {
			     
			     try {
					ResponseDetails responsDetails= getStatus("http://localhost:12345/");
					responseService.addResponse(new HealthResponse(responsDetails.getTimestamp(),responsDetails.getCode()));
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			      try {
			       Thread.sleep(timeInterval);
			      } catch (InterruptedException e) {
			        e.printStackTrace();
			      }
			      }
			    }
			  };
			  Thread thread = new Thread(runnable);
			  thread.start();
	}
}


