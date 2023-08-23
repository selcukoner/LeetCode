int romanToInt(char * s){
    int map[128];
    map['M'] = 1000; map['D'] = 500; map['C'] = 100; map['L'] = 50; map['X'] = 10; map['V'] = 5; map['I'] = 1;

    int result = 0;
    int previousValue = 0;

    int i = 0;
    int ch; // ascii value of character
    while((ch=s[i++]) != '\0'){ 
        int currentValue = map[ch];

        if(previousValue < currentValue){
            result -= 2*previousValue; 
        }
            
        result += currentValue;
        previousValue = currentValue;
    }
    return result;
}