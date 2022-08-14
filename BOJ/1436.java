//영화 감독 숌

import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = 666;
        int count = 1;

        int N = scan.nextInt();

        while(count!= N){
            num++;

            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}
