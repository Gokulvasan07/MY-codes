import java.util.*;
public class Spy {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int num=sc.nextInt();
            for(int i=0;i<=num;i++){
                if(isSpy(i))
                    System.out.println(i);
            }
        }
    }
    public static boolean isSpy(int num){
        int sum=0,p=1;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            p=p*rem;
            num=num/10;
        }
        return sum==p;
    }

}
