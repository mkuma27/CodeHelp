package NaveenCollections.HashMapConcepts;
/*
HashMap extends Abstract Map and implement Map interfaces
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args){

        //no order-no indexing
        //stores values -- Key-Value <k,v>
        //key cannot be duplicated
        //As much as null values can be there but only 1 null key is allowed
        //Hash Map is unsynchronised  meaning it is not Thread Safe but Hash Table is Thread safe

        HashMap<String,String> capitalMap=new HashMap<String,String>();
        capitalMap.put("India","New Delhi");
        capitalMap.put("USA","Washinton DC");
        capitalMap.put("UK","London");
        capitalMap.put(null,"berlin");
        capitalMap.put("France",null);
        capitalMap.put("Australia","Australia");
        capitalMap.put("uganda",null);


        System.out.println(capitalMap.get("uganda"));
        System.out.println(capitalMap.get(null));

        System.out.println("-----------------");


        //Iteration of Arrays

        //1st method

        Iterator<String> it= capitalMap.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            String value=capitalMap.get(key);
            System.out.println("Key is "+key + " Value is "+ value);
        }
        System.out.println("-------------------------------");

       // 2nd method Using entry Set

     Iterator<Map.Entry<String,String>> it1=   capitalMap.entrySet().iterator();
        while(it1.hasNext()) {
            Map.Entry<String, String> capital = it1.next();
            String key1 = capital.getKey();
            String value1 = capital.getValue();
            System.out.println("Key is " + key1 + " Value is " + value1);
        }

        System.out.println("---------------------------");

            //3rd method using Java 8
            capitalMap.forEach((k,v)-> System.out.println("Key is "+ k +" Value is"+v));
        }
    }
