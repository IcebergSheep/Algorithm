import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;

        for(int i = 0; i<N; i++){
            int prime = scan.nextInt();

            for(int k = 2; k<=prime; k++){
                if (k == prime){
                    count++;
                }
                if(prime % k == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
