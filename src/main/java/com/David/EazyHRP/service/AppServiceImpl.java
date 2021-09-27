package com.David.EazyHRP.service;

import com.David.EazyHRP.repo.BatchRepo;
import com.David.EazyHRP.repo.GLAccountSummariesRepo;
import com.David.EazyHRP.repo.SalarySchedulesWithMultipleAccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class AppServiceImpl{

    @Autowired
    private BatchRepo batchRepo;

    @Autowired
    private GLAccountSummariesRepo glAccountSummariesRepo;

    @Autowired
    private SalarySchedulesWithMultipleAccountsRepo salarySchedulesWithMultipleAccountsRepo;



    public BatchRepo getBatchRepo() {
        return batchRepo;
    }

    public void setBatchRepo(BatchRepo batchRepo) {
        this.batchRepo = batchRepo;
    }

    public GLAccountSummariesRepo getGlAccountSummariesRepo() {
        return glAccountSummariesRepo;
    }

    public void setGlAccountSummariesRepo(GLAccountSummariesRepo glAccountSummariesRepo) {
        this.glAccountSummariesRepo = glAccountSummariesRepo;
    }

    public SalarySchedulesWithMultipleAccountsRepo getSalarySchedulesWithMultipleAccountsRepo() {
        return salarySchedulesWithMultipleAccountsRepo;
    }

    public void setSalarySchedulesWithMultipleAccountsRepo(SalarySchedulesWithMultipleAccountsRepo salarySchedulesWithMultipleAccountsRepo) {
        this.salarySchedulesWithMultipleAccountsRepo = salarySchedulesWithMultipleAccountsRepo;
    }
}
