package br.com.java.servlet;

import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.*;
import javax.servlet.http.*;

import br.com.java.dao.UsuarioDao;
import br.com.java.model.Usuario;

import javax.servlet.annotation.WebServlet;

@WebServlet("/Registrar")  
public class Registrar extends HttpServlet{


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);

        resp.setContentType("text/hmtl");
        PrintWriter out = resp.getWriter();

        String uid = req.getParameter("uid");
        String pwd = req.getParameter("pwd");
        String dica = req.getParameter("dica");
        String resposta = req.getParameter("resposta");
        String Pnome = req.getParameter("Pnome");
        String Unome = req.getParameter("Unome");
        
        // Date nascimento = (Date) Calendar.getInstance().getTime();
        // DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        // String strDate = dateFormat.format(nascimento);
        // strDate = req.getParameter("nascimento");
        // String nascimento = req.getParameter("nascimento");

        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // String aniversario = sdf.parse(nascimento).getTime();

        // String dataEmTexto = req.getParameter("nascimento");
        // Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);

        
        String endereco = req.getParameter("endereco");
        String cidade = req.getParameter("cidade");
        int cep = Integer.parseInt(req.getParameter("cep"));
        String estado = req.getParameter("estado");
        String pais = req.getParameter("pais");
        String ccnome = req.getParameter("ccnome");
        String ccno = req.getParameter("ccno");
        String email = req.getParameter("email");

        Usuario usuario = new Usuario();
        usuario.setUid(uid);
        usuario.setPwd(pwd);
        usuario.setDica(dica);
        usuario.setResposta(resposta);
        usuario.setPnome(Pnome);
        usuario.setUnome(Unome);
        // usuario.setNascimento(aniversario);
        usuario.setEndereco(endereco);
        usuario.setCidade(cidade);
        usuario.setCep(cep);
        usuario.setEstado(estado);
        usuario.setPais(pais);
        usuario.setCcnome(ccnome);
        usuario.setCcno(ccno);
        usuario.setEmail(email);

        int status = UsuarioDao.salvar(usuario);

        if (status > 0) {
            
            out.print("<p>Grava��o realizada com sucesso!</p>");  
        } else {

            out.println("Desculpe! não foi possível salvar o registro");  
        }
    }
}
