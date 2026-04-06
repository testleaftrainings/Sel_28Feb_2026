# TestNG Advanced Execution using Maven (Static)

## Static Parameterization -- Execute using Maven

------------------------------------------------------------------------

### Step 1: Add Parameters in `testng.xml`

``` xml
<parameter name="browser" value="chrome"/>
<parameter name="url" value="https://example.com"/>
```

------------------------------------------------------------------------

### Step 2: Configure `@Parameters` in BaseClass

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

### Step 3: Open Maven Project in Terminal

-   Right click on project\
-   Select → **Open in Integrated Terminal**

------------------------------------------------------------------------

### Step 4: Execute using Maven Command

``` bash
mvn clean test
```

Press **Enter**

------------------------------------------------------------------------

### Step 5: Verify Output and Check Terminal Logs

-   Values from XML should be printed

``` text
// Output: Parameters passed successfully
```

------------------------------------------------------------------------

## Summary

-   Configure parameters in `testng.xml`\
-   Map using `@Parameters` in BaseClass\
-   Open terminal\
-   Run `mvn clean test`\
-   Verify output in logs
