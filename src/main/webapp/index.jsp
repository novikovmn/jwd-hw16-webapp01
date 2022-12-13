<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>

	<h1>Please, enter your data:</h1>
		
	<form action="register" method="post" >
	
		<label>Name: </label>
		<input type="text" name="firstName" />
		
		<br>
		<br>
		
		<label>Last name: </label>
		<input type="text" name="lastName" />
		
		<br>
		<br>
		
		<label>Age: </label>
		<input type="text" name="age" />
		
		<br>
		<br>
		
		<label>Country: </label>
		<select name="country">
			<option>Belarus</option>
			<option>Denmark</option>
			<option>USA</option>
			<option>China</option>
			<option>Japan</option>
			<option>France</option>
		</select>
		
		<br>
		<br>
		
		<label>Languages: </label>
		<input type="checkbox" name="languages" value="Java">Java
		<input type="checkbox" name="languages" value="Go">Go
		<input type="checkbox" name="languages" value="Python">Python
		<input type="checkbox" name="languages" value="Rust">Rust
		<input type="checkbox" name="languages" value="Ruby">Ruby
		<input type="checkbox" name="languages" value="C">C	
		
		<br>
		<br>
			
		<input type="submit" value="SEND" />	
		
		
	</form>

</body>
</html>