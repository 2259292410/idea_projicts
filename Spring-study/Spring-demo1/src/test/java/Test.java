public class Test {

    /*
    * 给定一个整数数组 nums 和一个整数目标值 target，
    * 请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
        你可以假设每种输入只会对应一个答案。但是，
        * 数组中同一个元素在答案里不能重复出现。
        你可以按任意顺序返回答案。
    * */
    @org.junit.Test
    public void t1() {
        int[] arr =new int[]{2,7,11,15};
        int[] arr2 = twoSum(arr, 9);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
       if(nums==null || nums.length==0) {
           return new int[0];
       }
        for (int i = 0; i < nums.length ; ++i) {
            for (int j = i+1; j < nums.length ; ++j) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];
    }

}
