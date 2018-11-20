# AutomationPracticeProject

## Project Aim
This project was created in order to test the website automationpractice.com. In order to do this the team 
has split our focus into user paths (using BDD practices) and applied scenario test cases using cucumber.
This will allow automated tests to be run using Selenium to enact specified user actions. The user actions we have
tested can be seen on https://www.lucidchart.com/invitations/accept/b4dd3bb3-b441-40a9-a8b7-4893d7b4d7a1 . 

## Prerequisites
In order to use this product you will need to follow the following steps after successfully cloning this repository.
The steps are as follows:
1. Install drivers for any browser you require. E.g. Chromedriver which can be found on http://chromedriver.chromium.org/downloads.
2. Open this product in your chosen IDE and access the selenium_driver.properties file found in the Selenium_Config
    package. Adjust the path values for your driver to the local path for the driver. 
3. In the SeleniumProperties class adjust this to your filepath for the selenium_driver.properties file.
4. Repeat this step in the AppTest class.

## How to use
1. See the CukesJunitRunner class, change the path of 'features' to the full path of features package on your personal machine.
2. When creating scenarios the user should create a new features file or add to an existing features file in the features directory
2. The glue should remain as the directory name of the parent directory of the step defintions .
3. The user should input the tag names of the tests they wish to run. There are also existing scenarios for the user to run.

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:src/reports"},
        features = {""},
        glue = {"Step_Defs"},
        tags = {""}
)
public class CukesJunitRunner {
}


## Authors
Daniel Blake, Jason Blee, Sam Grill, Oliver Hall, John Shipman, Boris Zekic

## Version 
1.0.0 - 16/11/2018
