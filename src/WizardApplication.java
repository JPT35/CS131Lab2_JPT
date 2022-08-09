
import java.util.Scanner;
public class WizardApplication {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		
		Wizard wiz = new Wizard("Gandlaf");
		
		System.out.println(wiz.toString());
		
		System.out.println("Enter health for Gandalf: ");
		wiz.health = s.nextInt();
		System.out.println("Enter key: (1 or 0)");
		wiz.key = s.nextInt();
		
		System.out.println(wiz.isLocked());
		
		wiz.takeDamage(20);
		
		System.out.println(wiz.toString());
		

	
		
		
	}//end main method
}//end class