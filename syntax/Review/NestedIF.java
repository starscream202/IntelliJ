package Review;

public class NestedIF {
	public static void main(String[] args) {
		String name="Ash";
		String pass="pass12";
		double bal=10.25;
		double tran=8;
		boolean trans= true;
		if(pass.equals("pass12")) {
			System.out.println("Welcome");
			if (trans) {
				System.out.println("Suck it");
			}else {
				System.out.println("Suck it 2");
			}
		}else {
			System.out.println("Password Incorrect");
		}
	}

}
