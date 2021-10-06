package ex1;

import java.util.*;
import java.lang.*;

/*Exercici 1. Creu un objecte de tipus Month amb un atribut "name" (que contingui el nom del mes de l'any).
Anyada 11 objectes Month (cadascun amb el seu atribut diferent) en un Contenidor Java, a excepció de l'objecte amb atribut "Agost".
Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri que el Contenidor manté l'ordre correcte.
*/		

class main
{  
    public static void main(String args[])
    {
        ArrayList<month> mList = new ArrayList<>();
        mList.add( new month( "Gener") );
        mList.add( new month("Febrer") );
        mList.add( new month("Març") );
        mList.add( new month("Abril") );
        mList.add( new month("Maig") );
        mList.add( new month("Juny") );
        mList.add( new month("Juliol") );
        mList.add( new month("Septembre") );
        mList.add( new month("Octubre") );
        mList.add( new month("Novembre") );
        mList.add( new month("Desembre") );
        
        
        mList.add(7,new month("Agost") );
        
        
        for(month mc : mList) {
            System.out.println( mc.getDataOne());
        }

    }
}

class month
{
    
	
	private String dataOne;
  
    
    public month(String dataOne ) {
        this.dataOne=dataOne;
      
    }
    
    public String getDataOne(){
        return this.dataOne;
    }
    
 
    
}
