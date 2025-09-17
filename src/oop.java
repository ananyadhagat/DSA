import java.util.*;
import java.util.Scanner;
/*public class oop {
    static void function1(String name){
        System.out.println("Hello World");

    }}
class oop1{

}
    class main{
        public static void main(String[] args) {
            System.out.println("This is my first class of oop concepts");
            oop.function1("Hello ANANYA");
        }
    }*/
/*class oop{
    oop(){

    }
    void function_1(){
        System.out.print("Hello World");
    }

}
class main{
    public static void main(String[] args) {
        oop c1= new oop();
        c1.function_1();
    }
}*/
class calculator{
    static float add(float a, float b){
        return a+b;
    }
    static float sub(float a, float b){
        return a-b;
    }
    static float mul(float a, float b){
        return a*b;
    }
    static float div(float a, float b){
        return a/b;
    }
    static float pow(float a, float b){
       return (float) Math.pow(a,b);

    }
    }

class main{
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        float a = input.nextFloat();
        System.out.println("enter a sign (+ - * /");
        char c = input.next().charAt(0);
        System.out.println("enter b number");
        float b = input.nextFloat();
        float result=0;
        if(c=='+'){
        result=calculator.add(a,b);}
        if(c=='-'){
        result=calculator.sub(a,b);}
        if(c=='*'){
        result=calculator.mul(a,b);
        }
        if(c=='/'){
        result=calculator.div(a,b);}
        if(c=='^'){
            result=calculator.pow(a,b);
        }
        System.out.println("result="+result);
    }
}