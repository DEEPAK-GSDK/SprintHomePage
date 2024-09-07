package com.cg.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=true,glue="com.cg.StepDef",features="Feature",tags="@Login",
plugin= {"pretty","json:target/cucumber.json","html:target/login.html","rerun:target/failtest.txt"})
public class TestRunner {
	
}
  