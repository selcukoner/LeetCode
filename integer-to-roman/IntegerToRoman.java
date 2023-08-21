class Solution {
    public String intToRoman(int num) {
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
        int [] values ={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder resultingSb = new StringBuilder("");
        int temp = num;
        
        for(int i = 0; i < numerals.length; i++){
            int repetition = temp / values[i]; // number of times numeral repeats successively    
            temp %= values[i];
            while(repetition > 0){
                resultingSb.append(numerals[i]);
                repetition--;
            }
        }

        return resultingSb.toString();
    }
}