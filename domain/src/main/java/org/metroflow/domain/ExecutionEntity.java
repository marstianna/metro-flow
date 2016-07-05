package org.metroflow.domain;

/**
 * Created by zoupeng on 16/7/5.
 */
public class ExecutionEntity {
    private String id;
    private String parentId;
    private String processDefKey;
    private String currentActivityName;
    private Integer isSync;
    private Integer isActive;
    private String businessKey;
    private Long createTime;
    private Long modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessDefKey() {
        return processDefKey;
    }

    public void setProcessDefKey(String processDefKey) {
        this.processDefKey = processDefKey;
    }

    public String getCurrentActivityName() {
        return currentActivityName;
    }

    public void setCurrentActivityName(String currentActivityName) {
        this.currentActivityName = currentActivityName;
    }

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
