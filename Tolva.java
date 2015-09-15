import javax.swing.*;
import java.util.Scanner;

public class Tolva {
        public static void main(String[] args) {
            String Indata = JOptionPane.showInputDialog("Ange omfång, segelyta, längd samt fribordshöjd ");
            Scanner into = new Scanner(Indata);
            double omfang = into.nextDouble();
            double segelyta = into.nextDouble();
            double langd = into.nextDouble();
            double fribord = into.nextDouble();
            double fardigyta = Math.sqrt(segelyta);
            double utvarde = (((2*omfang) + fardigyta + langd - fribord)/2.37);

            if (utvarde > 11.95 && utvarde < 12.05 )
                JOptionPane.showMessageDialog(null, "Grattis, din båt är en 12a! ");
            else
                JOptionPane.showMessageDialog(null, "Tyvärr, din båt är inte en 12a ");

        }//main
}//Tolva



