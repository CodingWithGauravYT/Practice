package basic;

public class FindMissingNo {

    public static void main(String[] args) {
        int arr[] = {5,4,2,1,7,6};

        int n = 7;
        int expectedSum = n * (n+1)/2;

        System.out.println("expected sum = "+ expectedSum);
        int actualSum=0;
        for (int i=0; i<arr.length; i++) {
            actualSum+=arr[i];
        }

        System.out.println("\n actualSum = "+actualSum);

        System.out.println("\n missing no ="+ (expectedSum - actualSum));
    }
}
