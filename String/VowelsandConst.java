import java.util.Scanner;
public class VowelsandConst {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            String s = sc.nextLine().toLowerCase();
            countVandC(s);
        }
    }
    static void countVandC(String s){
        int vcount=0;
        int Ccount=0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                vcount++;
            else if(Character.isAlphabetic(ch))
                Ccount++;
        }
        System.out.println(vcount);
        System.out.println(Ccount);
    }
}
