import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {
        String[] colors = {"White", "Brown", "Red", "Yellow"};

        List<String> myList = new ArrayList<String>();

        for (String color : colors) {
            myList.add(color);
        }

        String[] removeColors = {"Red", "White"};

        List<String> removeList = new ArrayList<String>();
        
        for (String color : colors) {
            removeList.add(color);
        }

        System.out.println("ArrayList: ");
        
        for (int count = 0; count < myList.size(); count++) {
            System.out.printf("%s ", myList.get(count));
        }
    }
}
