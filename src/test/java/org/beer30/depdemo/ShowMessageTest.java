package org.beer30.depdemo;

import org.junit.Assert;
import org.junit.Test;

public class ShowMessageTest {

    @Test
    public void test() {
        ShowMessage showMessage = new ShowMessage();
        Assert.assertNotNull(showMessage);
        Assert.assertEquals("Gradle Rocks!", showMessage.displayMessage());
    }

    @Test
    public void guavaVersion() {
        ShowMessage showMessage = new ShowMessage();

        System.out.print(showMessage.getGuavaVersion());
    }
}