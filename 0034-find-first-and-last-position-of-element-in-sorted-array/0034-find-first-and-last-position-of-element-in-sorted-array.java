class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] arr = new int[2];
    int s = 0;
    int e = nums.length-1;
    int firstPos = -1;
    int lastPos = -1;

//left
    while(s <= e){
        int mid = s + (e-s)/2;

        if(nums[mid] == target){
            firstPos = mid;
            e = mid-1;
        }
        else if (nums[mid] < target){
            s = mid+1;
        }
        else if(nums[mid] > target){
            e = mid-1;
        }
    }

//right
     s = 0;
     e = nums.length-1 ;
     while(s <= e){
        int mid = s + (e-s)/2;

        if(nums[mid] == target){
            lastPos = mid;
            s = mid+1;
        }
        else if (nums[mid] < target){
            s = mid+1;
        }
        else if(nums[mid] > target){
            e = mid-1;
        }
    }
     arr[0] = firstPos;
     arr[1] = lastPos;

     return arr;
}
}