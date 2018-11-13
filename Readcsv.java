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
      // 1�s����CSV�t�@�C����ǂݍ���
      while ((line = br.readLine()) != null) {
        String[] data = line.split("\r\n", 0); // �s���J���}��؂�Ŕz��ɕϊ�

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