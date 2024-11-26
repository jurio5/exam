
public class exam1 {

    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();

        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        a로봇오리.수영하다();
    }
}

class 오리 {

    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리 {

}

class  흰오리 extends  오리 {

}

class 고무오리 extends  오리 {

    public void 날다() {
        System.out.println("저는 날 수 없어요.");
    }

    public void 수영하다() {
        System.out.println("물갈퀴로 수영합니다.");
    }
}

class 고무2오리 extends 고무오리 {

}

class 로봇오리 extends  고무오리 {

}