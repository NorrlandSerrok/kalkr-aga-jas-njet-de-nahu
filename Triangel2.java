import javax.swing.*;

public class Triangel2 {
    public static void main(String[] arg){

        String indata = JOptionPane.showInputDialog("Ange längd för kateter 1: ");
        int kat1 = Integer.parseInt(indata);
        indata = JOptionPane.showInputDialog("Ange längd för kateter 2: ");
        int kat2 = Integer.parseInt(indata);

        double hypotenusa;
        hypotenusa = Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2));
        JOptionPane.showMessageDialog(null, "En rätvinklig triangel med sidorna "
                + kat1 + " och " + kat2 + " har hypotenusan" + Math.round(hypotenusa));

    }
}