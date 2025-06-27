package tw.sam.api;

import java.util.Random;

public class TWid {
private String id;
private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

public TWid() {
	this (new Random().nextBoolean());
}
public TWid(boolean isMale) {
	this(isMale,letters.charAt(new Random().nextInt(26)));
}
public TWid(char area) {
	this(new Random().nextBoolean(),area);
}

public TWid(boolean isMale,char area) {
	StringBuffer sb = new StringBuffer();
	sb.append(area);
	sb.append(isMale?'1':'2');
	for (int i=0; i<7;i++)sb.append(new Random().nextInt(10));
	for (int i=0 ; i<10;i++) {
		if(isRightID(sb.toString()+i)) {
			id = sb.append(i).toString();
					break;
		}
	}
	
}

public String getId() {
	return id;
}

private TWid(String id) {
	this.id = id;
}

public boolean isMale() {
	return true;
}
public String gerLocation() {
	
	return"台中市";
}

public static TWid createTWid(String id) {
	if(isRightID(id)) {
	return new TWid(id);
}else {
		return null;
	}
}


	public static boolean isRightID(String id) {
	    
	    if (id.matches("[A-Z][12][0-9]{8}")) {
	        char c1 = id.charAt(0);
	        int a12 = letters.indexOf(c1) + 10;
	        int a1 = a12 / 10;
	        int a2 = a12 % 10;

	        String s1 = id.substring(1, 2);
	        int n1 = Integer.parseInt(s1);
	        int n2 = Integer.parseInt(id.substring(2, 3));
	        int n3 = Integer.parseInt(id.substring(3, 4));
	        int n4 = Integer.parseInt(id.substring(4, 5));
	        int n5 = Integer.parseInt(id.substring(5, 6));
	        int n6 = Integer.parseInt(id.substring(6, 7));
	        int n7 = Integer.parseInt(id.substring(7, 8));
	        int n8 = Integer.parseInt(id.substring(8, 9));
	        int n9 = Integer.parseInt(id.substring(9, 10));

	        int sum = a1 * 1 + a2 * 9 + n1 * 8 + n2 * 7 + n3 * 6 +
	                  n4 * 5 + n5 * 4 + n6 * 3 + n7 * 2 + n8 * 1 + n9 * 1;

	        return sum % 10 == 0;
	    } 
	        return false;
	    
	}
}

