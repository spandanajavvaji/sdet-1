package JavaAcitvity2_4;

public class JavaAcitvity2_4 {

	public static void main(String[] args)
	{
		try {
				JavaAcitvity2_4.exceptionTest("exception handlres");
				JavaAcitvity2_4.exceptionTest("it wont execute");
				JavaAcitvity2_4.exceptionTest(null);
				JavaAcitvity2_4.exceptionTest("it will print in console");				
				
		}
		catch (CustomException ce) {
			// TODO: handle exception
			System.out.println("inside catch block:"+ ce.getMessage());
		}
	}

	static void exceptionTest(String string) throws CustomException {
		// TODO Auto-generated method stub
		if(string==null) {
			throw new CustomException("string value is null");
		}
		else
			System.out.println(string);
	}
}
