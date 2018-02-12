/**
 * Created by Matt on 10/22/17.
 */
import com.sun.org.apache.bcel.internal.generic.F2D;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.Normalizer;
import javax.swing.*;
import java.util.*;
public class Formula2 implements Comparable<Formula2>
{
    String name, code;
    int reliability, originality, power, deviation, price;
    String keywords;
    String description;

    public Formula2(String NAME, String CODE, int RE, int OR, int POWER, int DEV, int PRICE, String DES,
                   String KEYS)
    {
        name = NAME;
        code = CODE;
        reliability = RE;
        originality = OR;
        power = POWER;
        deviation = DEV;
        price = PRICE;
        keywords = sortKeywords(KEYS);
        description = DES;

    }

    public String getName() {return name;}

    public String getCode() {return code;}

    public int getReliability() {return reliability;}

    public int getOriginality() {return originality;}

    public int getPower() {return power;}

    public int getDeviation() {return deviation;}

    public int getPrice() {return price;}

    public String getDescription() {return description;}

    public String getKeywords() {return keywords;}

    public String sortKeywords(String keys)
    {
        String our_return = "";
        String[] s = keys.split(", ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
        Collections.sort(list);
        int x;
        for (int i = 0; i < list.size(); ++i)
        {
            x=0;
            our_return = our_return + list.get(i);
            while (i < list.size()-1 && x == 0)
            {
                our_return = our_return + ", ";
                x = 1;
            }
        }
        return our_return;
    }

    @Override
    public int compareTo(Formula2 o) {
        return code.compareTo(o.code);
    }


    public static void main(String[] args)
    {
        Formula2 form = new Formula2("", "", 3, 4, 2, 1, 3, ",", "safe, common, fire");
    }
}