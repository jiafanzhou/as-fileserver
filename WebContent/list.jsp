<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head><title>Autonomic Systems Fileserver</title></head>
  <body>
    <p>${currentTime}</p>
    
    <p>
    	<a href="/fileserver/">Welcome</a>
    </p>

   	<h2>File List</h2>
   	<table>
   	   	<tr>
   			<th>File Name</th>
   			<th>Size</th>
   			<th>Created</th>
   			<th>Last Updated</th>
   		</tr>
 		<c:forEach items="${fileList}" var="file">
   			<tr>
   				<td><c:out value="${file.name}"/></td>
   				<td><c:out value="${file.bytes}"/></td>
   				<td><c:out value="${file.created}"/></td>
   				<td><c:out value="${file.lastUpdated}"/></td>
   			</tr>
		</c:forEach>
	</table>

  </body>
</html>