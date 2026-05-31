#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int a[n][n];
    int d1 = 0, d2 = 0;

    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }

    for(int i = 0; i < n; i++)
    {
        d1 += a[i][i];
        d2 += a[i][n - 1 - i];
    }

    int diff = d1 - d2;

    if(diff < 0)
        diff = -diff;

    printf("Diagonal Difference = %d", diff);

    return 0;
}