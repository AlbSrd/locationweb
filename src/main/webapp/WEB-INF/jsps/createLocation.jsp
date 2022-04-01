<%--
  Created by IntelliJ IDEA.
  User: alberto
  Date: 01/04/22
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Location</title>
</head>
<body>
<!– il nome assegnato a ciascuna variabile che verrà digitata nei campi deve corrispondere al nome delle variabili
nella entià - classe che si va a popolare così Spring li binda per noi ->
<form action="saveLoc" method="post">
    <pre>
    Id: <input type="text" name="code"/>
    Code: <input type="text" name="name"/>
    Name: <input type="text" name="type"/>
    Type: Urban<input type="radio"/>
    Rural<input type="radio" name="type"/>
    <input type="submit" value="save"/>
    </pre>
</form>

</body>
</html>
