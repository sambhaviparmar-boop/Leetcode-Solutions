class Solution {
    public int[] findErrorNums(int[] nums) {
        int next = 0;
        int repeat = 0;
        for (int i = 0; i < nums.length - 1; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
            repeat = nums[i];
        }
    }
}

for (int i = 1; i <= nums.length; i++) {
    boolean found = false;

    for (int j = 0; j < nums.length; j++) {
        if (nums[j] == i) {
            found = true;
            break;
        }
    }

    if (!found) {
        next = i;
    }
}
        return  new int[]{repeat, next};
    }
}