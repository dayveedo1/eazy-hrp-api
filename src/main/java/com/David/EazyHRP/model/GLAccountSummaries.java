package com.David.EazyHRP.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@Table(name = "GLAccountSummaries")
public class GLAccountSummaries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Oid")
    public Long oId;

    @Column(name = "Determinant")
    public Integer determinant;

    @Column(name = "Amount")
    public Double amount;

    @Column(name = "CreatedOn")
    public Date createdOn;

    @Column(name = "CreatedBy")
    public String createdBy;

    @Column(name = "ModifiedOn")
    @DateTimeFormat
    public Date modifiedOn;

    @Column(name = "ModifiedBy")
    public Date modifiedBy;

    @Column(name = "OptimisticLockedField")
    public Integer optimisticLockField;

    @Column(name = "GCRecord")
    public Integer gcRecord;

    @Column(name = "PayrollPeriod")
    public Long payrollPeriod;

    @Column(name = "ProcessingType")
    public String processingType;

    @Column(name = "Bank")
    public String bank;

    @Column(name = "Branch")
    public String branch;

    @Column(name = "SalaryCategory")
    public String salaryCategory;

    @Column(name = "Month")
    public String month;

    @Column(name = "Year")
    public String year;

    @Column(name = "AccountNo")
    public String accountNo;

    @Column(name = "NoOfEmployees")
    public String noOfEmployees;

    @Column(name = "Cureency")
    public String currency;

    @Column(name = "Date")
    public Date Date;

    @Column(name = "Status")
    public String status;

    @Column(name = "BranchCode")
    public String branchCode;

    @Column(name = "GLAccountGroup")
    public String glAccountGroup;

    @Column(name = "GLSummaryType")
    public String glSummaryType;

    @Column(name = "NoOfPersonnel")
    public Integer noOfPersonnel;

    @Column(name = "BatchNo")
    public String batchNo;

    public GLAccountSummaries() {
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public Integer getDeterminant() {
        return determinant;
    }

    public void setDeterminant(Integer determinant) {
        this.determinant = determinant;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public java.util.Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public java.util.Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(java.util.Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public java.util.Date getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(java.util.Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getOptimisticLockField() {
        return optimisticLockField;
    }

    public void setOptimisticLockField(Integer optimisticLockField) {
        this.optimisticLockField = optimisticLockField;
    }

    public Integer getGcRecord() {
        return gcRecord;
    }

    public void setGcRecord(Integer gcRecord) {
        this.gcRecord = gcRecord;
    }

    public Long getPayrollPeriod() {
        return payrollPeriod;
    }

    public void setPayrollPeriod(Long payrollPeriod) {
        this.payrollPeriod = payrollPeriod;
    }

    public String getProcessingType() {
        return processingType;
    }

    public void setProcessingType(String processingType) {
        this.processingType = processingType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSalaryCategory() {
        return salaryCategory;
    }

    public void setSalaryCategory(String salaryCategory) {
        this.salaryCategory = salaryCategory;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(String noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getGlAccountGroup() {
        return glAccountGroup;
    }

    public void setGlAccountGroup(String glAccountGroup) {
        this.glAccountGroup = glAccountGroup;
    }

    public String getGlSummaryType() {
        return glSummaryType;
    }

    public void setGlSummaryType(String glSummaryType) {
        this.glSummaryType = glSummaryType;
    }

    public Integer getNoOfPersonnel() {
        return noOfPersonnel;
    }

    public void setNoOfPersonnel(Integer noOfPersonnel) {
        this.noOfPersonnel = noOfPersonnel;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    @Override
    public String toString() {
        return "GLAccountSummaries{" +
                "oId=" + oId +
                ", determinant=" + determinant +
                ", amount=" + amount +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedBy=" + modifiedBy +
                ", optimisticLockField=" + optimisticLockField +
                ", gcRecord=" + gcRecord +
                ", payrollPeriod=" + payrollPeriod +
                ", processingType='" + processingType + '\'' +
                ", bank='" + bank + '\'' +
                ", branch='" + branch + '\'' +
                ", salaryCategory='" + salaryCategory + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", noOfEmployees='" + noOfEmployees + '\'' +
                ", currency='" + currency + '\'' +
                ", Date=" + Date +
                ", status='" + status + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", glAccountGroup='" + glAccountGroup + '\'' +
                ", glSummaryType='" + glSummaryType + '\'' +
                ", noOfPersonnel=" + noOfPersonnel +
                ", batchNo='" + batchNo + '\'' +
                '}';
    }
}
