package com.example.seniorproject;

public class User {
    enum MyersBriggs{
        INTJ, INTP, ENTJ, ENTP,
        INFJ, INFP, ENFJ, ENFP,
        ISTP, ISTJ, ESTP, ESTJ,
        ISNP, ISNJ, ESNP, ESNJ
    }

    enum Enneagram{
        ONE, TWO, THREE, FOUR, FIVE,
        SIX, SEVEN, EIGHT, NINE
    }

    MyersBriggs myersBriggs;
    Enneagram enneagram;
    String username;
    String password;

    //Constructors
    User(){
        myersBriggs = null;
        enneagram = null;
        username = null;
        password = null;
    }

    User(MyersBriggs mb, Enneagram e){
        myersBriggs = mb;
        enneagram = e;
    }

    User(String u, String p){
        username = u;
        password = p;
        myersBriggs = null;
        enneagram = null;
    }

    //Setters
    void setMyersBriggs(MyersBriggs mb){
        myersBriggs = mb;
    }

    void setEnneagram(Enneagram e){
        enneagram = e;
    }

    //Getters
    MyersBriggs getMyersBriggs(){
        return myersBriggs;
    }

    Enneagram getEnneagram(){
        return enneagram;
    }
}
