package ifelse;
 import java.util.Scanner;

public class characterTypeChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || ( ch >='A' && ch <= 'Z') ){
            System.out.println(ch + " is an alphabet ");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println(ch + " is an digit ");
        }
        else{
            System.out.println(ch + " is an special character ");
        }

        sc.close();

    }
}