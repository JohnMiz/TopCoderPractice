
public class AkariDaisukiDiv2 {
	
	public int countTuples(String S)
	{
		int globalCount = 0;
		for(int i = 1; i < S.length(); ++i)
		{
			String token = "" + S.charAt(i);
			for(int k = i + 1; k < S.length() - token.length(); ++k)
			{
				int count = 0;
				for(int j = k; j < S.length() - token.length(); ++j)
				{
					
					if(token.equals(S.substring(j, j+token.length())) && j != k)
					{
						count++;
						if(count >= 1)
						{
							count = 0;
							globalCount++;
						}
					}
				}
				
				token += S.charAt(k);
			}
		}
		return globalCount;
	}
	
}
