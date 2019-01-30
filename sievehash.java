package sieveo;

import java.util.HashSet;
public class sievehash {

  public static void main(String[] args) {
      HashSet<Integer> prime= new HashSet<Integer>();
      for(int i=2; i<=10; i++){
        for(int j=i; j<=100; j++){
          if( (j!=i)&& (j%i==0))
            prime.add(j);  
        }
      }
    for(int a=2; a<=100 ; a++){
        if(!prime.contains(a))
          System.out.println(a);
      }
  }
}
