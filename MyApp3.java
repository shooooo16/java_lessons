  public class MyApp3 {
    public static void main(String[] args) {
      //文字 (一つだけの文字)
      char a ='a';
      //整数 byte short int long(右に行くほど大きな数を扱える)
      int x = 10;
      long y = 5555555555L; //ロングの場合は数値の後にLをつける

      //浮動小数点数　float double(doubleの方が大きな文字が扱える)
      double d = 236.562;
      float f = 32.33F; // floatは数値の最後にfをつける必要がある

      //論理値 true or false
      boolean flag = true;

      //特殊文字
      //\n 改行
      //\t タブ

      System.out.println(a);
      System.out.println(x);
      System.out.println(y);
      System.out.println(d);
      System.out.println(f);
      System.out.println(flag);
    }
  }
