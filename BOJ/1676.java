//팩토리얼 0의 개수

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int count = 0;
        
        while(num >= 5){
            count += num/5;
            num /= 5;
        }
        
        System.out.println(count);
    }
}
