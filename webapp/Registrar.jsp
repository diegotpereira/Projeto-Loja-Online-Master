<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" 
    integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
    crossorigin="anonymous">
</head>
<body>
    <script>
        $(function() {
            $('input[name=nascimento]').datepicker();
        });
    </script>
    <table>
        <tr>
            <td>Loja Online</td>

        </tr>
        <tr>
            <td>
                DTP Software
            </td>
        </tr>
    </table>
    <br>
    <u>Formulario de Registro</u>

    <form action="Registrar" method="post">
        <pre>
            <label for="">Usuario id: </label>
            <input type="text" name="uid"><br>
        </pre>
        <pre>
            <label for="">Senha: </label>
            <input type="password" name="pwd" id=""><br>
        </pre>
        <pre>
            <label for="">Pergunta de dica: </label>
            <input type="text" name="dica" id=""><br>
        </pre>
        <pre>
            <label for="">Dica de resposta: </label>
            <input type="text" name="resposta" id=""><br>
        </pre>
        <pre>
            <label for="">Nome: </label>
            <input type="text" name="Pnome" id=""><br>
        </pre>
        <pre>
            <label for="">Sobrenome: </label>
            <input type="text" name="Unome" id=""><br>
        </pre>
        <pre>
            <input type="text" name="nascimento" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${usuario.nascimento}" />" /> <br /> 
        </pre>
        <!-- <pre>
            <label for="">Data de Nascimento: </label>
            <select name="nascimento" id="nascimento">
                <option value="jan">Janeiro</option>
                <option value="fev">Fevereiro</option>
                <option value="mar">Marco</option>
                <option value="abr">Abril</option>
                <option value="mai">Maio</option>
                <option value="jun">Junho</option>
                <option value="jul">Julho</option>
                <option value="ago">Agosto</option>
                <option value="set">Setembro</option>
                <option value="out">Outubro</option>
                <option value="nov">Novembro</option>
                <option value="dez">Dezembro</option>
            </select>
            <select name="dd" id="">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
            </select>
        </pre> -->
        <pre>
            <label for="">Endereço: </label>
            <input type="text" name="endereco" id="">
        </pre>
        <pre>
            <label for="">Cidade: </label>
            <input type="text" name="cidade" id="">
        </pre>
        <pre>
            <label for="">Cep: </label>
            <input type="text" name="cep" id="">
        </pre>
        <pre>
            <label for="">Estado: </label>
            <input type="text" name="estado" id="">
        </pre>
        <pre>
            <label for="">Pais: </label>
            <input type="text" name="pais" id="">
        </pre>
        <pre>
            <label for="">Cartão de Credito Nome: </label>
            <input type="text" name="ccnome" id="">
        </pre>
        <pre>
            <label for="">Cartão de Credito Nº: </label>
            <input type="text" name="ccno" id="">
        </pre>
        <pre>
            <label for="">Email: </label>
            <input type="text" name="email" id="">
        </pre>
        <br><br>
        <input type="submit" name="btn_submit" value="Clique Aqui">
    </form>
</body>
</html>