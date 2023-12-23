import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();
        char[] temp;
        for(String n: strs){
            temp=n.toCharArray();
            Arrays.sort(temp);
            String keyStr = String.valueOf(temp);
            if(map.containsKey(keyStr)){
                map.get(keyStr).add(n);
            }else{
                map.put(keyStr, new ArrayList<>(List.of(n)));

            }
        }
        return new ArrayList<>(map.values());
    }
}
