import java.util.*;

class Subset{
    public List<List<Integer>> subset(int arr[]){
        List<List<Integer>> result = new LinkedList<>();
        result.add(new ArrayList<>()); // start with adding empty set..

        for(int num:arr){
            int n = result.size();
            for(int i=0;i<n;i++){
                List<Integer> temp = new LinkedList<>();
                temp.add(num);
                result.add(temp);
            }
        }

        return result;
    }
}