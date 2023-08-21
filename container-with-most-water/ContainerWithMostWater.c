int maxArea(int* height, int heightSize){
    int left = 0;
    int right = heightSize -1;
    int maxAmount = 0, amount = 0, min = 0;
    int distance = right;

    while(left < right){
        min = height[left] < height[right] ? height[left] : height[right];
        amount = min * distance;

        if(amount > maxAmount){
            maxAmount = amount;
        }

        height[left] < height[right] ? left++ : right--;
        distance--;
    }
    return maxAmount;
}