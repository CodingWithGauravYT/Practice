package basic;

import javax.xml.transform.stream.StreamSource;

public class GCDOfOddAndEvenSum {

   public static void main(String[] args) {

       GCDOfOddAndEvenSum gc= new GCDOfOddAndEvenSum();
        int num =4;
        int even = gc.sumOfEven(num);
        int odd = gc.sumOfOdd (num);
        int gcd =0;
        int min = Math.min(even, odd);
        for (int i=1; i<=min; i++){
            if(even%i==0 && odd%i==0){
                gcd =i;
            }
        }
       System.out.println("num ="+num);
       System.out.println("even ="+even);
       System.out.println("odd ="+odd);
       System.out.println("gcd ="+gcd);
    }

    public int sumOfEven(int num){
       int sum=0;
       int count =0;

       for (int i=2; count<num; i=i+2){
           if (i%2==0){
               sum+=i;
               count++;
           }
       }
       return sum;
    }

    public int sumOfOdd(int num){
        int sum=0;
        int count =0;

        for (int i=1; count<num; i=i+2){
            if (i%2==1){
                sum+=i;
                count++;
            }
        }
        return sum;
    }
}
