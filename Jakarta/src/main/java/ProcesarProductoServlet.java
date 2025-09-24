/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_zorro;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/procesarProducto")
public class ProcesarProductoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener el valor del select
        String productoId = request.getParameter("productoId");

        // Acá tu "programa" puede usar el valor como quiera:
        // - Consultar la BD
        // - Guardar una compra
        // - Mostrar información
        String mensaje = "El producto seleccionado tiene un precio de: " + productoId;

        // Pasar mensaje al JSP de resultado
        request.setAttribute("mensaje", mensaje);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
