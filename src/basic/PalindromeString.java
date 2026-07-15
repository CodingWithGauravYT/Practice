package basic;

public class PalindromeString {

    public static void main(String[] args) {
        String str= "madam";
        StringBuilder rev= new StringBuilder();
        for(int i=str.length()-1;i>=0; i--){
            rev.append(str.charAt(i));
        }

        if(str.equals(rev.toString())){
            System.out.println("string is palindrome : "+ rev);
    }else{
            System.out.println("string is not palindrome : "+ rev);
        }


    }
}
