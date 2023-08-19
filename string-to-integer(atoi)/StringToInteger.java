class Solution {
    public int myAtoi(String s) {
        String numStr = s.trim();
        int sign = 1;
        int charIndex=  0;

        if(numStr.length() == 0 )
            return 0;

        if(numStr.charAt(0) == '+'){
            charIndex++;
        }else if(numStr.charAt(0) == '-'){
            sign *= -1;
            charIndex++;
        }

        int number = 0;
        while(charIndex < numStr.length() && Character.isDigit(numStr.charAt(charIndex))){
            int digit = numStr.charAt(charIndex) - 48;

            if(sign > 0 && (Integer.MAX_VALUE - digit) / 10.0 < number){
                return Integer.MAX_VALUE;
                
            }
            if(sign < 0 && Math.abs(((Integer.MIN_VALUE) + digit) / 10.0) <= number){
                return Integer.MIN_VALUE;
            }

            number = 10*number + digit;
            charIndex++;
        }
    
        return sign*number;
    }
}