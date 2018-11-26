package magnificent.service.controllers;
/**
* This is Controller class to call from View index.jsp
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import magnificent.service.HealthResponse;
import magnificent.service.ResponseCount;
import magnificent.service.ResponseService;
import magnificent.service.thread.MagnificentThread;

@Controller
public class MainController {
	@Autowired
	private ResponseService responseService;
	@Autowired
	private MagnificentThread magnificentThread;
	@GetMapping("/startChecking")
    public String init(HttpServletRequest req){
		magnificentThread.responseServiceStart();
		req.setAttribute("ResponseCounts", responseService.GetResponseCount());
        return "index";
		}
	@GetMapping("/getHealthResponses")
    public List<HealthResponse> GetAllResponses(){
        return responseService.GetAllGetResponses();
    }
	@GetMapping("/getHealthResponseCount")
    public List<ResponseCount> GetResponseCount(){
        return responseService.GetResponseCount();
    }
}
