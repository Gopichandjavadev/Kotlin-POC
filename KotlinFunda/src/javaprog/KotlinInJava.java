package javaprog;

import funda.pro.Meeting;

public class KotlinInJava {

    public static void main(String[] args) {
        
        Meeting meeting = new Meeting("title");
        
        meeting.setLocation("Hyd");
        
        System.out.println("meeting is in "+ meeting.getLocation());
    }

}
