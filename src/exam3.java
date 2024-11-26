public class exam3 {

    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립(이)가 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.
    }
}

class 전사 {

    private String jobName;
    private String weaponeName;

    public void 공격(String job , String weapon) {
        jobName = job;
        weaponeName = weapon;
        System.out.println(job + "(이)가 " + weapon + "(으)로 공격합니다.");
    }

    public void 재공격() {
        공격(jobName,weaponeName);
    }
}