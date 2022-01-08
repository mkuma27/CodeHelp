package NaveenCollections.HashMapConcepts;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
    // There are three ways through which we can compare Hash Map
    // 1st is based on Key Value pair
    //2nd is based on Keys
    //3rd is based on Values

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();

        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "D");
        map3.put(3, "C");

        //Compare based on key Values
        System.out.println(map1.equals(map2)); //true
        System.out.println(map1.equals(map3)); //true


        //Compare based on key Set
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));


        //compare based on values where duplicates are allowed

        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));


        //Find extraKeys



        HashMap<Integer, String> map4 = new HashMap<Integer, String>();

        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");

        HashMap<Integer, String> map5 = new HashMap<Integer, String>();

        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");

        HashMap<Integer, String> map6 = new HashMap<Integer, String>();

        map6.put(1, "A");
        map6.put(2, "B");
        map6.put(3, "D");
        map6.put(4, "D");

        HashSet<Integer> set1=new HashSet<>(map4.keySet());
        set1.addAll(map6.keySet());
        set1.removeAll(map1.keySet());

        System.out.println(set1);




      //  System.out.println(map1.values().equals(map2.values()));



    }

}

