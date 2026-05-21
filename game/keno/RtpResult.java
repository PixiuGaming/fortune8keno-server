package game.keno;

public class RtpResult {

    private int matchedNumbersCount;
    private double winAmount;
    private boolean multiplierTriggered;
    private int lastServerNum;
    private int multiplier;
    private int numberOfSpots;
    private double totalWins;

    public double getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(double totalWins) {
        this.totalWins = totalWins;
    }

    private int spot2MatchedCount;
    private int spot3MatchedCount;
    private int spot4MatchedCount;
    private int spot5MatchedCount;

    private int matchedCount_0;

    public int getMatchedCount_0() {
        return matchedCount_0;
    }

    public void setMatchedCount_0(int matchedCount_0) {
        this.matchedCount_0 = matchedCount_0;
    }

    private int matchedCount_1;
    private int matchedCount_2 ;
    private int matchedCount_3;

    public int getMatchedCount_1() {
        return matchedCount_1;
    }

    public void setMatchedCount_1(int matchedCount_1) {
        this.matchedCount_1 = matchedCount_1;
    }

    public int getMatchedCount_2() {
        return matchedCount_2;
    }

    public void setMatchedCount_2(int matchedCount_2) {
        this.matchedCount_2 = matchedCount_2;
    }

    public int getMatchedCount_3() {
        return matchedCount_3;
    }

    public void setMatchedCount_3(int matchedCount_3) {
        this.matchedCount_3 = matchedCount_3;
    }

    public int getSpot3MatchedCount() {
        return spot3MatchedCount;
    }

    public void setSpot3MatchedCount(int spot3MatchedCount) {
        this.spot3MatchedCount = spot3MatchedCount;
    }

    public int getSpot4MatchedCount() {
        return spot4MatchedCount;
    }

    public void setSpot4MatchedCount(int spot4MatchedCount) {
        this.spot4MatchedCount = spot4MatchedCount;
    }

    public int getSpot5MatchedCount() {
        return spot5MatchedCount;
    }

    public void setSpot5MatchedCount(int spot5MatchedCount) {
        this.spot5MatchedCount = spot5MatchedCount;
    }

    public int getSpot6MatchedCount() {
        return spot6MatchedCount;
    }

    public void setSpot6MatchedCount(int spot6MatchedCount) {
        this.spot6MatchedCount = spot6MatchedCount;
    }

    public int getSpot7MatchedCount() {
        return spot7MatchedCount;
    }

    public void setSpot7MatchedCount(int spot7MatchedCount) {
        this.spot7MatchedCount = spot7MatchedCount;
    }

    public int getSpot8MatchedCount() {
        return spot8MatchedCount;
    }

    public void setSpot8MatchedCount(int spot8MatchedCount) {
        this.spot8MatchedCount = spot8MatchedCount;
    }

    public int getSpot9MatchedCount() {
        return spot9MatchedCount;
    }

    public void setSpot9MatchedCount(int spot9MatchedCount) {
        this.spot9MatchedCount = spot9MatchedCount;
    }

    public int getSpot10MatchedCount() {
        return spot10MatchedCount;
    }

    public void setSpot10MatchedCount(int spot10MatchedCount) {
        this.spot10MatchedCount = spot10MatchedCount;
    }

    private int spot6MatchedCount;
    private int spot7MatchedCount;
    private int spot8MatchedCount;
    private int spot9MatchedCount;
    private int spot10MatchedCount;


    public int getSpot2MatchedCount() {
        return spot2MatchedCount;
    }

    public void setSpot2MatchedCount(int spot2MatchedCount) {
        this.spot2MatchedCount = spot2MatchedCount;
    }

    public void setMatchedNumbersCount(int matchedNumbersCount) {
        this.matchedNumbersCount = matchedNumbersCount;
    }

    public void setWinAmount(double winAmount) {
        this.winAmount = winAmount;
    }

    public void setMultiplierTriggered(boolean multiplierTriggered) {
        this.multiplierTriggered = multiplierTriggered;
    }

    public void setLastServerNum(int lastServerNum) {
        this.lastServerNum = lastServerNum;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    public int getMatchedNumbersCount() {
        return matchedNumbersCount;
    }

    public double getWinAmount() {
        return winAmount;
    }

    public boolean isMultiplierTriggered() {
        return multiplierTriggered;
    }

    public int getLastServerNum() {
        return lastServerNum;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void merge(RtpResult newRtpResult) {
        this.totalWins += newRtpResult.getTotalWins();



    }
}
