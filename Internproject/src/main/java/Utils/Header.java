package Utils;

import java.util.Date;

public class Header {
    private Date date;
    public int assignendDuties;
    private int noOfStudents;
    private int noOfInvigilators;


    public void increaseDuty(){
        this.assignendDuties++;
    }

    public Header(Date date){
        this.date = date;  
    }

    Date getDate(){
        return date;
    }

    void setDate(Date date){
        this.date = date;
    }

    int getNoOfStudents(){
        return noOfStudents;
    }

    void setNoOfStudents(int noOfStudents){
        this.noOfStudents = noOfStudents;
    }

    int getNoOfInvigilators(){
        return noOfInvigilators;
    }

    void setNoOfInvigilators(int noOfInvigilators){
        this.noOfInvigilators = noOfInvigilators;
    }
}
