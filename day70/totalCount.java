class totalCount {
    int totalCount(int k, int[] arr) {
            int count=0;
            for(int ele : arr){
                while(ele>k){
                    count++;
                    ele-=k;
                }
                count++;
            }
            return count;
    }
}
