import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n / 4; i++) {
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
        br.close();
    }
}
