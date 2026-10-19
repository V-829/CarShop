import java.util.ArrayList;

public class CarList {
    // arrays to store different cars objects
    private Car [] a = new Car[4];
   // constructor that initializes the CarList array with specific cars
 CarList () {
    a[0] = new Ferrari ("VROOMMM", "Ferrari") ;
    a[1] = new Tesla ("WHIRMWHIRWMWHIRWMWHWM", "Tesla") ;
    a[2] = new Jeep ("Beep Beep", "Jeep") ;
    a[3] = new Honda("MMMMMMMM", "Honda");
 }
 
 public String carSounds () {
    //empty array list to add CarList items into this list
    //then returning this list
    ArrayList<String> list = new ArrayList<>();

    //for loop that goes through CarList array and prints 
    // out each car and its sound
    for (int i = 0; i < a.length ; i ++) {
        list.add("A " + a[i].getType() + " makes the noise " + a [i].getSound());
     }
     //makes all the items in this list strings
    String text = list.toString();
    return text;
}
}