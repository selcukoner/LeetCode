class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length - 1;
        int maxAmount = 0;
        
        while(left < right){
            int amount = calculateAmount(left,right,height);
            if(amount > maxAmount){
                maxAmount = amount;
            }

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return maxAmount;
    }

    private int calculateAmount(int left, int right, int [] height){
        return Math.min(height[left], height[right])*(right-left);
    }
}