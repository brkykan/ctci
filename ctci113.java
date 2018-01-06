import java.util.*;

class Example{

public static void main(String args[]){

String s = "Mr John Smith    ";
int length = 13;
char [] charArr = s.toCharArray();
StringBuilder str = new StringBuilder();
for(int i=0;i<13;i++){
char c = charArr[i];

if(c == ' '){
str.append("%20");
}else{
str.append(c);
}

}
System.out.println(str.toString());
}
}
