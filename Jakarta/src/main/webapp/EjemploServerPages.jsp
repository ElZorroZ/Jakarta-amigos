<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo JSP con formulario</title>
</head>
<body>
    <h1>Ejemplo Jakarta Server Pages</h1>
    
    <form action="EjemploServerPages.jsp" method="get">
        <label for="nombre">Escribí tu nombre:</label>
        <input type="text" id="nombre" name="nombre">
        <button type="submit">Enviar</button>
    </form>

    <hr>
    
    <%
        String nombre = request.getParameter("nombre");
        if (nombre != null && !nombre.isEmpty()) {
    %>
        <p>Bienvenido, <b><%= nombre %></b></p>
    <%
        }
    %>
</body>
</html>



