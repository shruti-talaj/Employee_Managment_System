import java.sql.*;

public class employee {

    public static void create(Empinfo st) throws SQLException {
//        String insert ="insert into Emp values ("+ st.getId()+ st.getName()+ st.getAdd()+ st.getPhone()+ st.getEmail()+ st.getSalary()+ st.getDept()+")";
        Connection c = Connect.connect();
        String query = Query.Insert;
        PreparedStatement pst = c.prepareStatement(query);
//        System.out.println(pst);
        pst.executeUpdate();
        pst.close();

    }

    public static void readall() throws SQLException {

        Connection c = Connect.connect();
        String query = Query.select;
        PreparedStatement st = c.prepareStatement(query);
//        System.out.println(st);
        ResultSet res = st.executeQuery();
             while (res.next()) {
                Empinfo e = new Empinfo(res.getInt("empid"), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getInt(6), res.getInt(7));

                System.out.println(e);
            }
            st.close();
    }

    public static void UpdateName(int id,String name) throws SQLException {
        Connection c = Connect.connect();
        String query = "Update Emp SET name = '"+name+"'where empid ='"+id+"'";;
        Statement st = c.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }
    public static void UpdateAdd(int id,String add) throws SQLException {
        Connection c = Connect.connect();
        String query = "Update Emp SET name = '"+add+"'where empid ='"+id+"'";;
        Statement st = c.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }
    public static void UpdateContact(int id,int phone) throws SQLException {
        Connection c = Connect.connect();
        String query = "Update Emp SET name = '"+phone+"'where empid ='"+id+"'";;
        Statement st = c.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }
    public static void UpdateSalary(int id,int salary) throws SQLException {
        Connection c = Connect.connect();
        String query = "Update Emp SET name = '"+salary+"'where empid ='"+id+"'";;
        Statement st = c.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }
    public static void UpdateDept(int id,int dept) throws SQLException {
        Connection c = Connect.connect();
        String query = "Update Emp SET name = '"+dept+"'where empid ='"+id+"'";;
        Statement st = c.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }
    public static void UpdateEmail(int id,String email) throws SQLException {
        Connection c = Connect.connect();
        String query = "Update Emp SET name = '"+email+"'where empid ='"+id+"'";;
        Statement st = c.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }

    public static void delete(int id) throws SQLException {
        Connection con = Connect.connect();
        String query = "Delete from emp where empid ='"+id+"'";
        Statement st = con.prepareStatement(query);
        st.executeUpdate(query);
        st.close();
    }
}
