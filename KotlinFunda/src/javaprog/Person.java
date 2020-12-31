package javaprog;

import org.jetbrains.annotations.Nullable;

public class Person {
    
    private String name;
    private int age;
    private Person partner;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {     
        throw new IllegalArgumentException("exception");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Nullable
    public Person getPartner() {
        return partner;
    }
    public void setPartner(Person partner) {
        this.partner = partner;
    }   
}
