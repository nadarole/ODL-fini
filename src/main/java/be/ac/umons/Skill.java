package be.ac.umons;

import java.io.Serializable;

public class Skill implements Serializable {
    private String skillName;

    public Skill(String skillName){
        this.skillName = skillName;
    }

    public void setSkillName(String skillName){this.skillName = skillName;}

    public String getSkillName(){return skillName;}
}
