package kimjr;

public class keybord { 
	public static String solution(int[] keyLog) {
        final int BACK_SPACE = 8;
        final int SHIFT = 16;
        final int CAPS_LOCK = 20;
        final int SPACE_BAR = 32;
        final int KEY_LEFT = 37;
        final int KEY_RIGHT = 39;
        final int INSERT = 155;
        final int DELETE = 127;

        StringBuffer sb = new StringBuffer();//문자열의 빈번한 변경으로 사용

        int step = (int)('a' - 'A');//대소문자 변환 아스키코드 값으로

        int curSor = 0;
        int cmdIdx = 0;
        boolean isShift = false;//시프트 변수 눌렸는지
        boolean isCapsLock = false;//캡스락 변수
        boolean isInsert = false;//인서트 변수
        while (cmdIdx != keyLog.length) {//인덱스가 키로그에 도달할 때까지
            int cur = keyLog[cmdIdx];//키로그에 인덱스 값으로 첫번째 데이터 꺼내오기
            
            // backspace 는 이전과 동일
            if (cur == BACK_SPACE) {//백스페이스면
                if (curSor == 0) {//커서가 0일때
                    cmdIdx++;//인덱스 증가
                    continue;//점프
                }
                sb.delete(curSor - 1, curSor);//-1부터 현재꺼 까지 하나 삭제
                curSor = Math.max(0, curSor - 1);//커서 좌측이동
            } else if (cur == SHIFT) {  // shift 입력은 해당 변수 true 로 변경
                isShift = true;//시프트가 눌렸을때
            } else if (cur == CAPS_LOCK) {  // CapsLock 은 한 번 누르면 지속 (토글)
                isCapsLock = !isCapsLock;//캡스락은 토글이기에 기존값 반전
            } else if (cur == SPACE_BAR) {//스페이스일때
                inputData(sb, ' ', curSor, isInsert);// 공백 문자 입력 후 커서 증가
                curSor += 1;
            } else if (cur == KEY_LEFT) {//커서 좌측 이동
                curSor = Math.max(0, curSor - 1);
            } else if (cur == KEY_RIGHT) {//커서 우측 이동
                curSor = Math.min(sb.length(), curSor + 1);
            } else if (cur == INSERT) { // Insert 는 한 번 누르면 지속 (토글)
                isInsert = !isInsert;//인서트도 토글이기에 반전
            } else if (cur == DELETE) { // Delete 는 backspace 와 커서 부분 살짝 다름 그 자리에 해당하는 값을 지워준다
                if (curSor == sb.length()) {//커서가 길이 끝에 도착시에
                    cmdIdx++;//지울게 없으니 증가만 시키고 점프
                    continue;
                }
                sb.delete(curSor, curSor + 1);//그 외에는 해당 커서위치에 문자 삭제
            } else if (cur >= 97 && cur <= 122) { // 알파벳 입력 부분
                int data = cur;
                // CapLock 켜진 상태에서 Shift 누르면 다시 소문자
                if (isCapsLock && isShift) {
                    data = cur;
                } else if (isCapsLock || isShift) { // 둘 중 하나가 true 면 대문자로 변경
                    data -= step;
                }
                inputData(sb, (char)data, curSor, isInsert);//커서랑 인서틐 추가
                isShift = false;//눌리던 안눌리던false 일회성이기에
                curSor += 1;//커서는 데이터 추가함으로 하나 증가
            } else if (cur >= 48 && cur <= 57) {//숫자가 들어 왔을경우
                if (isShift) {
                    // 각 숫자에 대응하는 특수문자 배열 (인덱스 0 부터 시작 -> ')')
                    char[] specialKey = {')', '!', '@', '#', '$', '%', '^', '&', '*', '('};
                    inputData(sb, specialKey[cur - '0'], curSor, isInsert);//specialKey[cur - '0']을 하면 0 1 2 3 4...로 변환
                } else {
                    inputData(sb, (char)cur, curSor, isInsert);//숫자가 들어감
                }
                isShift = false;//일회성
                curSor += 1;//커서 증가
            }

            cmdIdx++;//반복문 돌 때 마다 인덱스 증가
        }

        return sb.toString();//버퍼스트링 사용으로 반환
    }

    public static void inputData(StringBuffer sb, char data, int curSor, boolean isInsert) {
        // Insert 가 false 면 해당 위치에 삽입 true 면 해당 위치 변경
        if (isInsert == false) {//인서트가 활성화 안됐을 때
            sb.insert(curSor, data);//커서위치에 데이터
        } else {
            sb.setCharAt(curSor, data);//해당 위치값을 데이터로 바꾸기
        }
    }


    public static void main(String[] args) {
        // Test code
        int[] keyLog = {16, 106, 101, 108, 108, 111, 37, 37, 37, 37, 37, 155, 16, 104};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 104, 16, 105, 32, 20, 16, 106, 97, 118, 97};
        System.out.println(solution(keyLog));

        keyLog = new int[]{49, 51, 8, 50, 51, 53, 55, 37, 37, 127, 127, 52, 53};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 97, 98, 16, 99, 16, 100, 16, 49, 16, 50, 16, 51};
        System.out.println(solution(keyLog));
    }
}