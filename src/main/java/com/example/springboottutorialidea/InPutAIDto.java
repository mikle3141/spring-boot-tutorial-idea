package com.example.springboottutorialidea;

public class InPutAIDto extends BaseDto {
    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        attrs.put("firstName", firstName);
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        attrs.put("middleName", middleName);
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        attrs.put("lastName", lastName);
        this.lastName = lastName;
    }
}
