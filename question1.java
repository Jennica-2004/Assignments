import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            res^=arr[i];
        }
        System.out.println(res);
    }
}
