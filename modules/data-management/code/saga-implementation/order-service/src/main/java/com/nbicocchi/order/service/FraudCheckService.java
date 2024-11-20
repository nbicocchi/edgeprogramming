package com.nbicocchi.order.service;

import com.nbicocchi.order.pojos.DepositDetail;
import com.nbicocchi.order.pojos.FraudCheckResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.nbicocchi.order.pojos.FraudCheckResult.Result.FAIL;
import static com.nbicocchi.order.pojos.FraudCheckResult.Result.PASS;

@Service
public class FraudCheckService {

    public FraudCheckResult checkForFraud(DepositDetail depositDetail) {
        if (depositDetail.getAmount().compareTo(BigDecimal.valueOf(100000)) > 0) {
            return new FraudCheckResult(FAIL, "Amount too large");
        } else {
            return new FraudCheckResult(PASS, "All good");
        }
    }
}
