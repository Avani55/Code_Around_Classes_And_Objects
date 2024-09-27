import java.util.Arrays;
public class Main3 {
    public static void main (String[] args){

        AirLines Kohinoor = new AirLines("KunalKushwaha", "American", "02/2/2022", new String[]{"AE10234"}, 15);
        Kohinoor.setSeatNumber(10);
        System.out.println(" Hello this is "+ Kohinoor.getName() + "."+ " I am "+ Kohinoor.getNationality()+"."+" My dateOfbirth is "+Kohinoor.getDateOfBirth()+"."+" My seat number is "+ Kohinoor.getSeatNumber()+"." + " My passport details are "+Arrays.toString(Kohinoor.getPassport())+".");
       

    }
}
class AirLines{ 
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public AirLines(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name= name;
        this.nationality= nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport(){
        return passport;
    }
    public void setPassport(String[] passport){
        this.passport = passport;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
}