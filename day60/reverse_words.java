package day60;

public class reverse_words {
    String reverseWords(String str) {
        String s="";
        String rev="";
        for(int i=str.length()-1; i>=0;i--){
            if(str.charAt(i)=='.'){
                s=s+str.charAt(i);
                rev = rev+s;
                s="";
            }
            else {
                s=str.charAt(i)+s;
            }
        }
        rev=rev+s;
        return rev;
    }
}