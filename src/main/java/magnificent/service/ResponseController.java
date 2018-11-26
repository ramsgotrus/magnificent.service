package magnificent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import magnificent.service.thread.MagnificentThread;
/**
* This class is for Rest API controller which contains all methods
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/
@RestController
public class ResponseController {
	@Autowired
	private ResponseService responseService;
	/*Method to get all responses in jason format*/
	@Autowired
	private MagnificentThread magnificentThread;
	@RequestMapping("/magnificentCheck")
    public List<HealthResponse> GetAllResponses(){
        return responseService.GetAllGetResponses();
    }
	/*Method to get all responses count*/
	@RequestMapping("/getResponseCount")
    public List<ResponseCount> GetResponseCount(){
        return responseService.GetResponseCount();
    }
	/*Method to start thread*/
	@RequestMapping("/magnificentStart")
    public void StartThread(){
		magnificentThread.responseServiceStart();
    }
	
		
}
