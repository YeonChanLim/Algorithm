import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] alpa = new char[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] type = new int[4]; //RT CF JM AN
        for(int i = 0; i < choices.length; i++){
            if(survey[i].equals("NA")){
                type[3] -= (choices[i] - 4);
            }
            if(survey[i].equals("AN")){
                type[3] += (choices[i] - 4);
            }
            if(survey[i].equals("MJ")){
                type[2] -= (choices[i] - 4);
            }
            if(survey[i].equals("JM")){
                type[2] += (choices[i] - 4);
            }
            if(survey[i].equals("FC")){
                type[1] -= (choices[i] - 4);
            }
            if(survey[i].equals("CF")){
                type[1] += (choices[i] - 4);
            }
            if(survey[i].equals("TR")){
                type[0] -= (choices[i] - 4);
            }
            if(survey[i].equals("RT")){
                type[0] += (choices[i] - 4);
            }
        }
        for(int j = 0; j < 4; j++){
            if(type[j] < 0){
                answer += alpa[j*2];
            }else if(type[j] > 0){
                answer += alpa[j*2 + 1];
            }else{
                answer += alpa[j*2];
            }
        }
        return answer;
    }
}