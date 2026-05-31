
#include<stdio.h>
int main(){
    int n;
    printf("enter the size of an array:");
    scanf("%d",&n);
    int arr[n];
    printf("enter the elements of an array ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int smallest=arr[0];
    int pos=0;
    for(int i=0;i<n;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
            pos=i;
        }
    }
    for(int i=pos;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    printf("the array after deleting the smallest element is:");
    for(int i=0;i<n-1;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}