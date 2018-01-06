import java.util.*;

class Example4 {

public static void main (String [] args){

String str = "eedtact ocoae";

boolean flag = checkPalindrome(str);

System.out.println(flag);
}


public static boolean checkPalindrome(String str){


Hashtable <Character, Integer> table = new Hashtable <>();
for(int i=0; i<str.length();i++){
char c = str.charAt(i);

if(c != ' ')
{
if(table.get(c) == null){
table.put(c,1);
}else{
int count = table.get(c);
count++;
table.put(c, count);
}
}
}

Set<Character> keys = table.keySet();
int singleLetterCount = 0;

for(char key : keys){
if(keys.size()<=1){
return true;
}else{
if(table.get(key) % 2 == 1){
singleLetterCount++;
}
}
}

if(singleLetterCount <= 1){
return true;
}else{
System.out.println(keys.size());
System.out.println(singleLetterCount);
return false;
}
}
}


