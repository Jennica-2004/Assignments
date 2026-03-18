import java.util.*;
class question3 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern:");
        String p = sc.nextLine();
        System.out.println("Enter string:");
        String s = sc.nextLine().trim();
        String str []= s.split(" ");
        Map <Character, String> map = new HashMap<>();
        int n=p.length();
        if(p.length()!=str.length){
            System.out.print("false");
            return;
        }
        for(int i=0;i<n;i++){ 
            
            if(map.containsKey(p.charAt(i))){
                    if(!map.get(p.charAt(i)).equals(str[i])){
                        flag=false;
                        break;
                    }
            }
            else{
                if(map.containsValue(str[i])){
                        flag=false;
                        break;
                }
                map.put(p.charAt(i),str[i]);
            }
            
        }
        if(flag)
            System.out.print("true");
        else
            System.out.print("false");

}
}
