	 public class CoinFlipsDiv2
	 {
		  public int countCoins(string state)
		  {
			   int count = 0;
			   if (state.Length <= 1)
					return 0;
			   else
			   {
					for (int i = 0; i < state.Length; ++i)
					{
						 if (i >= 0 && i < state.Length - 1)
						 {
							  if (state[i] != state[i + 1])
							  {
								   count++;
								   continue;
							  }
						 }

						 if (i > 0 && i <= state.Length - 1)
						 {
							  if (state[i] != state[i - 1])
								   count++;
						 }
					}

			   }
			   return count;
		  }
	 }