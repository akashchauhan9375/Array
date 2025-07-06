import java.util.HashMap;

class MostFreqElement{
    public static int Freq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxFreq = 0;
        int ans = -1;

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1); // this line has same meaning of below if-else.
            // if(map.containsKey(arr[i])){
            //     int val = map.get(arr[i]);
            //     val+=1;
            //     map.put(arr[i],val);
            // }
            // else{
            //     map.put(arr[i],1);
            // }

            if(map.get(arr[i])>maxFreq){
                maxFreq = map.get(arr[i]);
                ans = maxFreq;
            }
        }
        return ans;

    }
}