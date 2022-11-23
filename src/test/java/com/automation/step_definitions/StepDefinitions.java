package com.automation.step_definitions;

import com.automation.pages.DashBoardPage;
import io.cucumber.java.en.Given;

public class StepDefinitions {
    DashBoardPage dashBoardPage;

    @Given("I am on the dashboard page")
    public void i_am_on_the_dashboard() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.verifyIAmOnDashboard();
    }

    @Given("I type into search field {string}")
    public void i_search_for(String parameter) {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.typeInSearchField(parameter);
    }

    @Given("I click go button")
    public void i_click_go_button() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.clickGoButton();
    }

    @Given("I press Enter key")
    public void i_click_enter_key() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.pressEnterKey();
    }

    @Given("I verify successful message")
    public void i_verify_successful_message() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.verifySuccessfulMessage();
    }

    @Given("I verify found repositories")
    public void i_verify_found_repositories() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.verifyFoundRepositories();
    }

    @Given("I verify github urls")
    public void i_verify_github_urls() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.checkGithubUrls();
    }

    @Given("I verify description of each github repository")
    public void i_verify_repos_description() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.checkReposDescription();
    }

    @Given("I verify no user found error message")
    public void i_verify_no_user_found_error() {
        dashBoardPage = new DashBoardPage();
        dashBoardPage.verifyNoUserFoundError();
    }
}
