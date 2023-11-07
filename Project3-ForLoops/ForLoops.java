public class ForLoops {
    public static void main(String[] args){

      boolean pippo=true;
 // i++vuol dire incrementa di 1 i<4 vuol dire che deve arrivare fino a 4
      for(int i=0; i<4; i++){
         //System.out.println("siamo i campioni del mondo"); 
          if(pippo && i==3){          
          System.out.println("qui finisce il ciclo");
          break;
              
          }
           System.out.println("siamo i campioni del mondo");
      }
       
       //break serve per fermare il ciclo al numero desiderato






   }
}