package ISP;

public class Sender implements Contact{

	@Override
	public String getEmailAddress(String ea) {
		// TODO Auto-generated method stub
		return ea;
	}

	@Override
	public String getTelephone(String t) {
		// TODO Auto-generated method stub
		return t;
	}
	public static void sender(Contact c, String message) {
		//Envía un mensaje 
	}
	
}