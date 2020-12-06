package JavaAcitvity2_4;

class CustomException extends Exception{
	private String message=null;
	public CustomException(String message) {
		this.message = message;
	}
	
	private String getmessage() {
		return message;
	}	

}
