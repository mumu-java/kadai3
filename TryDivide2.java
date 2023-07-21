import java.text.NumberFormat;

public class TryDivide2{
  public static void main(String[] args){
    try{
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("a / b = " + (a / b) + " あまり " + (a % b));
    } catch (NumberFormatException e) {
      // TODO: handle exception
      System.out.println("数値を入力してください");
      e.printStackTrace();
    }catch (ArithmeticException e) {
      // TODO: handle exception
      System.out.println("割る数は0以外を入力してください");
      e.printStackTrace();
    }catch (Exception e) {
      // TODO: handle exception
      System.out.println("例外が発生しました");
      e.printStackTrace();
    }finally{
        System.out.println("プログラムを終了します");
      }
  }
}


try{
  //通常の処理
}catch(例外クラス　オブジェクト名){
  //例外発生時の処理
}finally{
  //後処理
}