#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);

    int arr[n];

    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    int diff = arr[0]-arr[n-1];

    printf("diff of first and last element %d",diff);

    return 0;
}