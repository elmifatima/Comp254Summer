package maps;
import java.util.HashMap;
public class hashMapPractice {

	public static void main(String[] args) {

		HashMap favorites = new HashMap(100);
		favorites.put("movie",  "shrek");
		favorites.put("bnad", "LOTL");
		favorites.put("car", "viper");
		favorites.put("youtuber", "scrumtous");
		
		System.out.println(favorites);
		
		System.out.println(favorites.get("youtuber"));
		
		String handle = "cameronmcnz";
		System.out.println(handle.hashCode());
		
		
		
	}

}
