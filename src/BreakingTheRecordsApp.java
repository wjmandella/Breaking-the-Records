// My solution to the HackerRank problem "Breaking The Records."
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem


import java.util.Scanner;

public class BreakingTheRecordsApp {
    static int[] breakingRecords(int[] score) {
        // Complete this function
    	int highScoreRecCount = 0;
    	int highScore = score[0];
    	int lowScoreRecCount = 0;
    	int lowScore = score[0];
    	
    	for( int i = 1; i < score.length; i++) {
    		if(highScore < score[i]) {
    			highScore = score[i];
    			highScoreRecCount++;
    		}
    	}
    	
    	for( int j = 1; j < score.length; j++) {
    		if(lowScore > score[j]) {
    			lowScore = score[j];
    			lowScoreRecCount++;
    		}
    	}
    	
    	int[]temp = new int[2];
    	temp[0] = highScoreRecCount;
    	temp[1] = lowScoreRecCount; 
    	return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            System.out.print("Enter the points scored for game #" +(score_i +1)+": ");
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }
}
