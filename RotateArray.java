

/*
 LEETCODE -189 ROTATE ARRAY FROM RIGHT BY K 

 IN THIS QUESTION WE WILL JUST SIMPLY REVERSE THE ARRAY BY ANALYZING THE CHANGE AFTER ROTATING ARRAY
 KEY POINT --> "  k = k % n; " THIS HANDLES IF THE VALUE OF K IS LESS THAN N.... IF THE VALUE OF K 
 IS GRETAER THAN THE VALUE OF N THEN K TIMES ROTATION IS SAME AS K % N TIMES 
 FOR EX --> N = 5 AND K = 7... IN THIS CASE 7 TIMES ROTAION IS SAME AS THE ROTATING IT BY 2 TIMES 
 BEACUSE AFTER 5 TIMES OF ROTATION THE ARRAY WILL BE IN ITS ORIGINAL FORM...REMAINING 2 TIMES
 ROTATION WILL CHANGE IT 
 */
//*******************************************OVERALL TIME COMPLEXITY WILL BE O(N)******************* */

class RotateArray{
    public static void rotate(int arr[],int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

            
        }
    

    public static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}