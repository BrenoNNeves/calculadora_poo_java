package calculadora_poo_java;
import java.util.Scanner;



public class Calc{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Num n1  = new Num(0);
        Num n2  = new Num(0);
        Num res  = new Num(0);
        
        
        n1.setValor(scan.nextInt());
        String opc = scan.next();
        n2.setValor(scan.nextInt());
        
        System.out.println("parametros de entrada um numero, o operador(+,-,*,/,),logodepois outro numero");


        if (opc.equals("+")){
            res.setValor(n1.getValor() + n2.getValor());

        }
        else if (opc.equals("*")){
            res.setValor(n1.getValor() * n2.getValor());

        }
        else if (opc.equals("/")){
            res.setValor(n1.getValor() / n2.getValor());

        }
        else if (opc.equals("-")){
            res.setValor(n1.getValor() - n2.getValor());

        }
        else{
            System.out.println("operador invalido");
        }

        System.out.printf("resultado é %d",res.getValor());
    }
    

}