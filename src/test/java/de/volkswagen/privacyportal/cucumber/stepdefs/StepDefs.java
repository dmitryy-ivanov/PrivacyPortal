package de.volkswagen.privacyportal.cucumber.stepdefs;

import de.volkswagen.privacyportal.PrivacyPortalApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PrivacyPortalApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
