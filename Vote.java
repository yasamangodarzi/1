package com.company;
import ir.huri.jcal.JalaliCalendar;
import java.util.HashSet;
import java.util.Objects;

public class Vote extends HashSet {
    person person ;
    private String data;
    public Vote(com.company.person person, String data) {
        this.person = person;
        this.data = data;
    }

    public  person getPerson() {
        return person;
    }

    public String getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) && Objects.equals(data, vote.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, data);
    }
}
