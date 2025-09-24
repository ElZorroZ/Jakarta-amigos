<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<html>
<body>
    <form action="procesarProducto" method="post">
        <label>Seleccione un producto:</label>
        <select name="productoId">
            <%
                List<String[]> productos = (List<String[]>) request.getAttribute("productos");
                for (String[] p : productos) {
            %>
                <option value="<%= p[2] %>"><%= p[1] %></option>
            <% } %>
        </select>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
