package kimjr;
import java.util.ArrayList;

public class arrayPractice {
    public static ArrayList<Integer> solution(int[] nums) {
    	ArrayList<Integer> list = new ArrayList<>();
    	for (int i = 0; i < nums.length; i++) {
    		int index = Math.abs(nums[i])-1;//절대값으로
    		
    		if(nums[index]<0)
    		{
    			list.add(Math.abs(index+1));
    		}
    		nums[index] = -nums[index];
		}
        return list;//두번 등장하는 데이터 모아서 리턴
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }
}
