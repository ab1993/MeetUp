<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<form id="sampleForm" method="post" action="/profile">
     <div>
         <input type="text" name="firstname" id="firstname">
     </div>
     <div>
         <input type="text" name="lastname" id="lastname">
     </div>
     <div>
         <button type="submit" name="submit">Submit</button>
     </div>
</form>
<script type="text/javascript">
$(document).ready(function() {
	$('#sampleForm').submit(
		function(event) {
			var firstname = $('#firstname').val();
			var lastname = $('#lastname').val();				
			var data = 'firstname='
					+ encodeURIComponent(firstname)
					+ '&lastname='
					+ encodeURIComponent(lastname);
			$.ajax({
				url : $("#sampleForm").attr("action"),
				data : data,
				type : "GET",

				success : function(response) {
					alert( response );
				},
				error : function(xhr, status, error) {
					alert(xhr.responseText);
				}
			});
			return false;
		});
	});
</script>
</body>
</html>