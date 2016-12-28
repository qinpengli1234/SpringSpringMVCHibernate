<html>
<body>

<a href="${pageContext.request.contextPath}/demo/showDeptById.do?id=1">showDeptById</a>
<br>

<form action="${pageContext.request.contextPath}/demo/add.do" method="post">
    <input type="text" name="deptno"><br>
    <input type="text" name="dname"><br>
    <input type="text" name="loc"><br>
    <input type="submit" value="saveDept">
</form>

<br>
${res}

</body>
</html>
