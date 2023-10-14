<!DOCTYPE html>
<html lang="en">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>${eid} UsersPage</title>
  </head>

  <body>
    Name : ${name}<br />
    Mail : ${mail}<br />
    Phone Number : ${number}<br />
    Address : ${address}<br />
    City : ${city}<br>
    To Apply Any Kind Of Leave ---- >
    <a href="Leaveform" target="_blank">Click Here</a>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>

</html>