package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name = "testData")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Software Tester", "London", "up to 50 miles", "45000", "70000", "Per month", "Any"},
                {"Tester", "London", "up to 25 miles", "45000", "70000", "Per month", "Any"},
                {"Driver", "Harrow Green, Suffolk", "up to 35 miles", "25000", "45000", "Per month", "Any"},
                {"Recruitment Administrator", "Norfolk", "up to 75 miles", "25000", "50000", "Per month", "Any"},
                {"Nurse", "Glasgow, Glasgow City", "up to 15 miles", "45000", "70000", "Per month", "Any"},
                {"Internal Sales Executive", "Edmonton, Greater London", "up to 25 miles", "35000", "70000", "Per month", "Any"}

        };
        return data;
    }

}
