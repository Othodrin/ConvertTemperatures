// Assignment #1
// Author: Lucas Ten
// Student #: 101265497
// Date: Friday, February 3, 2023
public class Convert{
   public static double convert(String temperature, char scale){
      // converts a temperature (value/scale) to a new scale
      double temp;
      char currentScale;
      int length = temperature.length();
      currentScale = temperature.charAt(length - 1);
      temperature = temperature.substring(0, length-1);
      temp = Double.valueOf(temperature);
      if(!(scale == currentScale)){
         if(scale == 'F'){
            temp = temp*(1.8) + 32;
         }
         else{
            temp = temp - 32 * (5/9);
         }
      }
      return temp;
   }

   public static void main(String[] args){
      System.out.println("Testing Convert.convert");
      String in = "10.0C";
      char scale = 'F';
      double expect = 50.0;
      double out = Convert.convert(in, scale);
      System.out.println("convert(\"" + in + "\",\'" + scale + "\')");
      System.out.println("...expect : " + expect);
      System.out.println("...actual : " + out);
      
      in = "10.0C";
      scale = 'C';
      expect = 10.0;
      out = Convert.convert(in, scale);
      System.out.println("convert(\"" + in + "\",\'" + scale + "\')");
      System.out.println("...expect : " + expect);
      System.out.println("...actual : " + out);
      
   }
}