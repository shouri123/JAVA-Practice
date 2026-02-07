import java.util.*;

class array {
    public static void main(String[] args) {
        createArray();
    }

    public static void createArray() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("\n Enter How Many Nos \n");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Nos " + (i + 1));
            arr[i] = Sc.nextInt();
        }
        System.out.println("\n The Nos Are \n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        Sc.close();
        bubbleSort(arr,n);
    }

    public static void bubbleSort(int[] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\n The Nos After SortingAre \n");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }           
    }
}