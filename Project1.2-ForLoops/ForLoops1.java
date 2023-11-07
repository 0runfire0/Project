public class ForLoops1 {
    public static void main(String[] args){
             boolean pippo=true;
         for(int i=0; i>10; i--){
            if(pippo && i==15){          
             System.out.println("qui finisce il ciclo");
             break;
            }
           System.out.println("siamo i campioni del mondo");
        }
            //stampiamo tutti i numeri interi da 10 a 0

        //    for(int i=10; i>=0; i=i-2){  //il valore di i viene sottratto con due
        //    System.out.println("i");

            
            
      //  for(int i=10; i>=0; i-=2){  //il valore di i viene sottratto con due
      //      System.out.println(i);

      //      }
        
       // for(int i=10; i>=0; i--){   //il valore viene diviso per 2
       //     if(i%2==0){
       //         System.out.println(i);

       //      }
           
        //    }

        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i + " e' pari");
            }else{
                System.out.println(i + " e' dispari");
            }
        }
    
    }

       






}
