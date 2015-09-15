import javax.swing.*;
import java.text.DecimalFormat;

public class Kastberakning {
    public static void main(String[] args) {
        String indata = JOptionPane.showInputDialog("Ange utgångshastighet i m/sek ");
        double hastighet = Double.parseDouble(indata);
        indata = JOptionPane.showInputDialog("Ange kastvinkeln i grader ");
        double vinkel = Double.parseDouble(indata);
        double radian = Math.toRadians(vinkel);
        double tvaradian = (2*radian);
        double del1 = Math.sin(tvaradian);
        double del2 = Math.sin(radian);

        double hojden = (Math.pow(hastighet,2) * Math.pow(del2,2))/(2*9.81);
        double kast = (Math.pow(hastighet,2) * (del1)) /(9.81);

        DecimalFormat tva = new DecimalFormat();
        tva.setMaximumFractionDigits(2);
        String hojd = tva.format(hojden);
        String kastet = tva.format(kast);

        JOptionPane.showMessageDialog(null, "Banhöjden blir " + hojd + " meter och kastlängden blir " +kastet +" meter");

            }
}


