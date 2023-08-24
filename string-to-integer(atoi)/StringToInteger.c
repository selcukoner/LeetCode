int myAtoi(char * s){
    while(*s == ' '){ // skip leading whitespace
        s++; 
    }

    if(s == '\0'){ // check if end of string
        return 0;
    }
         
    int sign = 1;
    if(*s == '+' ){ // determine sign 
        sign = 1;
        s++;
    }else if(*s == '-'){
        sign =-1;
        s++;
    }
      
    int result = 0;
    while((*s >= 48) && (*s <=57)){ // ascii values of numbers from 0 to 9
        int digit = (*s-48);

        if(sign > 0 &&  result >= (INT_MAX - digit)/10.0){
            return INT_MAX;
        }

        if(sign < 0 && (- result) <= (INT_MIN+ digit) / 10.0 ){
            return INT_MIN;
        }

        result = result * 10 + digit;
        s++;     
    }

    return sign*result;
}