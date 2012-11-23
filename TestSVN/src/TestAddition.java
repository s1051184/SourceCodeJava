import javax.swing.JOptionPane;


public class TestAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Start Program");
		int operator = Integer.parseInt(JOptionPane.showInputDialog("Please select the operation\n 1. Addition \n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Exit"));
		if(operator == 5){
			System.exit(0);
		}
		int a= Integer.parseInt(JOptionPane.showInputDialog("Enter 1st number"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd number"));
		switch(operator){
			case 1:
				int resultAddition = Addition(a,b);	
				JOptionPane.showMessageDialog(null, "The result is : "+resultAddition);
				break;
			case 2:
				int resultSubtraction = Subtration(a,b);
				JOptionPane.showMessageDialog(null, "The result is : "+resultSubtraction);
				break;
			case 3:
				int resultMultiplication = Multiplication(a,b);
				JOptionPane.showMessageDialog(null, "The result is : "+resultMultiplication);
				break;
			case 4:
				int resultDivision = Division(a,b);
				JOptionPane.showMessageDialog(null, "The result is : "+resultDivision);
				break;
		}
		
		System.out.print(a);
	}
	public static int Addition(int a,int b){
		System.out.print("Adding Number");
		return a+b;
	}
	public static int Subtration(int a,int b){
		System.out.print("Adding Number");
		return a-b;
	}
	public static int Multiplication(int a,int b){
		System.out.print("Adding Number");
		return a*b;
	}
	public static int Division(int a,int b){
		System.out.print("Adding Number");
		return a/b;
	}


}
