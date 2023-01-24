// Assignment #1
// Author: Lucas Ten
// Student #: 101265497
// Date: Friday, February 3, 2023
public class Convert{
   public static double convert(String temperature, char scale){
      double temp;
      char currentScale;
      int length = temperature.length();
      currentScale = temperature.charAt(length - 1);
      temperature = temperature.substring(0, length-1);
      temp = Double.valueOf(temperature);
      if(!(scale == currentScale)){
         if(scale == 'F'){
            temp = temp * 1.8 + 32;
         }
         else{
            System.out.println(currentScale + " , " + scale);
            temp = (temp - 32) * 5 / 9;
         }
      }
      if(scale == 'C' && temp < -273.15) temp = -273.15;
      if(scale == 'F' && temp < -459.67){
         temp = -459.67;
      }
      return temp;
   }
}
