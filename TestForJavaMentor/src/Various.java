public class Various
{
    public static String numeric;
    int value;
    boolean arabicNumber;
    boolean romanNumber;
    public int getNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                arabicNumber = true;
            } else if (Character.isLetter(number.charAt(i)) && (number.charAt(i) == 'I' || number.charAt(i) == 'V' || number.charAt(i) == 'X')) {
                romanNumber = true;
            }
            else {
                value = 3 / 0;
            }
        }
        if (arabicNumber) {
            value = Integer.parseInt(number);
            numeric = "arabic";
        }
        if (romanNumber) {
            int[] arabDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            String[] RomanDigits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            for (int i = 0; i < RomanDigits.length; i++) {
                if (number.equals(RomanDigits[i])) {
                    value = arabDigits[i];
                    numeric = "roman";
                }

            }
        }
        return value;
    }
    public String getNumeric(String number)
    {
    return numeric;}
}
