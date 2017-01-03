package myclasses;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by aleks_000 on 12/10/2016.
 */
public class UseMap {

    public static void main(String[] args) {

        Map<String, String> list = new LinkedHashMap<String, String>();
        list.put("USA","NY");
        list.put("Canada", "Toronto");
        list.put("Russia", "Moscow");
        list.put("UK","London");
        list.put("Germany", "Berlin");
        list.put("Japan", "Tokyo");
        list.put("France", "Paris");

        for (Map.Entry map : list.entrySet() ){

            System.out.println(map.getKey() + " " + map.getValue() );
        }
    }
}
