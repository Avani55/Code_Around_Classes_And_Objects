public class Homosepians {

    public static void main (String[] args){
        Person ram = new Person("Ram ", "Hindu", "26/02/2002", new 
        String[]{"20224912574"}, 5522);
        System.out.println("Name: " + ram.getName() + "\n" +
        "Nationality: " + ram.getNationality() + "\n" + 
        "Date of Birth: " + ram.getDateOfBirth() + "\n" + 
        "Seat Number: " + ram.getSeatNumber() + "\n");
        
        Person raghav = new Person(ram);
        raghav.setName("Raghav");
        raghav.setSeatNumber(1254);

        System.out.println("Name: " + raghav.getName() + "\n" +
        "Nationality: " + raghav.getNationality() + "\n" + 
        "Date of Birth: " + raghav.getDateOfBirth() + "\n" + 
        "Seat Number: " + raghav.getSeatNumber() + "\n");
    }
    
}
class Person{
   private String name;
   private String nationality;
   private String dateOfBirth;
   private String[] passport;
   private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }
    public Person (Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = source.passport;
        this.seatNumber = source.seatNumber;

    }




    // getters and setters using the concept of Encapsulation.
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
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassPort(){
        return this.passport;
    }
    
    public void setPassport(String[] passport){
        this.passport = passport;
    }
    
    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

}
