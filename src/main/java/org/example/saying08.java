package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class saying08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> id_list = new ArrayList<>();
        ArrayList<String> wise_list = new ArrayList<>();
        ArrayList<String> author_list = new ArrayList<>();
        System.out.println("==명언 앱==");
        while (true){
            System.out.print("명령)");
            String command = scanner.nextLine();
            if(command.equals("등록")){
                System.out.print("명언:");
                String wise = scanner.nextLine();
                System.out.print("작가:");
                String author = scanner.nextLine();
                count++;
                System.out.println(count+"번 명언이 등록되었습니다.");
                id_list.add(count);
                wise_list.add(wise);
                author_list.add(author);
            }
            else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i = 0; i < wise_list.size(); i++){
                    System.out.println(id_list.get(i)+" / "+author_list.get(i)+" / "+wise_list.get(i));
                }
            }
            else if (command.equals("삭제")) {
                System.out.print("id=");
                int delete_id = scanner.nextInt();
                scanner.nextLine();
                if(id_list.get(delete_id-1) == delete_id){
                    id_list.remove(delete_id-1);
                    wise_list.remove(delete_id-1);
                    author_list.remove(delete_id-1);
                    System.out.println(delete_id+"번 명언이 삭제되었습니다.");
                }
                else {
                    System.out.println(delete_id+"번 명언은 존재하지 않습니다.");
                }
            }
            else if(command.equals("수정")){
                System.out.print("id=");
                int edit_id = scanner.nextInt();
                scanner.nextLine();
                if(id_list.get(edit_id-1) == edit_id){
                    System.out.println("명언(기존) : "+wise_list.get(edit_id-1));
                    System.out.print("명언 : ");
                    String edit_wise = scanner.nextLine();
                    System.out.println("작가(기존) : "+author_list.get(edit_id-1));
                    System.out.print("작가 : ");
                    String edit_author = scanner.nextLine();
                    wise_list.set(edit_id-1, edit_wise);
                    author_list.set(edit_id-1, edit_author);
                }
            }
            else if(command.equals("종료")){
                System.exit(0);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
