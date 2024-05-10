package com.ruveyda.service;

import com.ruveyda.entity.PaymentInfo;
import com.ruveyda.repository.PaymentInfoRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoService extends ServiceManager<PaymentInfo,Long> {
    private final PaymentInfoRepository paymentInfoRepository;


    public PaymentInfoService(PaymentInfoRepository paymentInfoRepository) {
        super(paymentInfoRepository);
        this.paymentInfoRepository = paymentInfoRepository;
    }

}
