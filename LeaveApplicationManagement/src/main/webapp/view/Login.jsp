<html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>ZX Company</title>

  <body>
    <h1>Welcome to ZX Company</h1>
    <form method="post">
      Enter UserId <input required type="text" name="eid" /><br />
      Enter Password <input required type="text" name="password" /><br />
      <input type="submit" /><br />
    </form>
    <h3>If You Are New To Company Please Signin</h3>
    <a href="signin" target="_blank"> signin </a>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
  </head>

</html>