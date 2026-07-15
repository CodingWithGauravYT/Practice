package basic;

public class PalindromeNumber {

    public static void main(String[] args) {
      int x= 121;
      int temp = x;
      int sum =0;
      while (temp>0){
          int n= temp % 10;
          temp= temp / 10;
          sum = n + (10 * sum);
      }
      if(x==sum){
          System.out.println("no is palindrome :"+sum);
      }else{
          System.out.println("no is not palindrome :"+sum);
      }
    }
}
