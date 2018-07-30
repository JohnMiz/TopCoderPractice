public class ChristmasTreeDecorationDiv2
    {
    	public int solve(int[] col, int[] x, int[] y)
        {
            int N = x.Length;
            int count = 0;
            for(int i = 0; i < N; ++i)
            {
            	if(col[x[i] - 1] != col[y[i]-1])
                   count++;
            }
                   
                   return count;
        }
    }