#include<stdio.h>
#include<string.h>
char str[100];
int main(){
    printf("enter the string :");
    fgets(str, sizeof(str), stdin);
    int count=0;
    for(int i=0;str[i]!='\0';i++){

      if((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z')){

        if(str[i]!='a'&& str[i]!='e'&& str[i]!='i'&& str[i]!='o'&& str[i]!='u'&& str[i]!='A'&& str[i]!='E'&& str[i]!='I'&& str[i]!='O'&& str[i]!='U'){
            count++;
        }
    }
    }
    printf("number of consonants in a string are %d", count);
    return 0; 
}