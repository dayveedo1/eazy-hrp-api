package com.David.EazyHRP.controller;

import com.David.EazyHRP.constants.ApiResponse;
import com.David.EazyHRP.constants.CustomMessages;
import com.David.EazyHRP.exception.RecordNotFoundException;
import com.David.EazyHRP.model.Batch;
import com.David.EazyHRP.model.GLAccountSummaries;
import com.David.EazyHRP.model.SalarySchedulesWithMultipleAccounts;
import com.David.EazyHRP.service.AppServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
//@RequestMapping("/EazyHRP")
public class AppController {

    private static String NotFoundMessage = "Record Not Found: ";
    @Autowired
    private AppServiceImpl service;

    public AppController(AppServiceImpl service){
        this.service = service;
    }

    //<editor-fold desc = "Batch"

    @Operation(description = "To insert a batch record", tags = "Batch")
    @PostMapping("/addBatch")
    public ResponseEntity AddBatch(@RequestBody Batch batch){
        Batch b = service.getBatchRepo().save(batch);
        return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Success, b));
    }

    @Operation(description = "To select all batch", tags = "Batch")
    @GetMapping("/getBatch")
    public List<Batch> getAllBatch(){
        return service.getBatchRepo().findAll();
    }

    @Operation(description = "To select single batch record by ID", tags = "Batch")
    @GetMapping("/getBatchById/{oid}")
    public ResponseEntity getBatchById(@PathVariable ("oid") Long oid){
        return service.getBatchRepo().findById(oid).map(record -> {
            return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Success, record));
        }).orElseThrow(()->  new RecordNotFoundException(NotFoundMessage + oid));
    }

    @Operation(description = "To delete a batch record", tags = "Batch")
    @DeleteMapping("/deleteBatch/{oid}")
    public ResponseEntity deleteBatchById(@PathVariable ("oid") Long oid){
        return service.getBatchRepo().findById(oid).map(record ->  {
            service.getBatchRepo().deleteById(oid);
            return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Deleted, CustomMessages.DeletedMessage));
        }).orElseThrow(()-> new RecordNotFoundException(NotFoundMessage+ oid));
    }

    @Operation(description = "To update a batch record", tags = "Batch")
    @PutMapping("/updateBatch")
    public Batch updateBatch(@RequestBody Batch batch){
        return service.getBatchRepo().findById(batch.oId).map(record -> {
            record.oId = batch.oId;
            record.year = batch.year;
            record.status = batch.status;
            record.processingType = batch.processingType;
            record.processingDate = batch.processingDate;
            record.optimisticLocked = batch.optimisticLocked;
            record.month = batch.month;
            record.modifiedOn = batch.modifiedOn;
            record.gcRecord = batch.gcRecord;
            record.modifiedBy = batch.modifiedBy;
            record.description = batch.description;
            record.createdOn = new Date();
            record.createdBy = batch.createdBy;
            record.batchNo = batch.batchNo;

            return service.getBatchRepo().save(record);
        }).orElseThrow(()-> new RecordNotFoundException(NotFoundMessage + batch.oId));

    }

    //</editor-fold

    //<editor-fold desc = "GLAccountSummaries"
    @Operation(description = "To insert a GLAccountSummary record", tags = "GLAccountSummary")
    @PostMapping("/addGlAccountSummary")
    public ResponseEntity AddGlAccountSummary(@RequestBody GLAccountSummaries glAccountSummaries){
        GLAccountSummaries gl = service.getGlAccountSummariesRepo().save(glAccountSummaries);
        return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Success, gl));
    }

    @Operation(description = "To select all GLAccountSummary", tags = "GLAccountSummary")
    @GetMapping("/getGlAccountSummary")
    public List<GLAccountSummaries> getGlAccountSummary(){
        return service.getGlAccountSummariesRepo().findAll();
    }

    @Operation(description = "To select single GLAccountSummary record by ID", tags = "GLAccountSummary")
    @GetMapping("/getGlAccountSummaryById/{oid}")
    public ResponseEntity getGlAccountSummaryById(@PathVariable ("oid") Long oid){
        return service.getGlAccountSummariesRepo().findById(oid).map(record -> {
            return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Success, record));
        }).orElseThrow(()->  new RecordNotFoundException(NotFoundMessage + oid));
    }

    @Operation(description = "To delete a GLAccountSummary record", tags = "GLAccountSummary")
    @DeleteMapping("/deleteGlAccountSummary/{oid}")
    public ResponseEntity deleteGlAccountSummaryById(@PathVariable ("oid") Long oid){
        return service.getGlAccountSummariesRepo().findById(oid).map(record ->  {
            service.getGlAccountSummariesRepo().deleteById(oid);
            return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Deleted, CustomMessages.DeletedMessage));
        }).orElseThrow(()-> new RecordNotFoundException(NotFoundMessage+ oid));
    }

    @Operation(description = "To update a GLAccountSummary record", tags = "GLAccountSummary")
    @PutMapping("/updateGLAccountSummary")
    public GLAccountSummaries updateGLAccountSummary(@RequestBody GLAccountSummaries glAccountSummaries) {
        return service.getGlAccountSummariesRepo().findById(glAccountSummaries.oId).map(record -> {
            record.oId = glAccountSummaries.oId;
            record.accountNo = glAccountSummaries.accountNo;
            record.amount = glAccountSummaries.amount;
            record.bank = glAccountSummaries.bank;
            record.batchNo = glAccountSummaries.batchNo;
            record.branch = glAccountSummaries.branch;
            record.branchCode = glAccountSummaries.branchCode;
            record.createdBy = glAccountSummaries.createdBy;
            record.createdOn = new Date();
            record.currency = glAccountSummaries.currency;
            record.Date = glAccountSummaries.Date;
            record.determinant = glAccountSummaries.determinant;
            record.gcRecord = glAccountSummaries.gcRecord;
            record.glAccountGroup = glAccountSummaries.glAccountGroup;
            record.glSummaryType = glAccountSummaries.glSummaryType;
            record.modifiedBy = glAccountSummaries.modifiedBy;
            record.modifiedOn = glAccountSummaries.modifiedOn;
            record.month = glAccountSummaries.month;
            record.noOfEmployees = glAccountSummaries.noOfEmployees;
            record.noOfPersonnel = glAccountSummaries.noOfPersonnel;
            record.optimisticLockField = glAccountSummaries.optimisticLockField;
            record.payrollPeriod = glAccountSummaries.payrollPeriod;
            record.processingType = glAccountSummaries.processingType;
            record.salaryCategory = glAccountSummaries.salaryCategory;
            record.status = glAccountSummaries.status;
            record.year = glAccountSummaries.year;

            return service.getGlAccountSummariesRepo().save(record);
        }).orElseThrow(() -> new RecordNotFoundException(NotFoundMessage + glAccountSummaries.oId));

    }
    //</editor-fold


    //<editor-fold desc = "SalarySchedulesWithMultipleAccounts"
    @Operation(description = "To insert a SalarySchedulesWithMultipleAccounts record", tags = "SalarySchedulesWithMultipleAccounts")
    @PostMapping("/addSalarySchedulesWithMultipleAccounts")
    public ResponseEntity AddSalarySchedulesWithMultipleAccounts(@RequestBody SalarySchedulesWithMultipleAccounts salarySchedulesWithMultipleAccounts){
        SalarySchedulesWithMultipleAccounts s = service.getSalarySchedulesWithMultipleAccountsRepo().save(salarySchedulesWithMultipleAccounts);
        return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Success, s));
    }

    @Operation(description = "To select all SalarySchedulesWithMultipleAccounts", tags = "SalarySchedulesWithMultipleAccounts")
    @GetMapping("/getSalarySchedulesWithMultipleAccounts")
    public List<SalarySchedulesWithMultipleAccounts> getSalarySchedulesWithMultipleAccounts(){
        return service.getSalarySchedulesWithMultipleAccountsRepo().findAll();
    }

    @Operation(description = "To select single SalarySchedulesWithMultipleAccounts record by ID", tags = "SalarySchedulesWithMultipleAccounts")
    @GetMapping("/getSalarySchedulesWithMultipleAccountsById/{oid}")
    public ResponseEntity getSalarySchedulesWithMultipleAccountsById(@PathVariable ("oid") Long oid){
        return service.getSalarySchedulesWithMultipleAccountsRepo().findById(oid).map(record -> {
            return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Success, record));
        }).orElseThrow(()->  new RecordNotFoundException(NotFoundMessage + oid));
    }

    @Operation(description = "To delete a SalarySchedulesWithMultipleAccounts record", tags = "SalarySchedulesWithMultipleAccounts")
    @DeleteMapping("/deleteSalarySchedulesWithMultipleAccounts/{oid}")
    public ResponseEntity deleteSalarySchedulesWithMultipleAccountsById(@PathVariable ("oid") Long oid){
        return service.getSalarySchedulesWithMultipleAccountsRepo().findById(oid).map(record ->  {
            service.getSalarySchedulesWithMultipleAccountsRepo().deleteById(oid);
            return ResponseEntity.ok(new ApiResponse<>(CustomMessages.Deleted, CustomMessages.DeletedMessage));
        }).orElseThrow(()-> new RecordNotFoundException(NotFoundMessage+ oid));
    }

    @Operation(description = "To update a SalarySchedulesWithMultipleAccounts record", tags = "SalarySchedulesWithMultipleAccounts")
    @PutMapping("/updateSalarySchedulesWithMultipleAccounts")
    public SalarySchedulesWithMultipleAccounts updateSalarySchedulesWithMultipleAccounts(@RequestBody SalarySchedulesWithMultipleAccounts salarySchedulesWithMultipleAccounts) {
        return service.getSalarySchedulesWithMultipleAccountsRepo().findById(salarySchedulesWithMultipleAccounts.oId).map(record -> {
            record.oId = salarySchedulesWithMultipleAccounts.oId;
            record.accountNo = salarySchedulesWithMultipleAccounts.accountNo;
            record.accountType = salarySchedulesWithMultipleAccounts.accountType;
            record.authorizedBy = salarySchedulesWithMultipleAccounts.authorizedBy;
            record.authorizedDate = salarySchedulesWithMultipleAccounts.authorizedDate;
            record.bank = salarySchedulesWithMultipleAccounts.bank;
            record.batchNo = salarySchedulesWithMultipleAccounts.batchNo;
            record.branch = salarySchedulesWithMultipleAccounts.branch;
            record.branchCode = salarySchedulesWithMultipleAccounts.branchCode;
            record.chequeNo = salarySchedulesWithMultipleAccounts.chequeNo;
            record.classOfAccount = salarySchedulesWithMultipleAccounts.classOfAccount;
            record.confirmPayment = salarySchedulesWithMultipleAccounts.confirmPayment;
            record.createdBy = salarySchedulesWithMultipleAccounts.createdBy;
            record.createdOn = salarySchedulesWithMultipleAccounts.createdOn;
            record.currency = salarySchedulesWithMultipleAccounts.currency;
            record.date = salarySchedulesWithMultipleAccounts.date;
            record.designation = salarySchedulesWithMultipleAccounts.designation;
            record.empId = salarySchedulesWithMultipleAccounts.empId;
            record.employmentType = salarySchedulesWithMultipleAccounts.employmentType;
            record.empNo = salarySchedulesWithMultipleAccounts.empNo;
            record.gcRecord = salarySchedulesWithMultipleAccounts.gcRecord;
            record.grade = salarySchedulesWithMultipleAccounts.grade;
            record.grossDeduction = salarySchedulesWithMultipleAccounts.grossDeduction;
            record.grossEarning = salarySchedulesWithMultipleAccounts.grossEarning;
            record.group = salarySchedulesWithMultipleAccounts.group;
            record.jobDescription = salarySchedulesWithMultipleAccounts.jobDescription;
            record.modifiedBy = salarySchedulesWithMultipleAccounts.modifiedBy;
            record.modifiedOn = salarySchedulesWithMultipleAccounts.modifiedOn;
            record.month = salarySchedulesWithMultipleAccounts.month;
            record.name = salarySchedulesWithMultipleAccounts.name;
            record.netPay = salarySchedulesWithMultipleAccounts.netPay;
            record.optimisticLockField = salarySchedulesWithMultipleAccounts.optimisticLockField;
            record.paymentType = salarySchedulesWithMultipleAccounts.paymentType;
            record.payrollPeriod = salarySchedulesWithMultipleAccounts.payrollPeriod;
            record.personnelType = salarySchedulesWithMultipleAccounts.personnelType;
            record.processingType = salarySchedulesWithMultipleAccounts.processingType;
            record.salaryGrade = salarySchedulesWithMultipleAccounts.salaryGrade;
            record.sortCode = salarySchedulesWithMultipleAccounts.sortCode;
            record.unit = salarySchedulesWithMultipleAccounts.unit;
            record.year = salarySchedulesWithMultipleAccounts.year;


            return service.getSalarySchedulesWithMultipleAccountsRepo().save(record);
        }).orElseThrow(() -> new RecordNotFoundException(NotFoundMessage + salarySchedulesWithMultipleAccounts.oId));

    }

    //<editor-fold
}


