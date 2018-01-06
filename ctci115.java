import java.util.*;

class Example5{

public static void main (String [] args){

    boolean b1 = oneAway("pale", "pake");
    boolean b2 = oneAway("bake", "bakes");
    boolean b3 = oneAway("pale", "ple");
    boolean b4 = oneAway("pale", "park");
    boolean b5 = oneAway("bake", "bakess");
    
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);

}

    public static boolean oneAway(String str1, String str2){
	if(Math.abs(str1.length() - str2.length()) > 1){
	    return false;
	}else{
	    int i=0;
	    int j=0;
	    boolean foundDiff = false;

	    while(i<str1.length() && j<str2.length()){
		if(str1.charAt(i) != str2.charAt(j)){
		    if(foundDiff){
			return false;
		    }
		    foundDiff = true;
		    if(str1.length()>str2.length()){
			i++;
		    }else if(str1.length()==str2.length()){
			j++;
			i++;
		    }else{
			j++;
		    }
		}else{
		    	i++;
			j++;
		}
	    }
	    return true;
	}
    }
}