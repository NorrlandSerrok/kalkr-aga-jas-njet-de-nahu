import javax.swing.*;

public class Paskdagen {
    public static void main(String[] args) {
        boolean shouldcontinue = true;
        while (shouldcontinue) {
            String inputValue = JOptionPane.showInputDialog("Ange ange årtal mellan 1900 och 2099: ");
            shouldcontinue = inputValue != null;
            if (shouldcontinue) {
                int inputDate = Integer.parseInt(inputValue);
                if (inputDate >= 1900 && inputDate <= 2099 ){
                    int N = inputDate-1900;
                    int A = N%19;
                    int B = ((7*A)+1)/19;
                    int M = ((11*A)+4-B)%29;
                    int Q = N/4;
                    int W = (N+Q+31-M)%7;
                    int D = 25-M-W;
                    int Dut = 31+D;

                    if (D >= 1 )
                        JOptionPane.showMessageDialog(null, "Påskdagen infaller den " +D + " april ");
                    else
                        JOptionPane.showMessageDialog(null, "Påskdagen infaller den " +Dut + " mars ");}
                else
                    JOptionPane.showMessageDialog(null, "Mata in ett korrekt årtal ");
            }
        }
    }
}


