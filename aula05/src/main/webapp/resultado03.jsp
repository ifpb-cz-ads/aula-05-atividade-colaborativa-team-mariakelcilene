<%@ page import="java.util.*" %>

<html>
    <body>
        <div style="text-align: center;">
            <h3> Texto Ou Numero ???</h3>
                <% 
                String textoOuNumero  = (String) request.getAttribute("textoNumero");
                out.print("Resultado : "+ textoOuNumero);
                %>
            <form>
            </div>
    </body>
</html>