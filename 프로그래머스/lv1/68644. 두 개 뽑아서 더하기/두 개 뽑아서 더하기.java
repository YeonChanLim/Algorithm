import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            int sum = 0;
            
            // 반복문이 0부터 돌면 똑같은 값 계속 구해서 +1로 계산
            for(int j = i + 1; j < numbers.length; j++){
                sum = numbers[i] + numbers[j];
                
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        //리스트에 있는 값들 넣기
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}