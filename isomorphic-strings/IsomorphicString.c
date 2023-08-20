bool isIsomorphic(char * s, char * t){
  char arr1[256]={'\0'};
  char arr2[256]={'\0'};

  while(*s !='\0'){
    if(arr1[*s] == '\0')
      arr1[*s] = *t;
    
    if(arr2[*t] == '\0')
      arr2[*t] = *s;

    if( arr1[*s] != *t || arr2[*t] != *s)
      return false;
    s++;
    t++;
  }
  return true;
}