//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class hash {
//    public static void main(String[] args) {
//
//
//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//        map.put(3, "apple");
//        map.put(1, "orange");
//        map.put(2, "banana");
//
//        List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
//
//        for (Map.Entry<Integer, String> entry : list) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}
