class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr1 = new char[256];
        char[] arr2 = new char[256];

        for(int i=0; i<s.length(); i++){
            char charInS = s.charAt(i);
            char charInT = t.charAt(i);

            if(arr1[charInS] == 0){ 
                arr1[charInS] = charInT;
            }
            if(arr2[charInT] == 0){ 
                arr2[charInT] = charInS;
            }
    
            if(arr1[charInS] != charInT || arr2[charInT] != charInS){
                return false;
            }
        }
        return true;
    }
}