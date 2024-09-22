 

class longestPrefixSuffix {
    int lps(String str) {
        int n =str.length();
        int[] pi =new int[n];
        int len =0;
        int i =1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                pi[i] = len;
                i++;
            }else{
                if(len!=0){
                    len=pi[len - 1];
                }else{
                    pi[i]=0;
                    i++;
                }
            }
        }
        return pi[n - 1];
    }
}