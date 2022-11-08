package kimjr;

public class Practice3 {
    public static int solution(int[] height) {
       int left = 0;//좌측벽
       int right = height.length -1;//우측벽
       int maxArea = 0;//최대값
    
    while (right > left) {
    	int x = (right - left);
    	int y = height[left]< height[right]? height[left]: height[right];
    	int cureArea = x*y;
    	maxArea = maxArea>cureArea?maxArea:cureArea;//최대값을 구할 때 최대가 현재보다 크면 최대 작으면 현재
 
    cureArea =x *Math.min(height[left], height);//더 작은 값 뽑기
    maxArea=Math.max(maxArea, cureArea);//최대값 뽑기
    	if(height[left]<height[right]) {
    		left++;
    	}
    	else {
    		right--;
    	}
    }
    return maxArea;
    }
    

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}