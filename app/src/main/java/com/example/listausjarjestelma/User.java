package com.example.listausjarjestelma;

public class User {
    protected String name;
    protected String surname;
    protected String mail;
    protected String program;

    public User(String name,String surname,String mail,String program){
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.program = program;
    }

    public String getFirstName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getProgram(){
        return program;
    }


}
