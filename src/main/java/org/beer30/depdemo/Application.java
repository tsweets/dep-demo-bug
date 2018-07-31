package org.beer30.depdemo;

public class Application {
    public static void main(String[] args) {
        ShowMessage showMessage = new ShowMessage();
        System.out.println(showMessage.displayMessage());
        System.out.println("Guava Version: " + showMessage.getGuavaVersion());

    }
}
