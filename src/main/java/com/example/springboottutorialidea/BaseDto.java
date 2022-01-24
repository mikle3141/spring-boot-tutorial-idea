package com.example.springboottutorialidea;

import java.util.HashMap;
import java.util.Map;

public class BaseDto {
    protected Map<String, Object> attrs = new HashMap<>();
    public boolean hasAttr(String key) {
        return attrs.containsKey(key);
    }
}
