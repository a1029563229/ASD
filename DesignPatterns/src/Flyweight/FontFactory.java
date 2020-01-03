package Flyweight;

import java.util.HashMap;

class Font {
    private String key;
    public Font(String key) {
        this.key = key;
    }
}

public class FontFactory {
    private HashMap<String, Font> fontPool;
    public Font GetFont(String key) {
        Font font = fontPool.get(key);
        if (font != null) {
            return font;
        }

        font = new Font(key);
        fontPool.put(key, font);
        return font;
    }
}
