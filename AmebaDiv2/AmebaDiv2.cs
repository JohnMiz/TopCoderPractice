public class AmebaDiv2
{
	 public int simulate(int[] X, int A)
     {
         for(int i = 0; i < X.Length; ++i)
         {
         	if(X[i] == A)
                A += X[i];
         }
         
     	return A;
     }
}