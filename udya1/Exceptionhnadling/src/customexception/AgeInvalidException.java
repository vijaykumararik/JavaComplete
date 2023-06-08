package customexception;

public class AgeInvalidException extends RuntimeException {
     private String message;
	public AgeInvalidException(String message ) {
	  this.message=message;
	}
	@Override
	public String getMessage() {
		
		return message;
	}
		 
		

}
