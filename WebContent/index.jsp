<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head><title>Autonomic Systems Fileserver</title></head>
  <body>
    <p>${currentTime}</p>
    
    <p>
    	<a href="/fileserver/list">List</a>
    </p>
    
    
   	<h2>Active Servers</h2>
   	<table>
   		<tr>
   			<th>Server Name</th>
   			<th>Any other info?</th>
   		</tr>
 		
 		<c:forEach items="${serverList}" var="server">
   			<tr>
   				<td><c:out value="${server}"/></td>
   				<td>...</td>
   			</tr>
		</c:forEach>
	</table>
	
 </body>
</html>