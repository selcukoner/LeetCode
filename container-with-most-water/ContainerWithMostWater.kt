class Solution {
    fun maxArea(height: IntArray): Int {
        var left:Int = 0;
        var right:Int = height.size-1;
        var maxAmount:Int = 0;

        while(left < right){
            var amount  = calculateAmount(left, right, height)

            if(amount > maxAmount) maxAmount = amount
            if(height[left] < height[right]) left++ else right--
        }
        return maxAmount
    }
    private fun calculateAmount(left:Int, right: Int, height:IntArray): Int
    {
        return kotlin.math.min(height[left],height[right]) * (right - left);
    }
}