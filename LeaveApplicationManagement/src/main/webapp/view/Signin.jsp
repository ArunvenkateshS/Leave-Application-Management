<html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>ZX Signin Page</title>

  <body>
    <h1>Welcome to ZX Company</h1>
    <h2>Signin Details</h2>
    <form method="post">
      1. Enter Employee ID <input required type="number" name="eid" /><br />
      2. Enter Employee Name <input required type="text" name="name" /><br />
      3. Enter Employee Mail Id
      <input required type="text" name="email" /><br />
      4. Enter Employee Phone Number
      <input required type="text" name="phoneNumber" /><br />
      5. Enter Employee Address
      <input required type="text" name="address" /><br />
      6. Enter Employee city <input required type="text" name="city" /><br />
      7. Enter Employee state
      <input required type="text" name="state" /><br />
      8. Enter Employee pincode
      <input required type="text" name="pincode" /><br />
      9. Enter Employee password
      <input required type="text" name="password" /><br />
      <input type="submit" /><br />
    </form>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
  </head>

</html>