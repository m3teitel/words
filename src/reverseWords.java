import java.io.*;

/**
 * Created by Mike on 2017-02-01.
 */
public class reverseWords {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String strCases = br.readLine(), line;
        int cases = Integer.parseInt(strCases), k = 1;
        while (k <= cases) {
            StringBuilder sb = new StringBuilder();
            line = br.readLine();
            String[] a = line.split(" ");
            for (int i = 1; i <= a.length; i++) {
                sb.append(a[a.length - i] + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            bw.write("Case #" + k + ": " + sb.toString());
            bw.newLine();
            k++;
        }
        bw.close();
    }
}
