<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="header.jsp"%> 
	
	<% 
		String API = request.getParameter("API");
		String downloads = request.getParameter("downloads");
		String products = request.getParameter("products");
		String training = request.getParameter("training");
		String support = request.getParameter("support");
		String about = request.getParameter("about");
		
		if(!API.isEmpty()){
			session.setAttribute("API", API);
			out.print("<h2>API value"
					+API+"</h2>");
			out.print("api value entered");
		}
		else if(!downloads.isEmpty()){
			session.setAttribute("downloads", downloads);
			out.print("<h2>downloads value"
					+downloads+"</h2>");
			out.print("downloads shown");
		}
		else if(!products.isEmpty()){
			session.setAttribute("products", products);
			out.print("<h2>products are"
					+products+"</h2>");
			out.print("products entered");
		}
		else if(!training.isEmpty()){
			session.setAttribute("training", training);
			out.print("<h2> training :"
					+training+"</h2>");
			out.print("training started");
		}
		else if(!support.isEmpty()){
			session.setAttribute("support", support);
			out.print("<h2>for support"
					+support+"</h2>");
			out.print("visit us for support");
		}
		else if(!about.isEmpty()){
			session.setAttribute("about", about);
			out.print("<h2>about us"
					+about+"</h2>");
			out.print("about: xyz");
		}
		
		else{
			response.sendRedirect("error.jsp");
		}
	%>
	
</body>
</html>