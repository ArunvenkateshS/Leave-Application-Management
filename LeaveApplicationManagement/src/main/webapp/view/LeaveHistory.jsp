<!DOCTYPE html>
<html lang="en">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Leave History</title>
    </head>

    <body>

        <h2>Employee ${eid} Leave History</h2><br>
        <table class="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Employee id</th>
                    <th>Leave Type</th>
                    <th>Number of leave</th>
                    <th>Reason</th>
                    <th>Balance Leave</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${History}" var="Leave">
                    <tr>
                        <td>${Leave.id}</td>
                        <td>${Leave.eid}</td>
                        <td>${Leave.leaveType}</td>
                        <td>${Leave.noOfLeave}</td>
                        <td>${Leave.reason}</td>
                        <td>${Leave.balanceLeave}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="remaining">
            <b> Available Casual Leave = ${cl} ,
                Available Sick Leave = ${ml} ,
                Available Earned Leave = ${el}</b>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>

</html>