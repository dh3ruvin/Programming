import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Solution{

    public static void main( String args[] ){

        System.out.println(" Enter Commands ");
        Scanner scan = new Scanner( System.in );
        String input = scan.nextLine().replaceAll(",", "");
        String[] commands = input.split(" ");
        System.out.println( Arrays.toString(commands) );
        
        
        

        // HashMap<String, String> hotWeather = new HashMap<>();
        // HashMap<String, String> coldWeather = new HashMap<>();

        // ColdWeather coldWeatherDetails = new ColdWeather();
        // HotWeather hotWeatherDetails = new HotWeather();

        // hotWeather.put( "1", hotWeatherDetails.getFootWear() ) ;
        // coldWeather.put( "1", coldWeatherDetails.getFootWear() );

        // hotWeather.put( "2", hotWeatherDetails.getHeadwear() );
        // coldWeather.put( "2", coldWeatherDetails.getHeadwear() );

        // hotWeather.put("3", hotWeatherDetails);
        // coldWeather.put("3", coldWeatherDetails.getSocks() );

        // hotWeather.put("4", "t-shirt");
        // coldWeather.put("4", coldWeatherDetails.getShirt() );

        // hotWeather.put("5", "fail");
        // coldWeather.put("5", coldWeatherDetails.getJacket() );

        // hotWeather.put("6", "shorts");
        // coldWeather.put("6", coldWeatherDetails.getPants() );

        // hotWeather.put("7", "leaving house");
        // coldWeather.put("7", coldWeatherDetails.getLeavingHouse() );

        // hotWeather.put("8", "Removing PJs");
        // coldWeather.put("8", coldWeatherDetails.getPajamas() );

        // System.out.println( coldWeather.toString() );
    } 

}