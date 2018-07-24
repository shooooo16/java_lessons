import java.io.*;

  public class MyApp6 {
    public static void main(String[] args) {
      //if
      //> >= < <= == !=
      //&& || !
      System.out.print("input integer: ");
      int score;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      try{
            String buf = br.readLine();
            score = Integer.parseInt(buf);
          }catch(Exception e){
            score = 0;
          }
      if (score > 80) {
        System.out.println("great");
      }else if (score > 60) {
        System.out.println("good");
      }else {
        System.out.println("fight!");
      }
    }
  }
