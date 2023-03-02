package Lec_DP;

public class Edit_Distance {
	class Solution {
//	    public int minDistance(String word1, String word2) {
//	        
//	        return minDistance(0,0,word1,word2);
//	    }
		public int minDistance(String word1, String word2) {
	        int[][] dp = new int[word1.length()+1][word2.length()+1];
	        for(int idx1 = word1.length();idx1>=0;idx1--){
	            for(int idx2 = word2.length();idx2>=0;idx2--){
	                // dp[idx1][idx2]
	                 if(idx1==word1.length()){
	                    dp[idx1][idx2]=  word2.length() - idx2;
	                    continue;
	                }
	                if(idx2==word2.length()){
	                    dp[idx1][idx2]=  word1.length() - idx1;
	                    continue;
	                }
	                if(word1.charAt(idx1)==word2.charAt(idx2)){
	                    int sp1 = dp[idx1+1][idx2+1];
	                    dp[idx1][idx2]= sp1;
	                }else{
	                    int R = dp[idx1+1][idx2+1];
	                    int D = dp[idx1+1][idx2];
	                    int I = dp[idx1][idx2+1];
	                    dp[idx1][idx2]=Math.min(Math.min(I,R),D)+1; 
	                }
	            }
	        }
	        return dp[0][0];
	        // return minDistance(0,0,word1,word2,new Integer[word1.length()][word2.length()]);
	    }
	    public int minDistance(int idx1,int idx2,String word1, String word2) {
	        if(idx1==word1.length()){
	            return word2.length() - idx2;
	        }
	        if(idx2==word2.length()){
	            return word1.length() - idx1;
	        }
	        if(word1.charAt(idx1)==word2.charAt(idx2)){
	            int sp1 = minDistance(idx1+1,idx2+1,word1,word2);
	            return sp1;
	        }else{
	            int R = minDistance(idx1+1,idx2+1,word1,word2);
	            int D = minDistance(idx1+1,idx2,word1,word2);
	            int I = minDistance(idx1,idx2+1,word1,word2);
	            
	            return Math.min(Math.min(I,R),D)+1;
	        }
	        
	    }
	}
}
