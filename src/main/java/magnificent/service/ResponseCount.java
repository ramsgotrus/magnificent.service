package magnificent.service;
/**
* This class is for entity object for health response to get status count 
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/
public class ResponseCount {
	
	public ResponseCount(String responseCode,Long v) {
		this.responseCode=responseCode;
		this.codeCount=v;
	}
    private String responseCode;
    
    private Long codeCount;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Long getCodeCount() {
		return codeCount;
	}

	public void setCodeCount(Long codeCount) {
		this.codeCount = codeCount;
	}
}
