package br.com.java.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet{

    public Login() {
        super();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);

        Connection con;
        int verificar = 1;

        Statement st;

        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java_loja_online_master?useTimezone=true&serverTimezone=UTC", "root", "root");
            st = con.createStatement();

            String usuarioid = "'" + req.getParameter("txtuid")+ "'";
            String password = "'" + req.getParameter("txtpwd")+"'";

            String SQL = "SELECT * FROM usuarios WHERE usuarioid=" + usuarioid+" AND pwd =" + password;

            pw.println(SQL);
            pw.println("Olá");
            pw.println(SQL + " está executando");

            ResultSet rs = st.executeQuery(SQL);

            if (rs == null) {
                pw.println("\nUsuario id inválido");
                verificar = 0;
            }

            SQL = "UPDATE usuarios set usuarios.flag='y' WHERE usuarioid="+ usuarioid;
            int r = st.executeUpdate(SQL);
            pw.println(SQL);
        } catch (ClassNotFoundException e) {
            System.out.println("Em captura1");
        } catch(SQLException e) {
            System.out.println("Em captura2");
        } 
    }
}
