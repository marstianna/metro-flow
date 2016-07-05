package org.metroflow.domain;

/**
 * Created by zoupeng on 16/7/5.
 */
public class ProcessDefinitionEntity {
    private Integer id;
    private String processDefKey;
    private String processDetail;
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessDefKey() {
        return processDefKey;
    }

    public void setProcessDefKey(String processDefKey) {
        this.processDefKey = processDefKey;
    }

    public String getProcessDetail() {
        return processDetail;
    }

    public void setProcessDetail(String processDetail) {
        this.processDetail = processDetail;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
