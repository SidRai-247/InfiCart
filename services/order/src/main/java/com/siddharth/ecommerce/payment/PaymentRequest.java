package com.siddharth.ecommerce.payment;

import com.siddharth.ecommerce.customer.CustomerResponse;
import com.siddharth.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
