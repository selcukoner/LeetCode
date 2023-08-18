class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestCounter = 0;
        boolean[] arr = new boolean[256];
        char[] arrChar = s.toCharArray();
        int strLength = s.length();
        Arrays.fill(arr,false);

        for(int i=0; i< strLength; i++){
            int counter = 0;
            for(int j=i; j<strLength; j++){
                char c = arrChar[j];
                if(arr[c] == true){
                    break;
                }
                arr[arrChar[j]] = true;
                counter++;
            }
            Arrays.fill(arr,false);

            if(counter > longestCounter){
                longestCounter = counter;
            }

            if(longestCounter == 256)
                return longestCounter;
        }
        return longestCounter;
    }
}