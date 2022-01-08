package NaveenCollections.HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DifferentMaps {


    //HashMap            ->Unsynchronized not a Thread Safe,Fast Performance Null keys and values are allowed JDK 1.5
    //HashTable          ->Synchronized Thread Safe, Poor Performance JDK 1.2, null keys and values are not allowed Lock is placed in complete Object
    //Synchronized Map   ->synchronized Thread Safe null keys and values are allowed, Poor Performance lock is placed in Complete Object
    // Concurrent HashMap->synchronized Thread Safe, null keys and values are not allowed lock is please not in entire Object but in a single segment

    public static void main(String args){

        Map<Integer,String> map1=new HashMap<Integer,String>();
        map1.put(1,"Mayank");
        map1.put(2,"Naman");

        //How to conver map into synchronized map

     Map<Integer,String> map2   =Collections.synchronizedMap(map1);

     //How to Create Concurrent HashMap
        Map<String,String> map3=new ConcurrentHashMap<>();
        map3.put(null,"Mayank");
    }
}
