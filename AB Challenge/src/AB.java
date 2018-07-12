public class AB {
	public int satisfiCondition(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); ++i) {
			for (int j = i + 1; j < str.length(); ++j) {
				if (str.charAt(i) == 'A' && str.charAt(j) == 'B')
					count++;
			}
		}
		return count;
	}
	
	
	public String combinations(int N, int K) {

		int limit = (int) (Math.pow(2, N) - 2);

		String[] options = new String[limit];

		for (int i = 1; i <= limit; ++i) {
			options[i - 1] = String.format("%" + N + "." + N + "s", Integer.toBinaryString(i)).replace(' ', '0');
		}


		for (String element : options) {
			String str = "";
			for (int j = 0; j < element.length(); ++j) {

				if (element.charAt(j) == '1')
					str += "B";
				else if (element.charAt(j) == '0')
					str += "A";
			}

			if(satisfiCondition(str) == K)
				return str;
		}

		return "";
	}

	public String createString(int N, int K) {
		if (K > (N * (N - 1) / 2) || K < 0) {
			System.out.println("K must be between 0 and N(N-1)/2, inclusive.");
			return "";
		}
		
		return combinations(N, K);
	}
}
