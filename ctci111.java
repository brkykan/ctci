import java.util.*;

class Example1{

public static void main (String [] args){

String s = "abcd";
String s1 = "abcda";

checkUniqueness(s);
checkUniqueness(s1);
}

public static boolean checkUniqueness(String s){

Hashtable <Character, Integer> table = new Hashtable<Character, Integer>();
boolean flag = true;

for(int i=0; i<s.length(); i++){
char c = s.charAt(i);
if(table.get(c)==null){
table.put(c, 1);
}else{
int count = table.get(c);
table.put(c, count+1);
flag = false;
}
}
System.out.println(flag);
return flag;
}

}
