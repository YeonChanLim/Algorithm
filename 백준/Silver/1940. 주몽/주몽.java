import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            int end = start+1;

            while(end < n){
                sum = arr[start];
                sum+= arr[end++];
                if (sum == m){
                    count++;
                    break;
                }
            }

        }

        System.out.println(count);

    }
}
