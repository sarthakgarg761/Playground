#include <stdio.h>
#include<math.h>
int main() {
  int num;
  scanf("%d",&num);
  if(num%2==0){
    int t=num/2;
    int r;
    r=pow(3,t-1);
    printf("%d",r);
  }
           else
           {
             int t=(num+1)/2;
             int r;
             r=pow(2,t-1);
             printf("%d",r);
           }
	
	return 0;
}