import java.util.Scanner;
public class recursion {
static int n=0;

    static int function(int n) {
        if (n < 1) {
            return 0;
        }

        function(n-1);
        System.out.println(n);
        return n +  function(n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int result=function(n);
        System.out.println("result="+result);
    }

