<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Hello World!</h2>
	<h1>Message : ${message}</h1>

	<h1>Ball Results</h1>
 	<c:forEach items="${BallResults}" var="element">
		<h10>${element.ballScore} ${element.result}</h10>
		<br>
	</c:forEach>
	<br>
	<br>
	<br>
	<h1>Bat Results</h1>
	<c:forEach items="${BatResults}" var="element">
		<h10>${element.batScore} ${element.result}</h10>
		<br>
	</c:forEach>
	<br>
	<br>
	<br>
	<h1>Team1</h1>
	<c:forEach items="${Team1}" var="element">
		<h10>${element.batsmen} ${element.runs}</h10>
		<br>
	</c:forEach>
	<br>
	<br>
	<br>
		<h1>Team2</h1>
	<c:forEach items="${Team2}" var="element">
		<h10>${element.batsmen} ${element.runs}</h10>
		<br>
	</c:forEach>
	
</body>
</html>
