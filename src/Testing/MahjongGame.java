package Testing;

import java.util.HashMap;
import java.util.Map;

public class MahjongGame {

    public static boolean complete(String tiles) {
        Map<Character, Integer> tileCount = new HashMap<>();

        // Count the occurrences of each tile in the input string
        for (char tile : tiles.toCharArray()) {
            tileCount.put(tile, tileCount.getOrDefault(tile, 0) + 1);
        }

        int pairs = 0;
        int triples = 0;

        // Count the number of pairs and triples
        for (int count : tileCount.values()) {
            pairs += count / 2;
            triples += count / 3;
        }

        // Check if there is exactly one pair and the rest can be grouped into triples
        return pairs == 1 && (pairs + triples) * 2 == tiles.length();
    }

    public static void main(String[] args) {
        String tiles_1 = "88844";
        String tiles_2 = "99";
        String tiles_3 = "55555";
        String tiles_4 = "22333333";
        String tiles_5 = "73797439949499477339977777997394947947477993";
        String tiles_6 = "111333555";
        String tiles_7 = "42";
        String tiles_8 = "888";
        String tiles_9 = "100100000";
        String tiles_10 = "346664366";
        String tiles_11 = "8999998999898";
        String tiles_12 = "17610177";
        String tiles_13 = "600061166";
        String tiles_14 = "6996999";
        String tiles_15 = "03799449";
        String tiles_16 = "64444333355556";
        String tiles_17 = "7";

        System.out.println(complete(tiles_1));  // true
        System.out.println(complete(tiles_2));  // true
        System.out.println(complete(tiles_3));  // true
        System.out.println(complete(tiles_4));  // true
        System.out.println(complete(tiles_5));  // true
        System.out.println(complete(tiles_6));  // false
        System.out.println(complete(tiles_7));  // false
        System.out.println(complete(tiles_8));  // false
        System.out.println(complete(tiles_9));  // false
        System.out.println(complete(tiles_10)); // false
        System.out.println(complete(tiles_11)); // false
        System.out.println(complete(tiles_12)); // false
        System.out.println(complete(tiles_13)); // false
        System.out.println(complete(tiles_14)); // false
        System.out.println(complete(tiles_15)); // false
        System.out.println(complete(tiles_16)); // false
        System.out.println(complete(tiles_17)); // false
    }
}
