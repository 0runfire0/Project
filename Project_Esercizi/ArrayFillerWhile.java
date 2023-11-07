import java.util.Arrays;
import java.util.Random;
public class ArrayFillerWhile{
    public static void main(String[] args){
        int[] array= new int[10];
        int j=0;
        Random rr=new Random();
        while(j<array.length){
            array[j]=rr.nextInt(100);
            j++;
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        boolean scambio;
        do{
           scambio=false; 
            for(int i=0; i<array.length-1; i++){
                if(array[i]>array[i+1]){
                    scambio=true;
                    int appoggio=array[i];
                    array[i]=array[i+1];
                    array[i+1]=appoggio;
                }
            }
        }while(scambio);
        System.out.println("*******");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}

