class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        if(s.length() != t.length())
            return false;

        int size = s.length();

        for(int i=0; i < size; i++){
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;    
        }

        for(int i = 0; i < 26; i++){
            if(sArray[i] !=  tArray[i] ){
                return false;
            }
        }
        return true;
    }
}