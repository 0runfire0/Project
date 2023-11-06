import java.util.Random;
public class RicercaBinaria {
    public static void main(String[] args){

        //generare un array ordinato ed al suo interno generare una ricerca binaria ad un numero a nostra scelta
        int lunghezzaArray = 100;
        int[] arrayOrdinato = new int[lunghezzaArray];
        for(int i = 0;i < arrayOrdinato.length; i++){
            arrayOrdinato[i] = i;
        }
        System.out.println(Arrays.toString(arrayOrdinato)); // usiamo Arrays.toString per poter vedere il suo valore senno vedremmo solo la posizione dell'oggetto
                                                            
        //dato un elemento cerca l'elemento indicato all'interno dell'array
        //e ti torna il suo indice cioe la sua posizione
        Random random = new Random();
        //int numeroCercato = 30;
        int numeroCercato = random.nextInt(arrayOrdinato.length);
        System.out.println("numero cercato :" + numeroCercato);
        int posizioneCercata = Arrays.binarySearch(arrayOrdinato, numeroCercato);//Arrays.binarySearch(array dove cercare,numero cercato)
        System.out.println("posizione cercata :" + posizioneCercata);
        
        //dato il numero trovato voglio ottenere un numero compreso tra esso e l'ultimo valore dell'array
        //e ottenere un altro numero compreso tra esso e primo valore dell'array
        
        int numeroCercatoDx = random.nextInt(arrayOrdinato.length - posizioneCercata) + posizioneCercata;
        System.out.println("numero cercato dx :" + numeroCercatoDx);
        int posizioneCercataDx = Arrays.binarySearch(arrayOrdinato,posizioneCercata,arrayOrdinato.length,numeroCercatoDx);
        System.out.println("posizione cercata dx:" + posizioneCercataDx);
        //genero un numero random compreso tra 0 e il risultato della differenza tra la lunghezza dell'array e la posizione cercata
        //al numero trovato sommiamo il valore della posizione cercata per traslare il valore all'interno del range di nostro interesse
        int numeroCercatoSx = random.nextInt(posizioneCercata);
        System.out.println("numero cercato sx :" + numeroCercatoSx);
        int posizioneCercataSx = Arrays.binarySearch(arrayOrdinato,0,posizioneCercata,numeroCercatoSx);
        System.out.println("posizione cercata sx:" + posizioneCercataSx);

     //Arrays.binarySearch(array dove fare la ricerca,valore di partenza,posizione di fine,valore da ricercare)





    }
}
