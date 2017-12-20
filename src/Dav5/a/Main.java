package Dav5.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
	public static void main(String[] args)
	{
		List<Integer> cifrebi = new ArrayList<>();
        List<String> asoebi = new ArrayList<>();

        Map<Integer, String> combo = new HashMap<>();

        for (int i = 0; i < 10; i++)
        {//generate random input
            cifrebi.add((int)(((Math.random() * 10))));
            asoebi.add(cifrebi.get(i).toString());
        }

        for (Integer i: cifrebi)
        {//put values in combo
            combo.put(i, asoebi.get(cifrebi.indexOf(i)));
        }

        for (Map.Entry<Integer, String> pair: combo.entrySet())
        {//print result
           System.out.println(pair.getKey().toString() + " " + pair.getValue().toString());
        }
    }
}
