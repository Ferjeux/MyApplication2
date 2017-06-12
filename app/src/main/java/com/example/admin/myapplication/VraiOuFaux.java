package com.example.admin.myapplication;

/**
 * Created by admin on 12/06/2017.
 */

public class VraiOuFaux {

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String question;

    public String getRep1() {
        return rep1;
    }

    public void setRep1(String rep1) {
        this.rep1 = rep1;
    }

    public String getRep2() {
        return rep2;
    }

    public void setRep2(String rep2) {
        this.rep2 = rep2;
    }

    public String getBonneRep() {
        return bonneRep;
    }

    public void setBonneRep(String bonneRep) {
        this.bonneRep = bonneRep;
    }

    private String rep1;
    private String rep2;
    private String bonneRep;

    public VraiOuFaux(String question, String rep1, String rep2, String bonneRep){
        setQuestion(question);
        setBonneRep(bonneRep);
        setRep1(rep1);
        setRep2(rep2);
    }
}
