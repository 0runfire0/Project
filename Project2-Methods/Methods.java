public class Methods{
    public static void main(String[] args){
        multiply(); //System.out.println(4*3);
        int numero= multiply();
        quadrato();
        multiply(30); // () = Argomento, quando si richiama una funzione 
        //possiamo richiamare funzioni anche se non ritornano nulla
        //per molti linguaggi Funzione!=Procedura
        //Funzione ritorna qualcosa, Procedura non ritorna nulla
        //In Java tutte sono funzioni
        //Funzione = Metodo, sono la stessa cosa
    }
    public static int whatever;
    //static = globale, quindi può essere richiamata in tutto il codice anche
    //non facendo parte del metodo dove lo stai richiamando
    //void = che non fa ritornare i dati
    //usiamo nomi di verbi per le funzioni, in camelCase
    //il nome dev'essere esplicativo dello scopo della funzione
    public static int multiply(int n){// () = parametro in input 
        return 4*3;//una funzione ritornerà sempre una cosa sola
    }
    public void quadrato(){
        int num1=multiply();
        int num2=multiply();
    }
}