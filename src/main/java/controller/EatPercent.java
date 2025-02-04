package controller;

import java.util.Map;

public class EatPercent {
    public final static Map<String, Integer> CONSTANT_MAP = createConstantMap();


    private static Map<String, Integer> createConstantMap() {

        return Map.<String, Integer>ofEntries(
                Map.entry("Wolf-Wolf", 0),
                Map.entry("Wolf-Boa", 0),
                Map.entry("Wolf-Fox", 0),
                Map.entry("Wolf-Bear", 0),
                Map.entry("Wolf-Eagle", 0),
                Map.entry("Wolf-Horse", 10),
                Map.entry("Wolf-Deer", 15),
                Map.entry("Wolf-Rabbit", 60),
                Map.entry("Wolf-Mouse", 80),
                Map.entry("Wolf-Goat", 60),
                Map.entry("Wolf-Sheep", 70),
                Map.entry("Wolf-Hog", 15),
                Map.entry("Wolf-Buffalo", 10),
                Map.entry("Wolf-Duck", 40),
                Map.entry("Wolf-Caterpillar", 0),

                //0 0 15 0 0 0 0 20 40 0 0 0 0 10 0	0
                Map.entry("Boa-Wolf", 0),
                Map.entry("Boa-Boa", 0),
                Map.entry("Boa-Fox", 15), Map.entry("Boa-Bear", 0), Map.entry("Boa-Eagle", 0), Map.entry("Boa-Horse", 0), Map.entry("Boa-Deer", 0), Map.entry("Boa-Rabbit", 20), Map.entry("Boa-Mouse", 40), Map.entry("Boa-Goat", 0), Map.entry("Boa-Sheep", 0), Map.entry("Boa-Hog", 0), Map.entry("Boa-Buffalo", 0), Map.entry("Boa-Duck", 10), Map.entry("Boa-Caterpillar", 0),

                //0 0 0 0 0 0 0	70 90 0 0 0 0 60 40	0
                Map.entry("Fox-Wolf", 0), Map.entry("Fox-Boa", 0), Map.entry("Fox-Fox", 0), Map.entry("Fox-Bear", 0), Map.entry("Fox-Eagle", 0), Map.entry("Fox-Horse", 0), Map.entry("Fox-Deer", 0), Map.entry("Fox-Rabbit", 70), Map.entry("Fox-Mouse", 90), Map.entry("Fox-Goat", 0), Map.entry("Fox-Sheep", 0), Map.entry("Fox-Hog", 0), Map.entry("Fox-Buffalo", 0), Map.entry("Fox-Duck", 60), Map.entry("Fox-Caterpillar", 40),

                //0 80 0 0 0 40 80 80 90 70 70 50 20 10 0 0
                Map.entry("Bear-Wolf", 0), Map.entry("Bear-Boa", 80), Map.entry("Bear-Fox", 0), Map.entry("Bear-Bear", 0), Map.entry("Bear-Eagle", 0), Map.entry("Bear-Horse", 40), Map.entry("Bear-Deer", 80), Map.entry("Bear-Rabbit", 80), Map.entry("Bear-Mouse", 90), Map.entry("Bear-Goat", 70), Map.entry("Bear-Sheep", 70), Map.entry("Bear-Hog", 50), Map.entry("Bear-Buffalo", 20), Map.entry("Bear-Duck", 10), Map.entry("Bear-Caterpillar", 0),

                //0	0	10	0	0	0	0	90	90	0	0	0	0	80	0	0
                Map.entry("Eagle-Wolf", 0), Map.entry("Eagle-Boa", 0), Map.entry("Eagle-Fox", 10), Map.entry("Eagle-Bear", 0), Map.entry("Eagle-Eagle", 0), Map.entry("Eagle-Horse", 0), Map.entry("Eagle-Deer", 0), Map.entry("Eagle-Rabbit", 90), Map.entry("Eagle-Mouse", 90), Map.entry("Eagle-Goat", 0),
                Map.entry("Eagle-Sheep", 0), Map.entry("Eagle-Hog", 0), Map.entry("Eagle-Buffalo", 0),
                Map.entry("Eagle-Duck", 80),
                Map.entry("Eagle-Caterpillar", 0),

                //0	0	0	0	0	0	0	0	0	0	0	0	0	0	90	100
                Map.entry("Duck-Wolf", 0),
                Map.entry("Duck-Boa", 0),
                Map.entry("Duck-Fox", 0),
                Map.entry("Duck-Bear", 0),
                Map.entry("Duck-Eagle", 0),
                Map.entry("Duck-Horse", 0),
                Map.entry("Duck-Deer", 0),
                Map.entry("Duck-Rabbit", 0),
                Map.entry("Duck-Mouse", 0),
                Map.entry("Duck-Goat", 0),
                Map.entry("Duck-Sheep", 0),
                Map.entry("Duck-Hog", 0),
                Map.entry("Duck-Buffalo", 0),
                Map.entry("Duck-Duck", 0),
                Map.entry("Duck-Caterpillar", 90)


        );
 }
}
