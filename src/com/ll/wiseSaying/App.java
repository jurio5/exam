package com.ll.wiseSaying;

import java.util.Scanner;

public class App {
    Scanner scanner;
    WiseSayingController wiseSayingController;
    public App() {
        scanner = new Scanner(System.in);
        wiseSayingController = new WiseSayingController();
    }
    void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령 ) ");
            String cmd = scanner.nextLine().trim();

            if (cmd.startsWith("삭제?id=")) {
                wiseSayingController.delete(cmd);
                continue;
            }

            if (cmd.startsWith("수정?id=")) {
                wiseSayingController.modify(cmd);
                continue;
            }

            switch(cmd) {
                case "등록":
                    wiseSayingController.add();
                    break;
                case "목록":
                    wiseSayingController.list();
                    break;
                case "종료":
                    return;
                default:
                    System.out.println("잘못된 입력 입니다.");
                    break;
            }
        }
    }
}
