import java.sql.Connection;

public class student {

    public static void create(studentinfo st) {
        String insert ="insert into Emp values ("+ st.getId()+ st.getName()+ st.getAdd()+ st.getPhone()+ st.getEmail()+ st.getSalary()+ st.getDept()+")";
        Connection c = Connect.connect();


    }

    public static void readall() {
        
    }
}
