package encapsulation2;

public class ENCAPSULATION2 {

    public static void main(String[] args) {
        Aust obj = new Aust();

        obj.setstudent(1000);
        obj.setrooms(15);
        obj.setteacher(200);

        System.out.println(obj.getstudent());
        System.out.println(obj.getrooms());
        System.out.println(obj.getteachers());

    }
}

class Aust {

    private int student;
    private int rooms;
    private int teachers;

    public void setstudent(int student) {
        this.student = student;
    }

    public void setrooms(int rooms) {
        this.rooms =  rooms;
    }

    public void setteacher(int teachers) {
        this.teachers = teachers;
    }

    public int getstudent() {
        return student;
    }

    public float getrooms() {
        return rooms;
    }

    public int getteachers() {
        return teachers;
    }

}
