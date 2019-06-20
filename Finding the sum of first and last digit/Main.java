#include <stdio.h>
#include <math.h>

int main()
{
    int n, firstDigit, lastDigit, digits,sum=0;
    scanf("%d", &n);


    lastDigit = n % 10;     

    digits = (int)log10(n); 

    firstDigit = (int)(n / pow(10, digits)); 

  sum=firstDigit+lastDigit;
  printf("%d",sum);

    return 0;
}