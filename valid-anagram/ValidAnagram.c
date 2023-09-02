bool isAnagram(char * s, char * t){
    int sLength = strlen(s);
    int tLength = strlen(t);

    if(sLength != tLength)
        return false;
    
    int sArray[26]={0}; // ascii values of 26 letters will be used as index
    int tArray[26]={0};

    for(int i=0; i < sLength; i++){
        sArray[*(s+i)- 'a']++;
        tArray[*(t+i)- 'a']++;
    }

    for(int i=0; i < 26; i++){
        if( sArray[i] != tArray[i])
            return false;
    }

    return true;
}