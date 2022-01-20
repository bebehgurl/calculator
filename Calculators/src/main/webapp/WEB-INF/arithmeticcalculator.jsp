<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
            <form action="arithmetic" method="post">
                <label for="first">First: </label>
                <input type="number" name="first" id="first"><br>
                <label for="second">Second: </label>
                <input type="number" name="second" id="second"> <br>

                <button type="Submit" value="plus" name="math" id="plus">+</button>
                <button type="Submit" value="minus" name="math" id="minus">-</button>
                <button type="Submit" value="multi" name="math" id="multi">*</button>
                <button type="Submit" value="divi" name="math" id="divi">%</button>
            </form>
        
        <p>Result: ${result}</p>
        
        <a href="ages">Age Calculator</a>
    </body>
</html>
