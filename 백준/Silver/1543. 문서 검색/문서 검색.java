
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String subStr = br.readLine();

        int count = 0;
        int index = 0;

        // 문서에서 더 이상 찾을 수 없을 때까지 반복
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println(count);
    }
}
