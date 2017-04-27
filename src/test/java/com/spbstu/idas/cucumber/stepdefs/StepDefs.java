package com.spbstu.idas.cucumber.stepdefs;

import com.spbstu.idas.IdasApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IdasApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
