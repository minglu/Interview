/* Find first non-repeat chars in a string, same idea for find all unique characters, using HashMap + .CharAt */

public static Character firstNonRepeated (String str){
	HashMap charHash = new HashMap();
	int i,index;
	Integer intgr;
	
	for (i =0;i< str.length;i++){ //String, array ----length, List ----size()
		index = str.charAt(i);
		intgr = (Integer) charHash.get(index);
		if (intgr == null)
			charHash.put(index, new Integer(1));
		else
			charHash.put(index, new Integer(intgr.intValue()+1);
	}
	
	for (i=0;i < str.length;i++){
		Character c = new Character(str.charAt(i));
		if (((Integer)char.get(str.charAt(i))).intValue() == 1)
			return c;
	}
	
	return null;
}