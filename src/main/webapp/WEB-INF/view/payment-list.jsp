<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>List payments</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>Payments</h2>
    </div>
</div>

<div id="container">
    <div id="content">
        <table>
            <thead>
            <th>id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Amount</th>
            <th>Payment Date</th>
            </thead>
            <tbody>
            <c:forEach var="payment" items="${payments}">
                <tr>
                    <td>${payment.paymentId}</td>
                    <td>${payment.getCustomer().getFirstName()}</td>
                    <td>${payment.getCustomer().getLastName()}</td>
                    <td>${payment.amount}</td>
                    <td>${payment.paymentDate}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<p><a href="${pageContext.request.contextPath}/home/"> Ouch! That's pretty bad! Now let's go back...</a></p>

</body>
</html>