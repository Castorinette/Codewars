public class Converter{
    public static int binToDecimal(String inp){
        int decNum = 0;
        int power;
        for(int i = 0; i < inp.length(); i++){
            power = inp.length() - i - 1;
            decNum += (int) Math.pow (2,power) * Character.getNumericValue(inp.charAt(i));
        }
        return decNum;
    }
}