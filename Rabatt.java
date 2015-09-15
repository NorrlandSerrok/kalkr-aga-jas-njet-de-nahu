import javax.swing.*;

public class Rabatt {
    public static void main(String[] arg) {
        String indata = JOptionPane.showInputDialog("Ange varans pris i kronor: ");
        double perStyck = Double.parseDouble(indata);
        indata = JOptionPane.showInputDialog("Ange antalet enheter av varan: ");
        int antal = Integer.parseInt(indata);
        double bruttoPris = (double) antal * perStyck;
        double rabatt;

        {  if (bruttoPris > 750 && bruttoPris < 1500 )
            rabatt = bruttoPris * 0.05;

        else if (bruttoPris > 1500 && bruttoPris < 3000 )
            rabatt = bruttoPris * 0.1;

        else if (bruttoPris > 3000 )
            rabatt = bruttoPris * 0.15;

        else
            rabatt = 0;}

        double nettoPris;
        nettoPris = bruttoPris - rabatt;
        JOptionPane.showMessageDialog(null, "Priset blir: " + nettoPris + " kronor." +
                " Rabatten är:" + rabatt +" kronor och bruttopriset är" + bruttoPris + " kronor" );

    }//main
}//Rabatt