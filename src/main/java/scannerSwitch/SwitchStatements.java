package scannerSwitch;

 public class SwitchStatements {
     String dayOfTheWeek;
     int day = 7;

     public void Switch() {
         switch (day) {
             case 1 -> {
                 dayOfTheWeek = "Monday";
                 System.out.println(dayOfTheWeek + " Buy one get one free");
             }
             case 2 -> {
                 dayOfTheWeek = "Tuesday";
                 System.out.println(dayOfTheWeek + " Any twp for 22cents");
             }
             case 3 -> {
                 dayOfTheWeek = "Wednesday";
                 System.out.println(dayOfTheWeek + " a mental health day off");
             }
             case 4 -> {
                 dayOfTheWeek = "Thursday";
                 System.out.println(dayOfTheWeek + " Thirsty Thursdays on Liquor");
             }
             case 5 -> {
                 dayOfTheWeek = "Friday";
                 System.out.println(dayOfTheWeek + " Free fries friday");
             }
             case 6, 7 -> {
                 dayOfTheWeek = " ";
                 System.out.println("Sorry we are closed on " + dayOfTheWeek);
             }
             default -> {
                 dayOfTheWeek = "No such day";
                 System.out.println(dayOfTheWeek + " come back tomorrow");
             }
         }
     }
 }