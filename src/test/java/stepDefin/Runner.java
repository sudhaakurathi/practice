package stepDefin;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurecasestudy/casestudy4.feature",
                glue="stepDefin",
                //tags= {"@login,@logout"},
                //tags= {"~@login"})
                
               plugin="html:target/htmlreport")
                //plugin="xml:target/xmlreport.xml")
                //plugin="json:target/jsonreport.junit")


public class Runner {
	

}
