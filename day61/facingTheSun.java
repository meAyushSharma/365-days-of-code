package day61;

class facingTheSun {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        int cnt=1;
        int max=height[0];
        int n=height.length;
        for(int i = 1; i<n; i++) {
            if (height[i]>max) {
                max = height[i];
                cnt++;
            }
        }
        return cnt;
    }
}