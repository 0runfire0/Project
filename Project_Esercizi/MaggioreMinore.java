import java.util.Scanner;
public class MaggioreMinore{ 
    public static void main(String[] args){ 
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("inserisci due numeri interi");
        int a = in.nextInt();
        int b = in.nextInt();
        int somma, resto, moltip, sottra;
        double divisione;
        moltip =a*b;
            if(a>b && b!=0){ 
                sottra = a-b;
                somma = a+b;
                divisione =(double)a/b;
                resto= a%b;
                System.out.println("i numeri iniziali sono:"+a+" "+b);
                System.out.println("sottrazione:"+sottra);
                System.out.println("somma:"+somma);
                System.out.println("divisione:"+divisione);
                System.out.println("resto:"+resto);
                System.out.println("moltiplicazione:"+moltip);
            }else if(b>a && a==0){
                somma= a+b;
                sottra= b-a;  System.out.println("i numeri iniziali sono:"+a+" "+b);
                System.out.println("sottrazione:"+sottra);
                System.out.println("somma:"+somma);
                System.out.println("divisione: errore");
                System.out.println("resto: errore");
                System.out.println("moltiplicazione:"+moltip);
            }else if(a>b && b==0){
                somma = a+b;
                sottra = a-b;
                System.out.println("i numeri iniziali sono:"+a+" "+b);
                System.out.println("sottrazione:"+sottra);
                System.out.println("somma:"+somma);
                System.out.println("divisione: errore");
                System.out.println("resto: errore");
                System.out.println("moltiplicazione:"+moltip);
                
            }else {
                sottra=b-a;
                somma= b+a;
                divisione= (double)b/a;
                resto=b%a;
                System.out.println("i numeri iniziali sono:"+a+" "+b);
                System.out.println("sottrazione:"+sottra);
                System.out.println("somma:"+somma);
                System.out.println("divisione:"+divisione);
                System.out.println ("resto:"+resto);
                System.out.println ("moltiplicazione:"+moltip);
            }
    }
}
//https://www.itispolistena.edu.it/wp/wp-content/uploads/2014/10/Le-basi-del-linguaggio-Java-parte-seconda.pdf