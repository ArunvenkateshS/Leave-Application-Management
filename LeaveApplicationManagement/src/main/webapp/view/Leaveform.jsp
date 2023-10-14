<!DOCTYPE html>
<html lang="en">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Leave Form</title>
    </head>

    <body>
        <form method="post">
            Enter The Employee Id = ${eid}<br>
            <label>The Leave Type </label>
            <select name="leaveType">
                <option value="None">None</option>
                <option value='Casual Leave'>Casual Leave</option>
                <option value="Sick Leave">Sick Leave</option>
                <option value="Earned Leave">Earned Leave</option>
            </select><br />
            Enter The Number Of Leave <input required type="number" name="noOfLeave"><br />
            Enter The Reason <input required type="text" name="reason" /><br />
            Available Casual Leave = ${cl} ,
            Available Sick Leave = ${ml} ,
            Available Earned Leave = ${el} <br>
            <input type="submit" /><br />
            <br>
            <b>Employee ${eid} Leave <a href="LeaveHistory" target="_blank">History</a></b>
        </form>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>

</html>