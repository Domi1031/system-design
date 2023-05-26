
package arraysdemo;


public class Student {
    //commit added at 9:27AM
    //comment added for modifications
  private String sId;
  private String sName;  

    public Student(String sId, String sname) {
        this.sId = sId;
        this.sName = sName;
    }

  
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sName;
    }

    public void setSname(String sname) {
        this.sName = sName;
    }
  
  
}
