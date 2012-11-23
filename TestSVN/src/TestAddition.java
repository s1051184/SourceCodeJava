import javax.swing.JOptionPane;


public class TestAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Start Program");
		int a= Integer.parseInt(JOptionPane.showInputDialog("Enter 1st number"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd number"));
		int resultAddition = Addition(a,b);
		int resultSubtraction = Subtration(a,b);
		JOptionPane.showMessageDialog(null, "The result is \n Addition : "+resultAddition+"\n Subtraction : "+resultSubtraction);
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

}
