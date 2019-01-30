import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hashmap {

  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      
      Map<Integer, Integer> product= new HashMap<>(); 
      product.put(100, 1500);
      product.put(101, 1600);
      product.put(102, 1750);
    
    //inserting new barcode  
      int barcode;
      System.out.println("Enter a barcode number: ");
      barcode=sc.nextInt();
      while(product.containsKey(barcode)){
        System.out.println("Enter another barcode number: ");
      barcode=sc.nextInt();
      }
      System.out.println("Enter the price for that object: ");
      int price=sc.nextInt();
      product.put(barcode,price);
      
      //display most expensive
      int mostexpensive=0;
      for(int prices: product.values()){
         if(prices>mostexpensive)
           mostexpensive=prices;
      }
      System.out.println("The most expensive price is "+ mostexpensive);
      
      
      
      
      
  }

}
