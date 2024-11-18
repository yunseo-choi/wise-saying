package org.example;

import java.util.Scanner;
public class saying01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        System.out.print("명령)");
        String command = scanner.nextLine();

        if(command == "종료"){
            System.exit(0);
        }
    }
}