import java.util.Random;

public class MagicHat {
    public static void main(String[] args) throws InterruptedException{
        String[] students = new String[] {
            "Donato Dipalma",
            "Paolo Lauria",
            "Luigi Palladino",
            "Francesca Daniele",
            "Giovanni Rinaldi",
            "Sara Sessa",
            "Francesco Moxedano",
            "Alessandro Esposito",
            "Giorgia Melillo",
            "Fabio Manna",
            "Bryan Agustin",
            "Salvatore Orecchio",
            "Gianluca Marano",
            "Marco Suriano",
            "Ciro Matarese",
            "Valentina Issich",
            "Michelangelo Muscatiello",
            "Giacomo Santi",
            "Karim",
            "Martina Casucci",
            "Alessio del Punta",
            "Tommaso Mugnai",
            "Nicola Piacquaddio",
            "Bechir Labidi",
            "Mario Reda",
            "Federico Quai",
            "Alberto Cenni",
            "Renato Eva",
            "Daniele Schiavo"
        };

        final int NUM_HOUSES    = 4;
        final int DIM_HOUSES    = students.length / NUM_HOUSES + 1;
        final int REST          = students.length % NUM_HOUSES;

        String[] gryffindor = new String[DIM_HOUSES];
        String[] slytherin  = new String[DIM_HOUSES];
        String[] hufflePuff = new String[DIM_HOUSES];
        String[] ravenClaw  = new String[DIM_HOUSES];
        int iG = 0, iS = 0, iH = 0,iR = 0;
        

        Random hat  = new Random();
        int destiny;

        for(int i = 0; i < (students.length - REST); i++){
            System.out.printf("lo studende %s finirà in...",students[i]);
            //Thread.sleep(3000);
            String house = null;
            //boolean assigned = false;
            do{
                destiny = hat.nextInt(NUM_HOUSES);
                switch(destiny){
                    case 0:                             //if(destiny == 0){}
                        if(iG < (DIM_HOUSES - 1)){
                            gryffindor[iG] = students[i];
                            iG++;
                            //assigned = true;
                            house ="GRYFFINDOR";
                        }
                        break;   
                    
                    case 1:                             // else if(destiny == 1){}
                        if(iS < (DIM_HOUSES - 1)){
                            slytherin[iS] = students[i];
                            iS++;
                            //assigned = true;
                            house ="SLYTHERIN";
                        }
                        break;  

                    case 2:                             // else if(destiny == 2){}
                        if(iH < (DIM_HOUSES - 1)){
                            hufflePuff[iH] = students[i];
                            iH++;
                            //assigned = true;
                            house ="HUFFLEPUFF";
                        }
                        break;  
                    

                    case 3:                             // else if(destiny == 3){}
                        if(iR < (DIM_HOUSES - 1)){
                            ravenClaw[iR] = students[i];
                            iR++;
                            //assigned = true;
                            house = "RAVENCLAW";
                        }
                        break;   
                    
                }
            }while(house == null);
            System.out.println(house+"!");
        }

        //Aggiungiamo i "ritardatari"
        for(int i = (students.length - REST); i < students.length; i++){
            destiny = hat.nextInt(NUM_HOUSES);
            System.out.printf("lo studente %s finirà in...%n",students[i]);
            //Thread.sleep(3000);
            String house = null;
            //boolean assigned = false;
            do{
                destiny = hat.nextInt(NUM_HOUSES);

                switch(destiny){
                    case 0:                             //if(destiny == 0){}
                        if(iG < DIM_HOUSES){
                            gryffindor[iG] = students[i];
                            iG++;
                            //assigned = true;
                            house= "GRYFFINDOR";
                        }
                        break;   
                    
                    case 1:                             // else if(destiny == 1){}
                        if(iS < DIM_HOUSES){
                            slytherin[iS] = students[i];
                            iS++;
                            //assigned = true;
                            house = "SLYTHERIN";
                        }
                        break;  

                    case 2:                             // else if(destiny == 2){}
                        if(iH < DIM_HOUSES){
                            hufflePuff[iH] = students[i];
                            iH++;
                            //assigned = true;
                            house = "HUFFLEPUFF";
                        }
                        break;  
                    

                    case 3:                             // else if(destiny == 3){}
                        if(iR < DIM_HOUSES){
                            ravenClaw[iR] = students[i];
                            iR++;
                            //assigned = true;
                            house = "RAVENCLAW";
                        }
                        break;
                }
            }while(house == null);
            System.out.println(house+"!");
        }

        //Stampiamo i risultati
        System.out.println("Gryffindor:");
        for(int i = 0; i < iG ; i++){
            System.out.println(gryffindor[i]);
        }
        System.out.println();
        System.out.println("Slytherin:");
        for(int i = 0; i < iS ; i++){
            System.out.println(slytherin[i]);

        }

        System.out.println();
        System.out.println("HufflePuff:");
        for(int i = 0; i < iH ; i++){
            System.out.println(hufflePuff[i]);
        }

        System.out.println();
        System.out.println("RavenClaw:");
        for(int i = 0; i < iR ; i++){
            System.out.println(ravenClaw[i]);
        }
     
    }
}