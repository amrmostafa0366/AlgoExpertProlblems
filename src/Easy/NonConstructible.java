package Easy;

public class NonConstructible {

    public static int nonConstructibleChange(int[] coins) {
        int currentChange = 0;
        for(int i =0; i<coins.length;i++){
            if(coins[i] <= currentChange+1){
                currentChange = coins[i];
            } else {
                return currentChange;
            }
        }
        return currentChange;
    }
}
