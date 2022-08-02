package Collection;

public class TreeMap {
	  

    static void Example1stConstructor()
    {

        TreeMap tree_map
            = new TreeMap();
  
    
        tree_map.put(15, "Adimulam");
        tree_map.put(20, "krishna");
        tree_map.put(25, "Madhavi");
    
  
        System.out.println("Madhavi: " + tree_map);
    }
  
  
    private void put(int i, String string) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args)
    {
        System.out.println("Madhavi using "
                           + "Madhavi() constructor:\n");
  
      
        Example1stConstructor();
    }
}