package com.mycompany.app;
import java.util.ArrayList;

// Last changed on 29.09.2018 07.29

public class App 
{
    public static boolean search(ArrayList<Integer> arrayL,Integer[] array,Double[] arrayd, int e) {
        System.out.println("inside search");
        if (arrayL == null && array == null && arrayd == null) return false;
  
        if(arrayL != null)
          for (int elt : arrayL) {
            if (elt == e) return true;
          }
        if(array != null && array[0] != null)
          for (int elt : array){
            if(elt == e) return true;
          }
        if(arrayd != null && arrayd[0] != null)
          for (double elt : arrayd){
            if(elt == (double)e) return true;
          }
        return false;
      }

}
