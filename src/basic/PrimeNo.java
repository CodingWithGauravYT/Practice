package basic;

public class PrimeNo {

    public static void main(String arg[]) {
        int primeNo = 13;
        boolean flag= true;

        for (int i=2; i<=primeNo/2; i++) {

            if(primeNo %i ==0) {
                System.out.println("no is not prime = "+primeNo);
                flag=false;
                break;
            }

        }
        if(flag)
            System.out.println("prime no ="+primeNo);

    }
}
