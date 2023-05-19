
package arraysdemo;


public class Student {
  private String sId;
  private String sname;  

    public Student(String sId, String sname) {
        this.sId = sId;
        this.sname = sname;
    }

  
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
  
  
}
