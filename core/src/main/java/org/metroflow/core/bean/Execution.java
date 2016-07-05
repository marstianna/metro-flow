package org.metroflow.core.bean;

import org.apache.commons.lang3.tuple.Pair;
import org.metroflow.commons.utils.enums.ExecutionStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zoupeng on 16/7/5.
 */
public class Execution {
    private String id;
    //是否激活
    private Integer active = 1;
    private Execution parent;
    private String activityName;
    private Long orderId;
    private Integer isSync;
    private ProcessDefinition processDefinition;
    private String processDefinitionKey;
    private Activity activity;
    private Transition transition;
    private ExecutionStatus status;
    private Map<String,Pair<Object,Boolean>> variables = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Execution getParent() {
        return parent;
    }

    public void setParent(Execution parent) {
        this.parent = parent;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public ProcessDefinition getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(ProcessDefinition processDefinition) {
        this.processDefinition = processDefinition;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    public Map<String, Pair<Object, Boolean>> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Pair<Object, Boolean>> variables) {
        this.variables = variables;
    }

    public ExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(ExecutionStatus status) {
        this.status = status;
    }
}
