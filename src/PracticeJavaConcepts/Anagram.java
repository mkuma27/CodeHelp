package PracticeJavaConcepts;

import java.util.HashMap;
import java.util.Map;

class Anagram{


    public static boolean anagram(String s1,String s2){

        Map<Character,Integer> map1=new HashMap<Character,Integer>();
        Map<Character,Integer> map2=new HashMap<Character,Integer>();

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }

        }

        for(int j=0;j<s2.length();j++){
            char ch1=s2.charAt(j);

            if(map2.containsKey(ch1)){
                map2.put(ch1,map2.get(ch1)+1);
            }
            else{
                map2.put(ch1,1);
            }

        }

        boolean ans=map1.equals(map2);
        return ans;

    }
    public static void main(String[] args){
        boolean answer=anagram("angel","glean");
        System.out.println(answer);

    }
}