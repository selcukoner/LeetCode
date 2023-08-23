class Solution {
    public int romanToInt(String s) {
        int[] map =new int[128];
        map['M'] = 1000; map['D'] = 500; map['C'] = 100; map['L'] = 50; map['X'] = 10; map['V'] = 5; map['I'] = 1;

        int result = 0;
        int previousValue = 0;

        for(int j =0 ; j < s.length(); j++){ 
            int currentValue = map[s.charAt(j)];

            if(previousValue < currentValue){
                result -= 2*previousValue; 
            }
            
            result += currentValue;
            previousValue = currentValue;
        }
        return result;
    }
}