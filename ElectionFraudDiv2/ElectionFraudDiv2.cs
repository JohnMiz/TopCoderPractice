public class ElectionFraudDiv2
{
	public string IsFraudulent(int[] percentages)
	{
		int sum = 0;
		float lowOffset = 0.0f;
		float highOffset = 0.0f;
		
		for(int i = 0; i < percentages.Length; ++i)
		{
			highOffset += 0.5f;
			
			if(percentages[i] > 0)
				lowOffset -= 0.5f;
				
			sum += percentages[i];
		}
		
		float lowerBound = sum + lowOffset;
		float upperBound = sum + highOffset;
		
		if(lowerBound <= 100 && upperBound > 100)
			return "NO";    
		return "YES";
	}
}