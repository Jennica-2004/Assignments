import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        String s=sc.nextLine();
        char arr[]= s.toCharArray();
        System.out.println("Enter k:");
        int k = sc.nextInt();
        int n=arr.length;
        int i=0,count=0;
        if(n==k){
            System.out.println(0);
            return;
        }
        StringBuilder str = new StringBuilder();
         for (int j = 0; j < n; j++) {
            while (str.length()>0 && count < k && str.charAt(str.length()-1) >arr[j]) {
                str.deleteCharAt(str.length()-1);
                count++;
            }
            str.append(arr[j]);
        }
        while (str.charAt(0) == '0') {
            str.deleteCharAt(0);
        }

        System.out.println(str.toString());
    }
}
