package org.metroflow.domain;

/**
 * Created by zoupeng on 16/7/5.
 */
public class HistoryEntity {
    private Integer id;
    private String businessKey;
    private String processDefKey;
    private String historyDetail;
    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getProcessDefKey() {
        return processDefKey;
    }

    public void setProcessDefKey(String processDefKey) {
        this.processDefKey = processDefKey;
    }

    public String getHistoryDetail() {
        return historyDetail;
    }

    public void setHistoryDetail(String historyDetail) {
        this.historyDetail = historyDetail;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
