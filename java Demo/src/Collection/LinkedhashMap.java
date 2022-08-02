package Collection;

import java.util.*;


public class LinkedhashMap {
 
    
    public static void main(String a[])
    {
 
        
        LinkedHashMap<String, String> lhm
            = new LinkedHashMap<String, String>();
 
      
        lhm.put("one", "Madhavi11@gmail.com");
        lhm.put("two", "Madhu@gmail.com");
        lhm.put("three", "<MadhaviAdimulam");
 
      
        System.out.println(lhm);
 
     
 
        
        System.out.println("Getting value for key 'one': "
                           + lhm.get("one"));
 
      
        System.out.println("Size of the map: "
                           + lhm.size());
 

        System.out.println("Is map empty? "
                           + lhm.isEmpty());
 
      
        System.out.println("Contains key 'two'? "
                           + lhm.containsKey("two"));
 
        
        System.out.println(
            "Contains value 'Madhavi"
            + "Madhu'? "
            + lhm.containsValue("practice"
                                + "Madhu@gmail.com"));
 
    
        System.out.println("delete element 'one': "
                           + lhm.remove("one"));
 
      
        System.out.println("Mappings of LinkedHashMap : "
                           + lhm);
    }
}