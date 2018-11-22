package magnificent.service;
/**
* This class is for entity object for health response to get response object
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/

public class HealthResponse {
	private String timestamp;
    
    private String code;
	
	public  HealthResponse(String timeStamp, String code) {
		this.timestamp=timeStamp;
		this.code=code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
