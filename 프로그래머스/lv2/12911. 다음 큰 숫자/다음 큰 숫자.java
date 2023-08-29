class Solution {
    public int solution(int n) {
        
        int answer = 0;        
        // 입력된 정수를 이진수 문자열로 변환
        String str = Integer.toBinaryString(n);
        
        // 입력된 이진수에서 '1'의 개수를 세는 변수
        int cnt =0;

        // 입력된 이진수 문자열에서 '1'의 개수를 세는 반복문
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1') cnt++;
        }

        // n보다 큰 수 중에서 '1'의 개수가 같은 수를 찾는 반복문
        for(int i =n+1;i<1000000;i++){

            String temp = Integer.toBinaryString(i);
            int temp_cnt = 0;
            for(int j =0;j<temp.length();j++){
                if(temp.charAt(j) == '1') temp_cnt++;
            }
            
            if(temp_cnt == cnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}