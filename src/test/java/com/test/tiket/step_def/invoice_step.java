package com.test.tiket.step_def;

import com.test.tiket.gherkin.invoice;
import cucumber.api.java8.En;

public class invoice_step implements En {
    public invoice_step()
    {
        And("make sure transaction created and appear at my order", () -> {
            invoice.check_myorder();
        });
    }
}
