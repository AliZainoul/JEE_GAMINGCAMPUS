package com.ccc.loanlibrary;


public class Member {
    private int memberId;
    private static int memberIdCounter = 1;
    private String name;
    private String email;

    public Member(String name, String email) {
        this.memberId = memberIdCounter++;
        this.name = name;
        this.email = email;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + "\nName: " + name + "\nEmail: " + email;
    }
}
