#include <stdio.h>

int main()
{
    int r, c;
    scanf("%d %d", &r, &c);

    int a[r][c];
    int sum = 0;

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            if(i == 0 || i == r-1 || j == 0 || j == c-1)
            {
                sum += a[i][j];
            }
        }
    }

    printf("Sum of boundary elements = %d", sum);

    return 0;
}