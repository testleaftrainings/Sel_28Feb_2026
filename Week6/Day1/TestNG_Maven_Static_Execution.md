# TestNG Advanced Execution using Maven (Static)

## Static Parameterization -- Execute using Maven

------------------------------------------------------------------------

## Step 1: Add Parameters in `testng.xml`

Define the required parameters inside the TestNG XML file.

``` xml
<parameter name="browser" value="chrome"/>
<parameter name="url" value="https://example.com"/>
```

------------------------------------------------------------------------

## Step 2: Configure `@Parameters` in BaseClass

Map the parameters from `testng.xml` using TestNG annotations.

``` java
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeMethod;

@Parameters({"browser","url"})
@BeforeMethod
public void setup(String browser, String url) {
    System.out.println(browser);
    System.out.println(url);
}
```

------------------------------------------------------------------------

## Step 3: Open Maven Project in Terminal

-   Right click on the project
-   Select **Open in Integrated Terminal**

------------------------------------------------------------------------

## Step 4: Execute using Maven Command

Run the following command:

``` bash
mvn clean test
```

Press **Enter** to start execution.

------------------------------------------------------------------------

## Step 5: Verify Output and Check Terminal Logs

-   Ensure values from XML are printed in the console

``` text
// Output: Parameters passed successfully
```

------------------------------------------------------------------------

## Summary

  Step   Action
  ------ -------------------------------------------------
  1      Configure parameters in `testng.xml`
  2      Map parameters using `@Parameters` in BaseClass
  3      Open terminal
  4      Run `mvn clean test`
  5      Verify output in logs

------------------------------------------------------------------------

## Notes

-   Ensure TestNG XML is correctly linked in your Maven configuration
-   Parameter names must match exactly between XML and `@Parameters`
    annotation
-   Maven should be properly installed and configured in your system
