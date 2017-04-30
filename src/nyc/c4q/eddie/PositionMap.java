package nyc.c4q.eddie;

import java.util.LinkedHashMap;
import java.util.Map;

public class PositionMap {

    static String divider = " | ";
    static String[] rows = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};

    public static Map<String, String> pValue = new LinkedHashMap<String, String>() {
        {
            put("A1", null);
            put("B1", null);
            put("C1", null);
            put("A2", null);
            put("B2", null);
            put("C2", null);
            put("A3", null);
            put("B3", null);
            put("C3", null);
        }
    };

    public static void boardPrint() {

        /* Sort through Map & Arraylist;
        the keys that have a value are then added to the array list */
        for (int i = 0; i < rows.length; i++)
            for (String key : pValue.keySet()) {
                if (pValue.get(key) != null)
                    rows[i] = pValue.get(key);
                i++;
            }

        System.out.println("  A   B   C");
        System.out.println("1 " + rows[0] + divider + rows[1] + divider + rows[2]);
        System.out.println("2 " + rows[3] + divider + rows[4] + divider + rows[5]);
        System.out.println("3 " + rows[6] + divider + rows[7] + divider + rows[8] + "\n");

    }

}
