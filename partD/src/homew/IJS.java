package homew;

import java.util.*;

public class IJS {

    public static void main(String[] args) {
        playNumberRannumGame();
    }

    public static void playNumberRannumGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(50) + 1; // 1~50 사이의 숫자
        int maxTries = 5;
        int count = 0;
        boolean success = false;
        List<Integer> inputs = new ArrayList<>();

        System.out.println("[[[[[ 숫자게임을 시작합니다. ]]]]]");
        System.out.println("- 너 휴먼은 맞춰보세요.(숫자는 1부터 50 안에서 정하세요.) -");

        System.out.print("참가자 닉네임 (종료:end) >>> ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("end")) {
            System.out.println("::프로그램 종료::");
            return;
        }

        do {
            System.out.print("너 휴먼 생각한 숫자 입력 (남은 기회 : " + (maxTries - count) + ") >>> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("::프로그램 종료::");
                return;
            }

            int Rannum;
            try {
                Rannum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요!");
                continue;
            }

            inputs.add(Rannum);
            count++;

            if (Rannum == target) {
                System.out.println("딩동댕!! 정답입니다.");
                success = true;
                break;
            } else {
                System.out.println("아닙니다. 다른 값입니다.");
            }

        } while (count < maxTries);

        System.out.println("▶ 입력한 숫자 : " + inputs);
        System.out.println("숫자 맞추기 결과는?");
        if (success) {
            System.out.println("성공!! " + count + "회 시도 후 성공~");
        } else {
            System.out.println("실패!! 모든 기회를 다 쓰셨습니다. 게임을 다시 시작하세요!!");
            System.out.println("정답 : " + target);
        }

        GameValue gv = new GameValue(name, count, success);
        gv.printResult();
    }
}

class GameValue {
    String gamer;
    int tryCount;
    boolean isSuccess;

    public GameValue(String gamer, int tryCount, boolean isSuccess) {
        this.gamer = gamer;
        this.tryCount = tryCount;
        this.isSuccess = isSuccess;
    }

    public void printResult() {
        System.out.println("GameValue 객체 확인");
        System.out.println("gamer : " + gamer + ", 시도횟수 : " + tryCount + ", 성공여부 : " + isSuccess);
        if (!isSuccess) {
            System.out.println("오류. 404 not found.");
        }
    }
}