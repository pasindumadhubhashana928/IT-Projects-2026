import java.util.*;
public class Cal{
    public static double calnum(double n1,double n2,char op){
        switch(op){
            case '+':
                return n1+n2;
                
            case '-':
                return n1-n2;
                
            case '*':
                return n1*n2;
                
            case '/':
                if(n2!=0){
                    return n1/n2;
                }else{
                    System.out.println("Divide by zero");
                    return 0;
                }                
                
            default:
                System.out.println("Invalid");
                return 0;
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        double n1=sc.nextDouble();
        System.out.print("Enter Number 2: ");
        double n2=sc.nextDouble();
        System.out.print("Enter Operator(+,-,*,/): ");
        char op=sc.next().charAt(0);

        double result=calnum(n1,n2,op);
        System.out.println("Result= "+result);
        
    }
}