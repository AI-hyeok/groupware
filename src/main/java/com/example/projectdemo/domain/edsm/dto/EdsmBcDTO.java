package com.example.projectdemo.domain.edsm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EdsmBcDTO {



    private int id;
    private int edsmFormId;
    private String title;
    private String content;
    private String retentionPeriod;
    private String securityGrade;
    private int drafterId;
    private Timestamp drafterDate;//current_timestamp
    private Timestamp approvalDate;//null
    private String status;//enum

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdsmFormId() {
        return edsmFormId;
    }

    public void setEdsmFormId(int edsmFormId) {
        this.edsmFormId = edsmFormId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRetentionPeriod() {
        return retentionPeriod;
    }

    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public String getSecurityGrade() {
        return securityGrade;
    }

    public void setSecurityGrade(String securityGrade) {
        this.securityGrade = securityGrade;
    }

    public int getDrafterId() {
        return drafterId;
    }

    public void setDrafterId(int drafterId) {
        this.drafterId = drafterId;
    }

    public Timestamp getDrafterDate() {
        return drafterDate;
    }

    public void setDrafterDate(Timestamp drafterDate) {
        this.drafterDate = drafterDate;
    }

    public Timestamp getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
