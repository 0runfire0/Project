public class If{
    public static void main(String[] args){
        int accountBalance = 0;
        boolean isBalanceNegative= accountBalance<=-1;
        if(isBalanceNegative){
          System.out.println("sei un barbone");
        } else if(!isBalanceNegative){
            System.out.println("il tuo conto è in positivo");
        }
        double altezza = 180;
        double peso = 100;
        if (altezza>=180 && peso>=100){
            System.out.println("sei alto ma un poò grassottello");
            else if(altezza<180 && peso<100){
                System.out.println("sei nella media");

            }
    
    }
}