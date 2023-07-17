// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(695, 45));
    }

    public static String getDurationString(int seconds){

        if( seconds < 0){
            return  "The input "+ seconds+" is less than zero. Please enter a positive value";
        }else{

            return getDurationString(seconds/60, seconds);
        }


    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0){
            return "Entered minutes " + minutes + " is less than zero. Please enter a positive value.";
        }

        if(seconds <=0 || seconds >=59){
            return "Invalid data for seconds ("+seconds+"), must be between 0 and 59";
        }

            return minutes/60 + "h " + minutes % 60 + "m " + seconds % 60 + "s ";


    }
}