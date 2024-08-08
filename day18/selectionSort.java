import java.util.Scanner;

public class selectionSort {
    void selectSort(int[] arr, int n){
        for(int i=0; i<=n-2; i++){
            int min = i;
            for(int j=i; j<n; j++) if(arr[min] > arr[j]) min = j;
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++) arr[i] = sc.nextInt();
        selectionSort obj = new selectionSort();
        obj.selectSort(arr, n);
        sc.close();
    }
}