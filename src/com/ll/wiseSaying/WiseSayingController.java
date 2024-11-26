package com.ll.wiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    Scanner scanner;
    List<WiseSaying> wiseSayings;
    int count;

    public WiseSayingController() {
        scanner = new Scanner(System.in);
        wiseSayings = new ArrayList<>();
        count = 0;
        sample();
    }

    public void add() {
        System.out.print("작가 : ");
        String author = scanner.nextLine().trim();

        System.out.print("명언 : ");
        String comment = scanner.nextLine().trim();

        register(author,comment);
        System.out.println(count+ "번 명언이 등록되었습니다.");
    }

    public void register(String author, String comment) {
        int localCount = ++count;

        wiseSayings.add(create(localCount, author, comment));
    }

    public WiseSaying create(int id , String comment, String author) {

        return new WiseSaying(id, author, comment);
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-----------------------");

        for (WiseSaying wiseSaying : wiseSayings.reversed()) {
            System.out.println(wiseSaying.getId() + " / " + wiseSaying.getAuthor() + " / " + wiseSaying.getComment());
        }
    }

    public void delete(String cmd) {
        try {
            String div = cmd.split("=", 2)[1];
            int convert = Integer.parseInt(div);
            boolean removed = wiseSayings.removeIf(s -> s.getId() == convert);

            if (removed) {
                System.out.println(convert + "번 명언이 삭제되었습니다.");
            } else {
                System.out.println(convert + "번 명언은 존재하지 않습니다.");
            }

        } catch (NumberFormatException e) {
            System.out.println("올바른 형식이 아닙니다. 삭제?id=번호 와 같은 형식으로 작성해주세요.");
        }
    }

    public void modify(String cmd) {
        String div = cmd.split("=",2)[1];
        int convert = Integer.parseInt(div);
        WiseSaying s = null;

        for (WiseSaying wiseSaying : wiseSayings) {
            if (wiseSaying.getId() == convert) {
                s = wiseSaying;
                break;
            }
        }

        System.out.println("명언(기존) : " + s.getComment());
        System.out.print("명언 : ");
        String commant = scanner.nextLine();

        System.out.println("작가(기존) : " + s.getAuthor());
        System.out.print("작가 : ");
        String author = scanner.nextLine();

        s.setComment(commant);
        s.setAuthor(author);
        System.out.println(s.getId() + "번 목록이 수정되었습니다.");
    }
    
    public void sample() {
        register("가나","다라");
        register("간난","단란");
    }
}
