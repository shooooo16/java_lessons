import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
 
class Readcsv {
  public static void main(String args[]) {
    try {
      File f = new File("../test.csv");
      BufferedReader br = new BufferedReader(new FileReader(f));
 
      String line;
      // 1行ずつCSVファイルを読み込む
      while ((line = br.readLine()) != null) {
        String[] data = line.split("\r\n", 0); // 行をカンマ区切りで配列に変換

        for (String elem : data) {
          System.out.println(elem);
        }
      }
      br.close();

    } catch (IOException e) {
      System.out.println(e);
    }
  }
}