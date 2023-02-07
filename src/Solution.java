import java.util.*;

// Find winner for a list of voters: each voter can vote at maximum 3 times and the first vote wins 3 points, the second
// 2 points and the third 1 point.
public class Solution {
    static List<String> findWinner(List<List<String>> voters) {
        HashMap<String, Integer> votingSessionResults = new HashMap<>();
        for (List<String> voter : voters) {
            int points = 3;
            for (String vote : voter) {
                votingSessionResults.put(vote, points + votingSessionResults.getOrDefault(vote, 0));
                points--;
            }
        }

        List<Map.Entry<String, Integer>> points = new ArrayList<>(votingSessionResults.entrySet());
        points.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        HashMap<Integer, String> votingSessionResult = new HashMap<>();
        int j = 0;
        for (Map.Entry<String, Integer> entry : points) {
            votingSessionResult.put(j, entry.getKey()); //O(1)
            j++;
        }
        return List.copyOf(votingSessionResult.values());
    }
}