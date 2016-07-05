package org.metroflow.core.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zoupeng on 16/7/5.
 */
public class ProcessDefinition {
    private Integer id;
    private String name;
    private Activity initial;
    private Map<Activity,List<Activity>> initialActivityStacks = new HashMap<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity getInitial() {
        return initial;
    }

    public void setInitial(Activity initial) {
        this.initial = initial;
    }

    public Map<Activity, List<Activity>> getInitialActivityStacks() {
        return initialActivityStacks;
    }

    public void setInitialActivityStacks(Map<Activity, List<Activity>> initialActivityStacks) {
        this.initialActivityStacks = initialActivityStacks;
    }
}
