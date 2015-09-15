import javax.swing.*;

public class ExFel {
	public static void main(String[] arg) {
		int tal1, tal2;
		double tal3;
		String indata = JOptionPane.showInputDialog("Ange första talet");
		tal1 = Integer.parseInt(indata);
		indata = JOptionPane.showInputDialog("Ange andra talet");
		tal2 = Integer.parseInt(indata);
		tal3 = (double) tal1 / tal2;
		JOptionPane.showMessageDialog(null, "Resultatet blev " + tal3);
	} //main
} // ExFel
