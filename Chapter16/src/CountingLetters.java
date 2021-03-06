import java.util.HashMap;

public class CountingLetters {
    public static void main(String[] args) {
        String text = "Hello There";
        HashMap<Integer, Character> hashMap = new HashMap<>();

        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ') {
                hashMap.put(count, text.charAt(i));
                count++;
                if(hashMap.containsValue(text.charAt(i))) {
                    System.out.println("M");
                }
            }
        }

        System.out.println("Total number of characters in a string: " + count);

        //            if(text.charAt(i) != ' ')
//
//                count++;
    }
}
