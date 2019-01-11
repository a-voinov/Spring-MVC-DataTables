<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Data Tables example</title>
    <!--jQuery Dependency-->
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <!--DataTables Dependencies-->
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <script>
        $(document).ready(function() {
            $('#example').DataTable({
                "processing": true,
                "serverSide": true,
                "ajax": "${pageContext.request.contextPath}/processing/payments",
                columns: [
                    { data: "paymentId" },
                    { data: "customer.firstName" },
                    { data: "customer.lastName" },
                    { data: "amount" },
                    { data: "paymentDate" }
                ]
            });
        } );
    </script>
</head>
<body>

<h2>Payments</h2>

<table id="example" class="display" style="width:100%">
    <thead>
    <tr>
        <th>id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Amount</th>
        <th>Payment Date</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
    <tfoot>
    <tr>
        <th>id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Amount</th>
        <th>Payment Date</th>
    </tr>
    </tfoot>
</table>

<br/><br/>

<p><a href="${pageContext.request.contextPath}/home/"> Much better! Now let's go back...</a></p>

</body>
</html>