<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Hello World!</h2>
	<h1>Message : ${message}</h1>
	
	<c:forEach items="${ballresults}" var="element">
		<h10>${element.ballScore} ${element.result}</h10>
		<br>
	</c:forEach>
	<br><br><br>
	<c:forEach items="${batresults}" var="element">
		<h10>${element.batScore} ${element.result}</h10>
		<br>
	</c:forEach>
	<br><br><br>
 <!-- 	<c:forEach items="${team1}" var="element">
		<h10>${element.batsmen} ${element.runs}</h10>
		<br>
	</c:forEach>
	<br><br><br>
 	<c:forEach items="${team2}" var="element">
		<h10>${element.batsmen} ${element.runs}</h10>
		<br>
	</c:forEach>  -->
	<h1>bat0 : ${bat0}</h1><br>
	<h1>bat1 : ${bat1}</h1><br>
	<h1>bat2 : ${bat2}</h1><br>
	<h1>bat3 : ${bat3}</h1><br>
	<h1>bat4 : ${bat4}</h1><br>
	<h1>bat5 : ${bat5}</h1><br>
	<br><br><br>
</body>
</html>
