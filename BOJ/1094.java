import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int count = 0;
        int length = 64;

        while(X>0){

            if(X<length) {
                length /= 2;
            } else{
                count++;
                X-=length;
            }
        }
        System.out.println(count);
    }
}
