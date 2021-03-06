package io.seventytwo.demo;

import com.vaadin.flow.component.html.testbench.LabelElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloViewIT extends AbstractViewTest {

    @Before
    public void setup() {
        setDriver(new ChromeDriver());
        getDriver().get("http://localhost:8080/hello");
    }

    @Test
    public void showHelloJava() {
        TextFieldElement textField = $(TextFieldElement.class).first();
        textField.setValue("Java");
        textField.sendKeys(Keys.ENTER);

        LabelElement label = $(LabelElement.class).first();
        Assert.assertEquals("Hello, Java", label.getText());
    }
}
