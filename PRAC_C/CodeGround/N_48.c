#include <stdio.h>

int Answer;

int main(void)
{
	int T, test_case;
	int A, B, D;

	setbuf(stdout, NULL);

	scanf("%d", &T);
	for(test_case = 0; test_case < T; test_case++)
	{

        scanf("%d", &A);
        scanf("%d", &B);
        scanf("%d", &D);

        int min=0;
        while(1){
                D-=A;
                min++;
                if(D<=0)
                        break;
                D+=B;
        }
	
        Answer=min;
		printf("Case #%d\n", test_case+1);
	        printf("%d\n", Answer);
	}

	return 0;
}
