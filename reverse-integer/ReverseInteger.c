int reverse(int x){
    int sum = 0, digit = 0;
    while(x != 0){
        if(sum > 0 && sum > (INT_MAX - digit) / 10)
            return 0;
        if(sum < 0 && sum < (INT_MIN - digit) / 10)
            return 0;

        digit = x % 10;
        sum = sum*10 + digit; 
        x /= 10;
    }

    return sum;
}