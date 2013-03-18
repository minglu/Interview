//O(N)..remove char from string, boolean[] flag = new boolean[128], set removed char in flag to true, then traverse the string to copy out the remain ones

public static String removeChars (String str, String remove)
{
	char[] st = str.toCharArray();
	char[] re = remove.toCharArray();
	ArrayList result = new ArrayList();
	boolean[] flag = new boolean[128]; 
	
	for (int i=0;i<st.length;i++){
		flag[re[i]] = true
	}

	for (int i=0;i<st.length;i++){
		if(!flag[st[i]] = true)
			result.add(st[i]);
	}

	return result.toArray().toString();
}

//with out additional memory, O(n^2). delete one and move rest char forward.
