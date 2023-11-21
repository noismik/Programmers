class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double resultD = answer;
        resultD = (double) num1/num2;
        resultD = resultD*1000;
        int result = (int) Math.floor(resultD);
        
        return result;
    }
}