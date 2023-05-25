package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String, Integer> teamScore = new HashMap<>();

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 1) {
                String homeTeam = competitions.get(i).get(0);
                teamScore.put(homeTeam, teamScore.getOrDefault(homeTeam, 0) + 3);
            } else if (results.get(i) == 0) {
                String awayTeam = competitions.get(i).get(1);
                teamScore.put(awayTeam, teamScore.getOrDefault(awayTeam, 0) + 3);
            }
        }
        String winnerTeam = "";
        int highestScore = Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry : teamScore.entrySet() ){
            String team = entry.getKey();
            int score = entry.getValue();

            if(score>highestScore){
                winnerTeam = team;
                highestScore = score;
            }

        }
        return winnerTeam;
    }
}
