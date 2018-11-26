package magnificent.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

/**
* Class for Response service for all methods
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/

@Service
public class ResponseService {
	
	private	List<HealthResponse> allResponses=new ArrayList<>( Arrays.asList(
			new HealthResponse("", "")
    		));
	public List<HealthResponse>GetAllGetResponses()
	{	 
		return allResponses;
	}
	public void addResponse(HealthResponse response) {
		allResponses.add(response);
	}
	public List<ResponseCount>GetResponseCount()
	{	 
		List<ResponseCount> getCodeList = new ArrayList<ResponseCount>();
		List<HealthResponse> responseCount = allResponses;
	    Map<String, Long> designationWiseTotalSalary = responseCount.stream().collect(Collectors
	            .groupingBy(s->s.getCode()== null ? "Empty" : s.getCode(),Collectors.counting()));
	    designationWiseTotalSalary.forEach((k, v) -> {
	    	getCodeList.add(new ResponseCount(k ,v));
	        System.out.println(k + " : " + v);
	    });
		return getCodeList;
	}
	
	
}
