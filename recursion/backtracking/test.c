#include<stdio.h>
// this is program for traingel of a ab abc abcde
int main()
{
    int i,j,k;
    char ch='a';
    for(i=1;i<=5;i++)
    {
        for(j=i;j>=2;j--)
            printf(" ");
        for(k=0;k<i*2-1;k++)
            printf("%c",ch+k);
        printf("\n");
    }
}