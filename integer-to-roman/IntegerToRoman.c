char * intToRoman(int num){
    char *numerals[]= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
    int values[] ={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char *resultingStr;
    int arraySize = sizeof(values) / sizeof(values[0]); 

    resultingStr = (char*) malloc(sizeof(char)*arraySize*3);
    if(resultingStr == NULL){
        printf("memory not allocated");
        exit(0);
    }
    resultingStr[0] = '\0';

    int temp = num;
    int repetition = 0;
    for(int i = 0;i < arraySize; i++){
        repetition = temp / values[i];
        temp %= values[i];

        for(int j = 0; j < repetition; j++){
            strcat(resultingStr,numerals[i]);
        }
    }

    return resultingStr;
}