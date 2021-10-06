package ex2;
import java.util.*;

/*Exercici 2. Asseguri's que el Contenidor utilitzat en el punt anterior no 
 permet duplicats, i verifiqui'l.*/		

public class main
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
        mList.add( new month("Agost") );
        mList.add( new month("Septembre") );
        mList.add( new month("Octubre") );
        mList.add( new month("Novembre") );
        mList.add( new month("Desembre") );
        
        
        mList.add(new month("Agost") );
        
        LinkedHashSet<month> linkedHashSet1
        = new LinkedHashSet<month>(mList);
        

        
        for(month mc : linkedHashSet1 ) {
            System.out.println( mc.getDataOne());
        }

    }
}

class month
{
    
	
	private String dataOne;
  
    
    @Override
	public int hashCode() {
		return Objects.hash(dataOne);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		month other = (month) obj;
		return Objects.equals(dataOne, other.dataOne);
	}

	public month(String dataOne ) {
        this.dataOne=dataOne;
      
    }
    
    public String getDataOne(){
        return this.dataOne;
    }
    
    
}

