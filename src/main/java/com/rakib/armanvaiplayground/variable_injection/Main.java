package com.rakib.armanvaiplayground.variable_injection;

/*
 * Constructor Injection
 * Setter Injection
 * */
public class Main {
    public static void main(String[] args) {

        User user = new User("Jahadul", "rakib", 10);
        user.setEmail("rakib@rakib.com");
        user.setActive(false);

        String detailsInformation = user.getUserDetailsInformation();
        System.out.println(detailsInformation);

        System.out.println(user.toString());
    }
}
