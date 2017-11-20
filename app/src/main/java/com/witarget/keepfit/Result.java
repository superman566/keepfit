package com.witarget.keepfit;

public class Result {

    String name;
    Double score;

    public Result(){}

    public Result(String name, Double score){
        this.name=name;
        this.score=score;
    }

    public String getname(){
        return name;
    }

    public Double getscore(){
        return score;
    }

    public void setname(String name){

        this.name=name;
    }

    public void setscore(Double score){
        this.score=score;
    }
}
