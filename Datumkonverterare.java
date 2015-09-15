import javax.swing.*;

public class Datumkonverterare {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        while (shouldContinue) {
            String inputValue = JOptionPane.showInputDialog("Ange datumformat enligt yymmdd: ");
            shouldContinue = inputValue != null;
            if (shouldContinue) {
                int inputDate = Integer.parseInt(inputValue);

                int day = inputDate%100;
                inputDate = inputDate-day;
                int month = (inputDate%10000)/100;
                inputDate = inputDate-(inputDate%1000);
                int year = inputDate/10000;

                String outyear = padDateNumber(year);
                String outmonth = padDateNumber(month);
                String outday = padDateNumber(day);

                JOptionPane.showMessageDialog(null,"Datumet blir i konverterad form " +outmonth +"/" +outday +"/" + outyear);
            }
        }
    }

    private static String padDateNumber(int ordinal) {
        if (ordinal < 10) {
            return "0" + ordinal;
        }
        else {
            return Integer.toString(ordinal);
        }
    }
}
