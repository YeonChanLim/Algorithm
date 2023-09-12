import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            HashMap<String, Integer> nameMap = new HashMap<>();
            String[] nameArr = new String[N + 1];
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < N + 1; i++) {
                String name = br.readLine();
                nameMap.put(name, i);
                nameArr[i] = name;
            }

            while (M-- > 0) {
                String findStr = br.readLine();
                if (isStringNumber(findStr)) { // 숫자(인덱스)를 입력받은 경우
                    int index = Integer.parseInt(findStr);
                    sb.append(nameArr[index]);
                } else {    // 문자를 입력받은 경우
                    sb.append(nameMap.get(findStr));
                }
                sb.append("\n");
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public static boolean isStringNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}