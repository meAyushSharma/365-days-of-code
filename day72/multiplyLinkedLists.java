class multiplyLinkedLists{
    static final long MOD = 1000000007;
    public long multiplyTwoLists(Node first, Node second){
        long num1=0,num2= 0;

        while(first!=null){
            num1 =(num1*10 + first.data)%MOD;
            first =first.next;
        }
        while(second!=null){
            num2=(num2*10+second.data)%MOD;
            second=second.next;
        }
        return(num1*num2)%MOD;
    }
}

