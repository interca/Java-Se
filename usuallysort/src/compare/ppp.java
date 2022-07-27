package compare;

public class ppp {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelzzydog";
        int[] array = new int[26];
        for (char c : sentence.toCharArray()) {
            array[c - 'a']++;

        }
        System.out.println("-------------------------");
        for (int i : array)
            System.out.println(i);
    }
}
