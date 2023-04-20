import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lecture03Task {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>() {{
            add("日本");
            add("アメリカ");
            add("韓国");
        }};

        for (String countryName: countries){
            System.out.println(countryName);
        }

        Map<Integer, String> countryMap = new HashMap<>();
        countryMap.put(1, countries.get(0));
        countryMap.put(2, countries.get(1));
        countryMap.put(3, countries.get(2));

        int index = 3;

        try {
            if (index < 0 || index >= countries.size()){
                throw new IndexOutOfBoundsException();
            }
            countryMap.put(4, countries.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        }

        System.out.println(countryMap.values());
    }
}
