import java.util.Arrays;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
		int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Min "+arr[0] );
            System.out.println("Max "+arr[n-1]);
        }
	}
}
