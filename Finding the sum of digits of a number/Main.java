#include <stdio.h>
int main() {
  int a,dig,sum=0;
  scanf("%d",&a);
  while(a!=0)
  {
    dig=a%10;
    a=a/10;
    sum=sum+dig;
  }
  printf("%d",sum);
	return 0;
}