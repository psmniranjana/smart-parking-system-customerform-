import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

@WebServlet(urlPatterns = {"/FormConfig"})
public class FormConfig extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String nic = request.getParameter("nic");
        String address = request.getParameter("address");
        String regdate = request.getParameter("regdate");
        String v1 = request.getParameter("v1");
        String p1 = request.getParameter("p1");
        String v2 = request.getParameter("v2");
        String p2 = request.getParameter("p2");
        int contact = Integer.parseInt(request.getParameter("number"));
        
        PrintWriter out = response.getWriter();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/park", "root", "");
            Statement st = con.createStatement();
            
            String qry1 = "Insert into customer (id,name,email,nic,address,registered_date,phone_no) values('"+id+"','"+name+"','"+email+"','"+nic+"','"+address+"','"+regdate+"','"+contact+"')"; 
            String qry2 = "Insert into plate (index_num,vehicle_type,license_plate) values('"+id+"','"+v1+"','"+p1+"')";
            
            int i = st.executeUpdate(qry1);
            int j = st.executeUpdate(qry2);
            int k = 0;
            
            if(v2!= null && !p2.isEmpty())
            {
                String qry3 = "Insert into plate (index_num,vehicle_type,license_plate) values('"+id+"','"+v2+"','"+p2+"')";
                k = st.executeUpdate(qry3);          
            }
            
            if(i>0 && j>0 || k>0)
            {
                out.println("Data Inserted");
            }
            
            
        }
        catch(Exception e){
                out.println(e);
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
