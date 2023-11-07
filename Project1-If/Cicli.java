import java.util.List;
import java.util.ArrayList;
public class Cicli{
    public static void main(String[] args){
        int[] array;
        array =new int[5] ;
        array[0]=1;
        array[1]=10;
        array[2]=15;
        array[3]=20;
        array[4]=25;
        
        for (int indice=0; indice<array.length; indice++){
            if(indice==3)
                System.out.println("sium");
            else
                System.out.println("lol");
                
        }
        /*  for (int valore : array){
             if(valore==20)
                 System.out.println("sium");
             else
                 System.out.println("lol");
         } */
        int[] array2= {1, 2, 3, 4}; //

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer element : list){
            if(element==3){
                System.out.println("*");
                continue;
            
            }
            System.out.println("siamo i campioni del mondo!!");
        }
    }
}