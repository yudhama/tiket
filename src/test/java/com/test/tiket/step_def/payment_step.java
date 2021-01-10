package com.test.tiket.step_def;

import cucumber.api.java8.En;
import com.test.tiket.gherkin.payment;

public class payment_step implements En {
    public payment_step() {
        And("user choose virtual account mandiri as payment method", () -> {
            payment.choose_mandiri();
        });

        And("user choose virtual account bca as payment method", () -> {
            payment.choose_bca();
        });
    }
}
