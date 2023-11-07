import java.util.LocalDate;
public class GiornoDiOggi{
    public static void main(String[] args){
        giornoSettimana();
        chiediCosaFareOggi();
    }
    public static DayOfWeek giornoSettimana(){
        LocalDate oggi= LocalDate.now();
        DayOfWeek giorno= oggi.getDayOfWeek()
        return giorno;
    }
    public static void chiediCosaFareOggi(){
        LocalDate oggi= LocalDate.now;

    }
}