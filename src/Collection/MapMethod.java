package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod {

        public static void main(String[] args) {
            //Map create karna
            Map<String, String> map = new HashMap<>();
            // 👇 Values put karna
            map.put("name", "Amit");
            map.put("city", "Mumbai");
            map.put("role", "Developer");

            // 👇 Map print karna
            System.out.println("Map: " + map);

            // 👇 Kisi ek value ko get karna using key
            System.out.println("Name: " + map.get("name"));

            // 👇 Keys check karna
            System.out.println("Contains key 'city'? " + map.containsKey("city"));

            // 👇 Values check karna
            System.out.println("Contains value 'Delhi'? " + map.containsValue("Delhi"));

            // 👇 Map ki size
            System.out.println("Map size: " + map.size());

            // 👇 Remove karna ek entry
            map.remove("role");
            System.out.println("After remove: " + map);

            // 👇 putIfAbsent() – agar key nahi hai tabhi value dalega
            map.putIfAbsent("user2", "Sita"); // ❌ Ignore hoga, kyunki user2 already hai
            map.putIfAbsent("user3", "Sita"); // ✅ Insert hoga

            System.out.println("Map after putIfAbsent: " + map);

            // 👇 getOrDefault() – agar key nahi mile to default value return karo
            System.out.println("User4: " + map.getOrDefault("user4", "Unknown"));

            // 👇 replace() – kisi existing key ki value replace karta hai
            map.replace("user1", "Ankit");
            System.out.println("Map after replace: " + map);

            // 👇 replace(key, oldValue, newValue) – tabhi replace karega jab old value match ho
            boolean replaced = map.replace("user1", "Amit", "Nitin"); // ❌ won't replace
            System.out.println("Was replaced? " + replaced); // false

            // 👇 containsKey() and containsValue()
            System.out.println("Has key 'user2'? " + map.containsKey("user2"));
            System.out.println("Has value 'Sita'? " + map.containsValue("Sita"));

            // 👇 keySet() – saari keys return karta hai
            Set<String> keys = map.keySet();
            System.out.println("All keys: " + keys);

            // 👇 values() – saari values return karta hai
            Collection<String> values = map.values();
            System.out.println("All values: " + values);

            // 👇 clear() – puri map ko empty kar deta hai
            map.clear();
            System.out.println("After clear(): " + map.isEmpty()); // true

            // 👇 Loop through map
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }


}
