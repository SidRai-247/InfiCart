package com.siddharth.ecommerce.kafka;

import com.siddharth.ecommerce.customer.CustomerResponse;
import com.siddharth.ecommerce.order.PaymentMethod;
import com.siddharth.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
