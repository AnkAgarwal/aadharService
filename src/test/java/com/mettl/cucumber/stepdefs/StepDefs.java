package com.mettl.cucumber.stepdefs;

import com.mettl.AadharServiceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AadharServiceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
