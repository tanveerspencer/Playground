#include <stdio.h>
int main() {
int a,r,d,n,count=0;
  scanf("%d",&a);
  r=a;
  while(a!=0)
  {
    a=a/10;
    count++;
  }
  n=count;
  while(count>1)
  {
    d=r%10;
    r=r/10;
    count--;
    
  }
  printf("%d",d);
  
	return 0;
}