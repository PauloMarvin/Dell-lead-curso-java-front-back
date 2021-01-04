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
						"qualquer alteração no seu estado e refletido e salvo logo em " +
						"seguida. Esse status está atrelado ao EntityManager. Quando a " +
						"coneção do EntityManager é encerada ou por algum motivo o banco " +
						"de dados é finalizado o objeto entra no estado de Detached, onde " +
						"o objeto ainda tem a persistencia no banco de dados, mas não está " +
						"mais sincronizado, o que faz com que qualquer alteração no mesmo " +
						"gere um erro. No estado Transient o objeto foi istanciado, mas não " +
						"tem persitencia no banco de dados, é necessario fazer uma chamada " +
						"do metodo persist para que ele entre no estado de Manager. Por fim, " +
						"existe o estado Deleted, onde o objeto é removido do banco de dados, " +
						"para tal é necessario que o objeto estaja sincronizado, ou seja, no estado Managed, " +	
						"também deve-se iniciar uma transação com o banco de dados.");
		
		
		%>


</body>
</html>