package magnificent.service;
/**
* Response details entity object to get in json format
* @author  Ram Gotru
* @version 1.0
* @since   2018-11-21 
*/
public class ResponseDetails {
	private String timestamp;
    private String code;
	public ResponseDetails(String timeStamp, String code) {
		super();
		this.code=code;
		this.timestamp=timeStamp;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
