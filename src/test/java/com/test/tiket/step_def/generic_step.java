package com.test.tiket.step_def;

import cucumber.api.java8.En;
import com.test.tiket.gherkin.generic;

public class generic_step implements En {
    public generic_step(){
        Given("user login and access tiket.com", () -> {
            generic.runDriver();
            generic.access_tiket();
            generic.login();
        });

        Then("user logout from tiket.com", () -> {
            generic.access_tiket();
            generic.logout();
            generic.close();
        });
    }
}
