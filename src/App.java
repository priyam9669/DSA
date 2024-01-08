import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import TopkFrequentElements;

public class App {
    //static List<String> reult_array;
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, Priyam!");
        // System.out.println("hi");
        String phone_number= "23";

         

        Map<Integer,String> hm=new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        //String[] split={};
        List<String> split,split_m;
         String[] main_loop=phone_number.split("");
         //for(int i=0;i<main_loop.length;i++){
            //split[i]=
            //for(int k=0; k<main_loop.length;k++){
                //split = Arrays.asList(hm.get(main_loop[1]).split(""));
                //System.out.println(split);
                // for (int j=0; j<split.size();j++){
                //     for(int m=0;m<main_loop.length;m++){
                //        //if(i!=m){
                //             split_m=Arrays.asList(phone_map[m].split(""));
                //             for (int n=0; n<split.size();n++){
                //                 //App.reult_array= create_array(App.reult_array,split[j]+split_m[n]);
                //                 System.out.println(split.get(j)+split_m.get(n));
                //            }
                //         //}
                //     //split[j]+
                //     }
                // }
                //}
            for (int i=0; i<main_loop.length; i++){
                System.out.println(String.valueOf(main_loop[i]));
                System.out.println(hm.get(String.valueOf(main_loop[i])));
                split = Arrays.asList(hm.get(main_loop[i]).split(""));
                System.out.println(split);
            }
         }

        //  String[] split;
        //  for (int i=0 ; i < phone_map.length; i++){
        //      split=phone_map[i].split("");
        //      //System.out.println(phone_map[i]);
        //      for (int j= 0; j< split.length; j++){
                
        //         String[] number = phone_number.split("");
        //         for (String a : number)
        //         App.reult_array= create_array(App.reult_array,a+split[i]);
        //      }
        //  }

    }

    // public static String[] create_array(String arra[],String element){
    //     String[] return_array= new String[arra.length + 1];
    //     for(int i=0;i<arra.length;i++){
    //         return_array[i] = arra[i];
    //     }
    //      return_array[arra.length]=element;

    //     return return_array; 
    // }

