import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt(); 
        int count = 0;
        int length = 64;

        while(X>0){

            if(X<length) { // 막대의 길이가 원하는 길이보다 짧을 경우
                length /= 2; 
            } else{
                count++;
                X-=length;
            }
        }
        System.out.println(count);
    }
}
