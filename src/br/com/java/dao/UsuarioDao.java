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

            String SQL = "INSERT INTO usuarios (usuarioid, pwd, dica, resposta, Pnome, Unome, nascimento, endereco, cidade, cep, estado, pais, ccnome, ccno, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setString(1, usuario.getUid());
            ps.setString(2, usuario.getPwd());
            ps.setString(3, usuario.getDica());
            ps.setString(4, usuario.getResposta());
            ps.setString(5, usuario.getPnome());
            ps.setString(6, usuario.getUnome());
            ps.setDate  (7, new java.sql.Date (usuario.getNascimento().getTime()));
            ps.setString(8, usuario.getEndereco());
            ps.setString(9, usuario.getCidade());
            ps.setInt   (10, usuario.getCep());
            ps.setString(11, usuario.getEstado());
            ps.setString(12, usuario.getPais());
            ps.setString(13, usuario.getCcnome());
            ps.setString(14, usuario.getCcno());
            ps.setString(15, usuario.getEmail());
            

            status = ps.executeUpdate();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return status;
    }
}
