package LeetCode;

public class One {
    public static void main(String[] args) {
        int target = 9;
        int [] nums = {2, 7, 11, 15};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i == j){
                    continue;
                }else if(nums[i] + nums[j] == target){
                    //return new int[]{i, j};
                }

            }
        }

    }
}
