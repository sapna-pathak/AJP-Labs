public class HillStations { 				 // HillStations class
    public void location() {
        System.out.println("Location: Unknown");
    }

    public void famousFor() {
        System.out.println("Famous for: Unknown");
    }
}
public class Manali extends HillStations {  	  //Manali class
  
    public void location() {
        System.out.println("Location: Manali");
    }

   
    public void famousFor() {
        System.out.println("Famous for: Skiing, Snow-capped Mountains");
    }
}
class Mussoorie extends HillStations { 		//Mussoorie class
  
    public void location() {
        System.out.println("Location: Mussoorie");
    }

    
    public void famousFor() {
        System.out.println("Famous for: Scenic Views, Hill Stations");
    }
}

class Gulmarg extends HillStations {		//Gulmarg class
   
    public void location() {
        System.out.println("Location: Gulmarg");
    }

   
    public void famousFor() {
        System.out.println("Famous for: Ski Resorts, Natural Beauty");
    }
}
public class AJPlab3a{
    public static void main(String[] args) {
        // Creating objects of each subclass
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Calling methods from the superclass reference
        System.out.println("Calling from superclass reference:");
        manali.location();   
        manali.famousFor();  

        mussoorie.location();  
        mussoorie.famousFor();

        gulmarg.location();    
        gulmarg.famousFor();   

        System.out.println("\nCalling from subclass reference:");
        // Directly calling methods from subclass references
        Manali realManali = new Manali();
        Mussoorie realMussoorie = new Mussoorie();
        Gulmarg realGulmarg = new Gulmarg();

        realManali.location();   
        realManali.famousFor();  

        realMussoorie.location();
        realMussoorie.famousFor();

        realGulmarg.location();   
        realGulmarg.famousFor();  
    }
}