import java.util.Scanner;
public class fifth {
    public static void fakt(int n){
        int rez = 1;
        for(int i=1;i<=n;i++){
            System.out.println((rez *= i)+" ");
        }
        //return rez;
    }
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        fakt(cs.nextInt());
    }
}
