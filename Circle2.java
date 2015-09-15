import javax.swing.*;

public class Circle2 {
    public static void main(String[] arg){

        String indata = JOptionPane.showInputDialog("Ange cirkelns radie: ");
        int radie = Integer.parseInt(indata);
        double area = Math.PI * Math.pow(radie, 2);
        double omkrets = 2 * Math.PI * radie ;

        JOptionPane.showMessageDialog(null, "En cirkel med radien "
                + radie + " har arean " + area + " och omkretsen " +omkrets );

    }
}

