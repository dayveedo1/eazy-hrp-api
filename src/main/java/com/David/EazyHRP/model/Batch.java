package com.David.EazyHRP.model;

import org.hibernate.id.GUIDGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Batch")
public class Batch implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Oid")
    public Long oId;

    @Column(name = "BatchNo")
    public String batchNo;

    @Column(name = "Year")
    public String year;

    @Column(name = "Month")
    public String month;

    @Column(name = "ProcessingType")
    public Integer processingType;

    @Column(name = "Status")
    public Integer status;

    @Column(name = "Description")
    public String description;

    @Column(name = "ProcessingDate")
    public String processingDate;

    @Column(name = "CreatedOn")
    public Date createdOn;

    @Column(name = "CreatedBy")
    public String createdBy;

    @Column(name = "ModifiedOn")
    public Date modifiedOn;

    @Column(name = "ModifiedBy")
    public String modifiedBy;

    @Column(name = "OptimisticLocked")
    public Integer optimisticLocked;

    @Column(name = "GCRecord")
    public Integer gcRecord;

    public Batch() {
    }

    public Long getOid() {
        return oId;
    }

    public void setOid(Long oid) {
        oId = oid;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getProcessingType() {
        return processingType;
    }

    public void setProcessingType(Integer processingType) {
        this.processingType = processingType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProcessingDate() {
        return processingDate;
    }

    public void setProcessingDate(String processingDate) {
        this.processingDate = processingDate;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getOptimisticLocked() {
        return optimisticLocked;
    }

    public void setOptimisticLocked(Integer optimisticLocked) {
        this.optimisticLocked = optimisticLocked;
    }

    public Integer getGcRecord() {
        return gcRecord;
    }

    public void setGcRecord(Integer gcRecord) {
        this.gcRecord = gcRecord;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "oId=" + oId +
                ", batchNo='" + batchNo + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", processingType=" + processingType +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", processingDate='" + processingDate + '\'' +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", optimisticLocked=" + optimisticLocked +
                ", gcRecord=" + gcRecord +
                '}';
    }
}
