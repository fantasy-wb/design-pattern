package com.study.designpattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类 存储值
 */
public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable variable, Integer value) {
        map.put(variable, value);
    }

    public Integer getValue(Variable variable) {
        return map.get(variable);
    }
}
