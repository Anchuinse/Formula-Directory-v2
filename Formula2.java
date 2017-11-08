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

    public JPanel formulaPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));

        JPanel top_panel = new JPanel();                            //top panel with info and keywords
        top_panel.setLayout(new GridLayout(1,2));
        JPanel info = new JPanel();
        info.setLayout(new GridLayout(6,1));
        info.add(new JLabel(name + "-" + code));
        info.add(new JLabel("Reliability: " + reliability));
        info.add(new JLabel("Originality: " + originality));
        info.add(new JLabel("Power: " + power));
        info.add(new JLabel("Deviation: " + deviation));
        info.add(new JLabel("Price: " + price));
        top_panel.add(info);
        JTextArea area = new JTextArea(keywords);
        area.setLineWrap(true);
        top_panel.add(area);

        JPanel mid_panel = new JPanel();                            //mid panel with the description(s)
        JTextArea text = new JTextArea(description);
        text.setLineWrap(true);
        mid_panel.add(text);

        JPanel bot_panel = new JPanel();                            //bot panel with the example subjects

        panel.add(top_panel);
        panel.add(mid_panel);
        panel.add(bot_panel);
        return panel;
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