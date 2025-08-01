package maps;

public class TestingClassExercise1_6 {

	
	// assignment 6 exer1
	//1=add load factor to AbstractHashMap (MaximumloadFactor
	//2= modify constructor add float loadFactor
	//3= update put() method to maximumloadFactor
	//4= add float load factor to chainHashMap constructor again
	//5=test code
	//====================================================
	
	
	
	
	public static void main(String[] args) {
		
		    int initialCapacity = 11;
	        //int numInsertions = 100;
				
	        
	        
		   // Map with low load factor (0.5)
        System.out.println("Testing with load factor 0.5:");
        ChainHashMap<Integer, String> mapLow = new ChainHashMap<>(initialCapacity, 109345121, 0.5f);
        runInsertionTest(mapLow, 0.5f);

        // Map with high load factor (0.9)
        System.out.println("\nTesting with load factor 0.9:");
        ChainHashMap<Integer, String> mapHigh = new ChainHashMap<>(initialCapacity, 109345121, 0.9f);
        runInsertionTest(mapHigh, 0.9f);
    }
	
	
	 public static void runInsertionTest(ChainHashMap<Integer, String> map, float maximumloadFactor) {
	        long startTime = System.currentTimeMillis();
	        
	        System.out.println("Insertion, capacity");

	        for (int i = 0; i < 100; i++) {
	            map.put(i, "value" + i);
	            
	            System.out.println((i + 1) + "," + map.capacity); // csv file
	            System.out.println("Inserted key " + i + ", current size: " + map.size());
	            
	            System.out.println("Inserted key " + i + ", current size: " + map.size() + ""
	            		+ ", current capacity: " + map.capacity + ", current load factor: " + 
	            		String.format("%.2f,",(float)map.size( )/map.capacity));
	        }

	        long endTime = System.currentTimeMillis();
	        System.out.println("Time taken: " + (endTime - startTime) + " ms");
	        System.out.println("Final capacity: " + map.getCapacity());

	     	        
	    }
	

}

