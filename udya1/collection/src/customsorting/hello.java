package customsorting;

public class hello {
public static void main(String[] args) {
	String s="abcdef";
      int n=4;String s1="";
      for (int i = 0; i+n-1 < s.length(); i++) {
    	  s1=s.substring(i,i+n);
  		System.out.println(s1);
	}
}
}