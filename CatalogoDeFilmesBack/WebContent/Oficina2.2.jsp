<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oficina 2.2</title>
</head>
<body>
	<h2> Oficina 2.2 </h2>
		<%
			out.println("No estado Managed, o objeto esta em sincronia com o banco de dados," +
						"qualquer altera��o no seu estado e refletido e salvo logo em " +
						"seguida. Esse status est� atrelado ao EntityManager. Quando a " +
						"cone��o do EntityManager � encerada ou por algum motivo o banco " +
						"de dados � finalizado o objeto entra no estado de Detached, onde " +
						"o objeto ainda tem a persistencia no banco de dados, mas n�o est� " +
						"mais sincronizado, o que faz com que qualquer altera��o no mesmo " +
						"gere um erro. No estado Transient o objeto foi istanciado, mas n�o " +
						"tem persitencia no banco de dados, � necessario fazer uma chamada " +
						"do metodo persist para que ele entre no estado de Manager. Por fim, " +
						"existe o estado Deleted, onde o objeto � removido do banco de dados, " +
						"para tal � necessario que o objeto estaja sincronizado, ou seja, no estado Managed, " +	
						"tamb�m deve-se iniciar uma transa��o com o banco de dados.");
		
		
		%>


</body>
</html>