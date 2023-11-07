import java.time.DayOfWeek;
import java.time.LocalDate;
public class GiornoDiOggi{
    public static void main(String[] args){
        giornoSettimana();
        chiediCosaFareOggi();
    }
    public static DayOfWeek giornoSettimana(){
        LocalDate oggi= LocalDate.now();
        DayOfWeek giorno= oggi.getDayOfWeek();
        return giorno;
    }
    public static void chiediCosaFareOggi(){
        LocalDate oggi= LocalDate.now();
        System.out.println("è:"+oggi+",cosa vuoi fare oggi?");

    }
}