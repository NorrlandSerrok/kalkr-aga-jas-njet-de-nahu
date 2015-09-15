import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Valutaomvandlare {
    public static void main(String[] args) {
        String indata = JOptionPane.showInputDialog("Ange aktuellt pris för euro i kronor ");
        double euro = Double.parseDouble(indata);
        indata = JOptionPane.showInputDialog("Ange antalet kronor du vill växla till euro ");
        double kronor = Double.parseDouble(indata);

        double vaxling = kronor/euro;

        DecimalFormat tva = new DecimalFormat();
        tva.setMaximumFractionDigits(2);
        String output = tva.format(vaxling);

        JOptionPane.showMessageDialog(null, "Antalet euro du får är " + output);
    }//main
}//valutaomvandlare
