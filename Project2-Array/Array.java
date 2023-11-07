public class Array {
    public static void main(String[] args){

        int x=5;
        int[] nums = new int[5];   //int[] vuol dire array di interi in questo array ci sono 5 celle 
       // System.out.println(nums[nums.length-1]);
        nums[0]=27;
        nums[nums.length-1]=30; //ultima cella dell'array
        System.out.println(nums[nums.length-1]);
        for(int i=0;i<nums.length;i++){
            System.out.print(i+"->");
            System.out.println(nums[i]);
        }
            System.out.println("************");
        for(int i=0;i<nums.length;i++){
            nums[i]=i;//il vlore dell'array è la posizione dell'indice
           System.out.println(nums[i]);
        }
            System.out.println("************");
        //i valori pari doppio della loro posizioni ai dispari il triplo 
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=i*2;
            }else{
                nums[i]=i*3;
            }
            
        }
         for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("************");
        
        //creare una variabile che abbia come valore il massimo valore che ha un array
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);

        System.out.println("************");

        //cerco il valore minimo
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min);

        //variabile somma di tutti gli elementi dell'array

        double sum = 0;
        for(int i=0;i<nums.length;i++){
           // sum = sum + nums[i];
           sum += nums[i] ;
        }
        System.out.println("la somma degli elementi è " + sum);
        System.out.println("la media dei valori è" + sum/nums.length);

        //scambia valori tra prima e seconda posizione array
        
        int temp = nums[0]; //in temp appoggio il valore della cella 0
        nums[0]=nums[1];    //poi sposto il valore della 1 nella 0
        nums[1]=temp;       //poi sposto temp nella cella 1
        System.out.println(nums[0] + " " + nums[1]);

        boolean found = false;
        int target =4;
        for(int i=0;i<nums.length;i++){
            System.out.println("sto analizzando la posizione" + i);
            if(nums[i]==target){
                found=true;
                break;
            }
        }
        System.out.println(found);

        //
        int repeated = 1;
        nums = new int[]{3,9,0,9,0};
        for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    repeated++;                   
                }
            } 
            if(repeated>1){ //senza break ripeterebbe 3 perche parte da 1
                break;
            }           
        }
        System.out.println(repeated);

        int mode = -1;
        int pos = -1;
        int howMany = 1;
        int value = -1 ;
        nums = new int[]{3,9,0,9,0};

        for(int i=0;i<nums.length-1;i++){
            howMany=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    howMany++;
                }
            }
            if(howMany>mode){
                mode=howMany;
                pos=i;
                value=nums[i];
            }
            
        }
        System.out.println(mode + " " + pos + " " + nums[pos] + " " + value);

        






    }
}