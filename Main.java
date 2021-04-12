package com.company;
import java.util.Random;
import java.util.Scanner;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        person person1=new person("yas","godarzi");
        person person2=new person("leila","hamidi");
        votingSystem votingSystem=new votingSystem();
        ArrayList<String>g=new ArrayList<>();
        g.add("yammi");
        g.add("roz");
        g.add("farda");
        ArrayList<String>d=new ArrayList<>();
        d.add("love");
        d.add("snow man");
        d.add("you");
        votingSystem.creatVoting("What is the best movie?",0,g);
        votingSystem.creatVoting("What is the worst movie?",1,d);
        //votingSystem.printVotingQuestion();
        votingSystem.printVoting(0);
        System.out.println("------------------");
        votingSystem.printVoting(1);
        System.out.println("------------------");
        System.out.println("enter number of question:");
        String numberQuestion=sc.nextLine();
        System.out.println("If you want the option to be selected randomly, enter zero and otherwise 1:");
        String halat=sc.nextLine();
        if (halat.equals("1"))
        {
            if (numberQuestion.equals("0"))
            {
                String choice=sc.nextLine();
                ArrayList<String>z=new ArrayList<>();
                z.add(g.get(Integer.valueOf(choice)));
                votingSystem.vote(0,person2,z);
            }
            if (numberQuestion.equals("1"))
            {
                ArrayList<String>z=new ArrayList<>();
                for (int i=0;i<2;i++)
                {
                    String choice=sc.nextLine();
                    z.add(d.get(Integer.valueOf(choice)));
                }
                votingSystem.vote(1,person2,z);
            }

        }
        else if (halat.equals("0")){
            if (numberQuestion.equals("0"))
            {
                int select =r.nextInt(2);
                ArrayList<String>z=new ArrayList<>();
                z.add(g.get(select));
                votingSystem.vote(0,person2,z);
            }
            if (numberQuestion.equals("1"))
            {
                ArrayList<String>z=new ArrayList<>();
                for (int i=0;i<2;i++)
                {
                    int select =r.nextInt(2);
                    z.add(d.get(select));
                }
                votingSystem.vote(1,person2,z);
            }
        }

        ArrayList<String>f=new ArrayList<>();
        f.add("roz");
        votingSystem.vote(0,person2,f);
        System.out.println("------------------");
        votingSystem.printResult(0);
        System.out.println("------------------");
        votingSystem.printResult(1);
        System.out.println("------------------");

    }
}
