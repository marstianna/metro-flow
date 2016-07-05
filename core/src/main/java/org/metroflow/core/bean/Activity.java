package org.metroflow.core.bean;

import org.metroflow.core.ActivityBehavior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zoupeng on 16/7/5.
 */
public class Activity {
    private Integer id;
    private String name;
    private Integer isSync;
    private List<Transition> outgoing = new ArrayList<>();
    private Map<String,Transition> namedOutgoing = new HashMap<>();
    private ActivityBehavior activityBehavior;
    private Integer retryTimes;
    private Integer order;

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

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public List<Transition> getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(List<Transition> outgoing) {
        this.outgoing = outgoing;
    }

    public Map<String, Transition> getNamedOutgoing() {
        return namedOutgoing;
    }

    public void setNamedOutgoing(Map<String, Transition> namedOutgoing) {
        this.namedOutgoing = namedOutgoing;
    }

    public ActivityBehavior getActivityBehavior() {
        return activityBehavior;
    }

    public void setActivityBehavior(ActivityBehavior activityBehavior) {
        this.activityBehavior = activityBehavior;
    }

    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
