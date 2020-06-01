<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传案例</title>
</head>
<body>
	<h1>文件上传小例子</h1>
	<form action="http://localhost:8091/file" method="post"
		enctype="multipart/form-data">
		<input type="file" name="image" value="上传图片" />
		<button type="submit">提交</button>
	</form>
</body>
</html>