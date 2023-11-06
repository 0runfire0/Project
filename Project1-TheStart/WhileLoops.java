public class WhileLoops {
    public static void main(String[] args){
        // int i = 0;
        // while(i<=5){       //while dochiara l'iteratore fuori dalla parentesi 
        //     System.out.println(i);
        //     i+=1;  //serve per incrementare
        //     }

        // double randNum = Math.random();    //Math.random genera un numero casuale tra 1 e 0
        //     while(randNum<0.5){            //noi cerchiamo il primo numero positivo casuale dopo 0.5
        //         randNum=Math.random();
        //     }
        //     System.out.println(randNum);

        double randN=0;
        do{
            randN = Math.random();  
            System.out.println(randN);
        }while(randN>0.5);

        while(randN<0.5){           //minore di 0.5 stampa all'infinito
            System.out.println(randN);
            randN++;  
        }


    }
}        