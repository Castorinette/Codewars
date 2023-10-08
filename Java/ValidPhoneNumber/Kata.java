public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 14 || phoneNumber.charAt(0) != '(' || phoneNumber.charAt(4)!= ')'
                || phoneNumber.charAt(5) != ' ' || phoneNumber.charAt(9) != '-'){
            return false;
        }
        for(int i = 1; i < phoneNumber.length(); i++){
            if( i!=4 && i != 5 && i!=9){
                if(!(Character.isDigit(phoneNumber.charAt(i)))){
                    return false;
                }
            }
        }

        return true;
    }
}