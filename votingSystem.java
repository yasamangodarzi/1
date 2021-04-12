package com.company;

import java.util.ArrayList;

public class votingSystem {
    private ArrayList<Voting> votinglist ;
    public votingSystem()
    {
        votinglist=new ArrayList<>();
    }
    public void creatVoting(String ques ,int halat, ArrayList<String> gozines)
    {
        Voting voting=new Voting(halat,ques);
        for (String st:gozines) {
            voting.createChoice(st);
        }
        votinglist.add(voting);
    }
    public void printVotingQuestion()
    {
        int i=0;
        for (Voting vt:votinglist) {
             System.out.println("Question "+i+" : "+vt.getQuestion());
             i++;
        }
    }
    public void printVoting(int index)
    {
        System.out.println(votinglist.get(index).getQuestion());
        ArrayList<String> gozine1 =votinglist.get(index).getChoices();
        for ( String per:gozine1) {
            System.out.println(per);
        }
    }
    public void  printResult(int index)
    {
        votinglist.get(index).printVotes();

    }
    public void vote(int index,person person,ArrayList<String> voteperson)
    {
        votinglist.get(index).vote(person,voteperson);
    }

}
