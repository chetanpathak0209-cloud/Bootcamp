#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int a[n];

    for(int i = 0; i < n; i++)
        scanf("%d", &a[i]);

    int maxLen = 1, currLen = 1;

    for(int i = 1; i < n; i++)
    {
        if(a[i] > a[i-1])
            currLen++;
        else
            currLen = 1;

        if(currLen > maxLen)
            maxLen = currLen;
    }

    printf("Longest increasing subarray length = %d", maxLen);

    return 0;
}