public class Main2 {
    public static void main (String[] args){
    
        Person_1 Raj = new Person_1("Raj", "British", "02/02/5245", 5);
        System.out.println("Name: " + Raj.name + "\n" + "Nationality: " 
+ Raj.nationality + "\n" + "Date of Birth: " +Raj.dateOfBirth + 
"\n" + "Seat Number: " + Raj.seatNumber + "\n");

    }
}

class Person_1{
     String name;
     String nationality;
     String dateOfBirth;
     int seatNumber;

     public Person_1(String name, String nationality, String dateOfBirth,int seatNumber ){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
     }

}
