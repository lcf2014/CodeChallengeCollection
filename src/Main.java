import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //A, B, C
    static List<String> voter1 = Arrays.asList("A", "B", "C");
    static List<String> voter2 = Arrays.asList();
    static List<String> voter3 = Arrays.asList("A", "C");


    static List<List<String>> voters = Arrays.asList(voter1, voter2, voter3);

    public static void main(String[] args) {
        System.out.println(Solution.findWinner(voters));
    }
}