package com.test.tiket.step_def;

import com.test.tiket.gherkin.flight;
import cucumber.api.java8.En;

public class flight_step implements En {
    public flight_step()
    {
        Then("user going to flight page", () -> {
            flight.access_pesawat_page();
        });

        And("search round trip flight", () -> {
            flight.click_roundtrip();
            flight.search_flight();
        });

        And("user filter for (.*) transit", (String transit) -> {
            flight.filter_and_choose(transit);
        });

        And("user fill all the information for flight", () -> {
            flight.fill_the_passanger_data();
        });

    }
}
