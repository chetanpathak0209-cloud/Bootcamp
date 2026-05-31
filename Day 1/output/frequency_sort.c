#include <stdio.h>

int main()
{
    int n,a[100],f[100]={0};

    scanf("%d",&n);

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    for(int i=0;i<n;i++)
    {
        if(f[i]) continue;

        int count=1;

        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                count++;
                f[j]=1;
            }
        }

        printf("%d = %d\n",a[i],count);
    }

    return 0;
}