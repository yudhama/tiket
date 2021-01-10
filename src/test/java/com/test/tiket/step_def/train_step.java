package com.test.tiket.step_def;

import com.test.tiket.gherkin.train;
import cucumber.api.java8.En;

public class train_step implements En {
    public train_step()
    {
        Then("user going to train page", () -> {
            train.access_kereta_page();
        });
        And("search single trip with (.*) dewasa and (.*) anak", (String dewasa, String anak) -> {
            train.create_order_kereta(dewasa, anak);
        });
        And("user fill all the information for train", () -> {
            train.fill_data_passangers();
        });
        And("choose seat for all the passangers", () -> {
        train.choose_seat();
    });

    }
}
