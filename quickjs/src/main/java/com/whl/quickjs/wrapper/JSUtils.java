package com.whl.quickjs.wrapper;

import java.util.List;
import java.util.Map;

public class JSUtils<T> {

    public JSArray toArray(QuickJSContext ctx, List<T> items) {
        JSArray array = ctx.createJSArray();
        if (items == null || items.isEmpty()) return array;
        for (int i = 0; i < items.size(); i++) array.push(items.get(i));
        return array;
    }

    public JSArray toArray(QuickJSContext ctx, T[] arrays) {
        JSArray array = ctx.createJSArray();
        if (arrays == null || arrays.length == 0) return array;
        for (T t : arrays) {

            array.push(t);
        }
        return array;
    }

    public JSObject toObj(QuickJSContext ctx, Map<String, T> map) {
        JSObject obj = ctx.createJSObject();
        if (map == null || map.isEmpty()) return obj;
        for (String s : map.keySet()) {
            obj.set(s, map.get(s));
        }
        return obj;
    }

}
