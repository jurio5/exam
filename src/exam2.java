public class exam2 {

    public static void main(String[] args) {
        double d1 = 5;

        무기 a무기 = new 칼();
        칼 a칼 = new 칼();
        a칼 = new 활();

        a무기.공격();

    }
}

abstract class 무기 {

    abstract void 공격();
}

class 칼 extends 무기 {

    public void 공격() {
        System.out.println("칼로 공격합니다.");
    }

}

class 활 extends  칼 {

}
