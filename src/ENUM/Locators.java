package ENUM;


enum Locators {
    page_button("#btn"),
    page_input("input");

    private String locators;

    Locators(String locators_c) {
        this.locators = locators_c;
    }

    String getLocators() {
        return this.locators;
    }
}