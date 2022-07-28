package br.com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.com.java.model.Usuario;

public class UsuarioDao {
    
    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/db_java_loja_online_master?" +
            "user=root&password=root");

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return con;
    }
    public static int salvar(Usuario usuario) {

        int status = 0;

        try {
            Connection con = UsuarioDao.getConnection();

            String SQL = "INSERT INTO usuarios (usuarioid, pwd, dica, resposta, Pnome, Unome, endereco, cidade, cep, estado, pais, ccnome, ccno, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setString(1, usuario.getUid());
            ps.setString(2, usuario.getPwd());
            ps.setString(3, usuario.getDica());
            ps.setString(4, usuario.getResposta());
            ps.setString(5, usuario.getPnome());
            ps.setString(6, usuario.getUnome());
            // ps.setDate  (7, usuario.getNascimento());
            ps.setString(7, usuario.getEndereco());
            ps.setString(8, usuario.getCidade());
            ps.setInt   (9, usuario.getCep());
            ps.setString(10, usuario.getEstado());
            ps.setString(11, usuario.getPais());
            ps.setString(12, usuario.getCcnome());
            ps.setString(13, usuario.getCcno());
            ps.setString(14, usuario.getEmail());
            

            status = ps.executeUpdate();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return status;
    }
}
