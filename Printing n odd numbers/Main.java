#include <stdio.h>
int main() {
	int n;
    int count=0;
   scanf("%d",&n);
    for(int i=1;i<n*2;i++)
      {
        if(i%2!=0 && count<=n)
         {
          printf("%d\n",i);
          count++;
        }
      } 
	return 0;
}