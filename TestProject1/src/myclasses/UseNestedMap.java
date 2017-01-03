package myclasses;

import java.util.*;

/**
 * Created by aleks_000 on 12/10/2016.
 */
public class UseNestedMap {

    public static void main(String[] args) {

        List<String> citiesOfUSA = new ArrayList<String>();
        citiesOfUSA.add("NY");
        citiesOfUSA.add("CA");
        citiesOfUSA.add("PortlandS OR");
        citiesOfUSA.add("LA");

        List<String> citiesOfCanada = new ArrayList<String>();
        citiesOfCanada.add("Toronto");
        citiesOfCanada.add("Vancouver");
        citiesOfCanada.add("Ottawa");

        List<String> citiesOfUK = new ArrayList<String>();
        citiesOfUK.add("London");
        citiesOfUK.add("Manchester");
        citiesOfUK.add("Bristol");
        citiesOfUK.add("Oxford");
        citiesOfUK.add("Cambridge");
        citiesOfUK.add("Liverpool");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", citiesOfUSA);
        map.put("Canada", citiesOfCanada);
        map.put("UK", citiesOfUK);

        for(Map.Entry city: map.entrySet()){
            System.out.println(city.getKey()+ " " + city.getValue());
        }






    }
}
