import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (m < 45) {
            if (h == 0) {
                h = 23;
                m += 15;
            } else {
                h -= 1;
                m += 15;
            }
        } else {
            m -= 45;
        }
        bw.write(String.valueOf(h) + " " + String.valueOf(m));
        bw.flush();
        bw.close();
        br.close();
    }
}