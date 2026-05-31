#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int a[n];

    for(int i = 0; i < n; i++)
        scanf("%d", &a[i]);

    for(int i = 0; i < n; i++)
    {
        int leader = 1;

        for(int j = i + 1; j < n; j++)
        {
            if(a[j] > a[i])
            {
                leader = 0;
                break;
            }
        }

        if(leader)
            printf("leader in arr %d ", a[i]);
    }

    return 0;
}