import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        String[] firstName = {"ola", "anita", "sukanmi", "arike", "anita", "sukanmi", "dami", "arike"};

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        for(int index = 0; index < firstName.length; index++) {
            hashtable.put(index, firstName[index]);
        }

        Set<String> hashSet = new HashSet<>();

        int index = 0;
        while (index < hashtable.size()) {
            hashSet.add(hashtable.getOrDefault(index, null));
            index++;
        }

        System.out.println(hashSet);
    }
}
