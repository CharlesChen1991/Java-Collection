package com.collection.dto;

/**
 * A test pojo
 *
 * @author hao.e.chen
 * @date 12/01/2018
 */
public class Person {
    private String familyName;

    public Person(String familyName, String lastName) {
        this.familyName = familyName;
        this.lastName = lastName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (!getFamilyName().equals(person.getFamilyName())) {
            return false;
        }
        return getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getFamilyName().hashCode();
        result = 31 * result + getLastName().hashCode();
        return result;
    }
}
