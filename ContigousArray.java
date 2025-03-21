
/*
LEETCODE --> 525
IN THIS QUESTION WE HAVE FIND THE SUBARRAY SUCH THAT IT HAS EQUAL NUMBERS OF 0 AND 1 ONLY...

APPROACH --> BRUTE FORCE APPROACH 
IN THIS APPROACH WE WILL ITERATE THROUGH THE ARRAY WITH TWO POINTERS I AND J AND KEEP ADDING THE ELEMENTS
IF 0 IS ENCOUNTERED WE WILL ADD -1 AND IF THE SUM BECOMES 0 (IF THERE ARE EQUAL NO OF 1 AND 0 SUM WILL BE 0)
WE WILL UPDATE THE VALUE OF COUNT

 */

/* 
class ContigousArray{
    public static int Count(int arr[]){
        int count = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(arr[j] == 0){
                    sum += -1;
                }
                
               if(sum==0){
                count = Math.max(count,j-i+1);
               }
               

            }
        }
        return count;
    }

    public static void main(String st[]){
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(Count(arr));
    }
}
    */

    
//********************************************OPTIMAL APPROACH****************************************

import java.util.Map;

class ContigousArray{
    public static int Find(int arr[]){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int length = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        for(int j=0;j<n;j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                length = Math.max(length,j);
            }
            else{
                map.put(sum, length);
            }
        }
        return length;
    }
}
 