package org.example;

import java.util.Scanner;

public class saying04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("== 명언 앱 ==");
        while(true){
            System.out.print("명령)");
            String command = scanner.nextLine();

            if(command.equals("등록")){
                System.out.print("명언 :");
                String wise = scanner.nextLine();
                System.out.print("작가 :");
                String author = scanner.nextLine();
                count++;
                System.out.println(count+"번 명언이 등록되었습니다.");
            }
            else if(command.equals("종료")){
                System.exit(0);
            }
            else{
                System.out.println("알 수 없는 명령입니다.");
            }
        }
    }
}
