public class WizardApplication {

	public static void main(String[] args) {
	

		Wizard wiz = new Wizard("Gandalf", 100, 1, true);
		
		System.out.println(wiz.toString());
		
		System.out.println(wiz.getHealth());
		
		wiz.takeDamage(20);
		
		
		System.out.println();
		
		
		Wizard wiz2 = new Wizard ("Dumbledore", 100, 0, false);
		
		System.out.println(wiz2.toString());
		
		System.out.println(wiz2.getHealth());
		
		wiz2.takeDamage(20);
		
		
		
	}//end main method
}//end class