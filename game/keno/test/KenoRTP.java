package game.keno.test;

import game.keno.KenoGame;
import game.keno.RtpResult;
import game.keno.SpinResponse;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KenoRTP {
     static int numberOfAvailableThreads = Runtime.getRuntime().availableProcessors();
//static int numberOfAvailableThreads = 1;
    static int rounds = 1000_0000; // Number of rounds to simulate
    static int finishedThreadCount = 0;
    static int stake = 1; // Assuming a fixed stake of 1 unit per round

    static double totalWin = 0;
    static int totalSpot2Count = 0;
    static int eachThreadRounds = rounds / numberOfAvailableThreads;
    static long startingTime;
    static RtpResult rtpResult = new RtpResult();

    public static void main(String[] args) {
        ExecutorService  executorService = Executors.newFixedThreadPool(numberOfAvailableThreads);
        startingTime = System.currentTimeMillis();

        for(int i = 0; i < numberOfAvailableThreads; i++){
            executorService.submit(()-> simulateKenoRounds());

        }
    }

    private static void simulateKenoRounds() {

        addToRtpResult(playGame());

    }

    private static RtpResult playGame() {

        KenoGame kenoGame = new KenoGame();
        Random random = new Random();

        double totalWin = 0;
        int spotCount2 = 0;
        int spotCount3 = 0;
        int spotCount4 = 0;
        int spotCount5 = 0;
        int spotCount6 = 0;
        int spotCount7 = 0;
        int spotCount8 = 0;
        int spotCount9 = 0;
        int spotCount10 = 0;

//        int rounds = 1000_000; // Number of rounds to simulate

        int countWin = 0;


        for (int i = 0; i < eachThreadRounds; i++) {

            SpinResponse spinResponse = kenoGame.playGame(stake, random);
            double winAmount = spinResponse.getWinAmount();


            totalWin += winAmount;
        }

        RtpResult rtpResult = new RtpResult();
        rtpResult.setTotalWins(totalWin);


//        double rtp = (double) totalWin / totalStake * 100;
//        System.out.println("Hit rate: " + ((double) countWin / rounds * 100) + "%");
//        System.out.println("Total Stake: " + totalStake);
//        System.out.println("Total Win: " + totalWin);
//        System.out.println("RTP: " + rtp + "% ");
        return rtpResult;
    }

    private static synchronized void addToRtpResult(RtpResult newRtpResult) {
        finishedThreadCount++;
        if (rtpResult == null) {
            rtpResult = newRtpResult;
        } else {
            rtpResult.merge(newRtpResult);
        }
       // totalWin += result;

        if (finishedThreadCount == numberOfAvailableThreads) {
            int totalStake = stake * rounds;
            System.out.println("All threads finished. Total RTP result: " + (rtpResult.getTotalWins()/totalStake * 100) + "%");

              long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startingTime) / 1000.0 + " seconds");
        }

    }


}
