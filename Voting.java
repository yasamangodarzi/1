package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Voting {
    private int type;
    private String question;
    private ArrayList<person> voters=new ArrayList<>();
    private HashMap<String, HashSet<Vote>> polls =new HashMap<String, HashSet<Vote>>();
    JalaliCalendar jalaliCalendar=new JalaliCalendar();
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
    public void createChoice(String gozine)
    {
        polls.put(gozine,new HashSet<Vote>());
    }
    public void vote(person p,ArrayList<String> s)
    {
        voters.add(p);
        Vote v=new Vote(p,jalaliCalendar.toString());
        HashSet<Vote> vott =new HashSet<Vote>();
            for (String str:s) {
           if (this.polls.containsKey(str))
           {
               vott=this.polls.get(str);
               vott.add(v);
               this.polls.put(str,vott);
           }
        }
        }

    public void printVotes()
    {
        for (Map.Entry<String,HashSet<Vote>> str:polls.entrySet()) {

            System.out.println(str.getKey());
            System.out.print("Number of votes received : ");
            System.out.println(str.getValue().size());

        }
    }
    public void getVoters()
    {
        for (person per:voters) {
        System.out.println(per.toString());
        }
    }
    public  ArrayList<String> getChoices()
    {
        ArrayList gozine =new ArrayList();
        for (String s:polls.keySet()) {
            gozine.add(s);
        }
        return gozine;
    }

}
