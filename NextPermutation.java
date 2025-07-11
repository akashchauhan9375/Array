
/*
 LEETCODE -- 31
 THIS QUESTION IS SIMILIAR TO FINDING OUT THE JUST NEXT GREATER ELEMENT USING THE GIVEN ARRAY
 BUT HERE IT IS NAMED AS NEXT PERMUTATION
 APPROACH -- WE WILL TRAVESE THE ARRAY FROM END AND FIND A  BREAKAGE POINT(INDEX) WHERE THE ith element 
 IS SMALLER THAN i+1 ELEMENT AND NEXT WE WILL FIND THE INDEX STARTING FROM END SUCH THAT IT SHOULD 
 BE JUST GREATER THAN ith ELEMENT.NOW SWAP THESE TWO AND REVERSE THE ARRAY AS REMAINING ARRAY WILL 
 BE IN THE DESCENDING ORDER SO IN ORDER TO MAKE THE JUST GREATER ELEMENT WE HAVE TO EITHER REVERSE IT 
 OR SORT IT...............
 */

class NextPermutation{
    public static void Next(int nums[]){
        int i=nums.length-2;
        while(i>=0 && nums[i]<nums[i+1]){
            i--;
        }
        

        if(i>=0){
        int j=nums.length-1;
        while(i>=0 && nums[j]<nums[i]){
            j--;
        }

        swap(nums,i,j);
    }
    reverse(nums,i+1);
    }

    public static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public void reverse(int nums,int start){
        int end = nums.length-1;
        while(start<=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}