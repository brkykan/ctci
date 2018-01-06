import java.util.*;

class Example6{
public static void main (String [] args){
    
    String str = "aabbcccccaaaAABc";
    
    char curChar = str.charAt(0);
    int count = 1;
    StringBuilder s = new StringBuilder();
    s.append(curChar);

    for(int i=1;i<str.length();i++){
	if(curChar == str.charAt(i)){
	    count++;
	}else{
	    s.append(count);
	    curChar = str.charAt(i);
	    s.append(curChar);
	    count = 1;
	}
    }

    s.append(count);

    String compressedStr = s.toString();
    if(compressedStr.length()>str.length()){
	System.out.println(str);
    }else{
	System.out.println(compressedStr);
    }
}
}