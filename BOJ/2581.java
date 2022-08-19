import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int sum = 0;
        int min = 0;

        for(int i = M; i>=N; i--){
            for(int j = 2; j<=i; j++){
                if(i % j == 0 && i!=j){
                    break;
                }
                if(i == j+1 || i == 2){
                    sum+=i;
                    min = i;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
