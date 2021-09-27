package com.David.EazyHRP.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SalarySchedulesWithMultipleAccounts")
public class SalarySchedulesWithMultipleAccounts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Oid")
    public Long oId;

    @Column(name = "EmpNo")
    public String empNo;

    @Column(name = "NetPay")
    public Double netPay;

    @Column(name = "Bank")
    public String bank;

    @Column(name = "AccountNo")
    public String accountNo;

    @Column(name = "ClassOfAccount")
    public String classOfAccount;

    @Column(name = "AuthorizedBy")
    public String authorizedBy;

    @Column(name = "AuthorizedDate")
    public Date authorizedDate;

    @Column(name = "Year")
    public String year;

    @Column(name = "Month")
    public String month;

    @Column(name = "Branch")
    public String branch;

    @Column(name = "SalaryGrade")
    public String salaryGrade;

    @Column(name = "Date")
    public Date date;

    @Column(name = "CreatedOn")
    public Date createdOn;

    @Column(name = "CreatedBy")
    public String createdBy;

    @Column(name = "ModifiedOn")
    public Date modifiedOn;

    @Column(name = "ModifiedBy")
    public String modifiedBy;

    @Column(name = "OptimisticLockField")
    public Integer optimisticLockField;

    @Column(name = "gcRecord")
    public Integer gcRecord;

    @Column(name = "Name")
    public String name;

    @Column(name = "Unit")
    public String unit;

    @Column(name = "JobDescription")
    public String jobDescription;

    @Column(name = "Group")
    public String group;

    @Column(name = "EmploymentType")
    public String employmentType;

    @Column(name = "Designation")
    public String designation;

    @Column(name = "PersonnelType")
    public String personnelType;

    @Column(name = "GrossEarning")
    public Double grossEarning;

    @Column(name = "GrossDeduction")
    public Double grossDeduction;

    @Column(name = "PayrollPeriod")
    public Long payrollPeriod;

    @Column(name = "ProcessingType")
    public String processingType;

    @Column(name = "AccountType")
    public String accountType;

    @Column(name = "SortCode")
    public String sortCode;

    @Column(name = "Currency")
    public String currency;

    @Column(name = "ConfirmPayment")
    public Integer confirmPayment;

    @Column(name = "PaymentType")
    public String paymentType;

    @Column(name = "ChequeNo")
    public String chequeNo;

    @Column(name = "EmpId")
    public Long empId;

    @Column(name = "Grade")
    public String grade;

    @Column(name = "BranchCode")
    public String branchCode;

    @Column(name = "BatchNo")
    public String batchNo;

    public SalarySchedulesWithMultipleAccounts() {
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Double getNetPay() {
        return netPay;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getClassOfAccount() {
        return classOfAccount;
    }

    public void setClassOfAccount(String classOfAccount) {
        this.classOfAccount = classOfAccount;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    public Date getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(Date authorizedDate) {
        this.authorizedDate = authorizedDate;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(String salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType;
    }

    public Double getGrossEarning() {
        return grossEarning;
    }

    public void setGrossEarning(Double grossEarning) {
        this.grossEarning = grossEarning;
    }

    public Double getGrossDeduction() {
        return grossDeduction;
    }

    public void setGrossDeduction(Double grossDeduction) {
        this.grossDeduction = grossDeduction;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getConfirmPayment() {
        return confirmPayment;
    }

    public void setConfirmPayment(Integer confirmPayment) {
        this.confirmPayment = confirmPayment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    @Override
    public String toString() {
        return "SalarySchedulesWithMultipleAccounts{" +
                "oId=" + oId +
                ", empNo='" + empNo + '\'' +
                ", netPay=" + netPay +
                ", bank='" + bank + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", classOfAccount='" + classOfAccount + '\'' +
                ", authorizedBy='" + authorizedBy + '\'' +
                ", authorizedDate=" + authorizedDate +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", branch='" + branch + '\'' +
                ", salaryGrade='" + salaryGrade + '\'' +
                ", date=" + date +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", optimisticLockField=" + optimisticLockField +
                ", gcRecord=" + gcRecord +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", group='" + group + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", designation='" + designation + '\'' +
                ", personnelType='" + personnelType + '\'' +
                ", grossEarning=" + grossEarning +
                ", grossDeduction=" + grossDeduction +
                ", payrollPeriod=" + payrollPeriod +
                ", processingType='" + processingType + '\'' +
                ", accountType='" + accountType + '\'' +
                ", sortCode='" + sortCode + '\'' +
                ", currency='" + currency + '\'' +
                ", confirmPayment=" + confirmPayment +
                ", paymentType='" + paymentType + '\'' +
                ", chequeNo='" + chequeNo + '\'' +
                ", empId=" + empId +
                ", grade='" + grade + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", batchNo='" + batchNo + '\'' +
                '}';
    }
}
