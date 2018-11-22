<!DOCTYPE html>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
      <!--Load the AJAX API-->
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

      // Load the Visualization API and the corechart package.
      google.charts.load('current', {'packages':['corechart', 'bar']});
      // Set a callback to run when the Google Visualization API is loaded.
      google.charts.setOnLoadCallback(drawChart);

      // Callback that creates and populates a data table,
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChart() {

        // Create the data table.
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Status Code');
        data.addColumn('number', 'Count');
          
        <c:forEach items="${ResponseCounts}" var="ResponseCount">
           data.addRow(['${ResponseCount.responseCode}',${ResponseCount.codeCount}]);
        </c:forEach>
        // Set chart options
        var options = {
        title: 'Status Code vs Count',
        hAxis: {
          title: 'Status Code'
        },
        vAxis: {
          title: 'Count'
        }
      };

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
        var formatter = new google.visualization.NumberFormat(
        {pattern:'#,###%'});
        formatter.format(data, 1)
        chart.draw(data, options);
      }
    </script>

  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Bootstrap Theme Company Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .jumbotron {
      background-color: #ffffff;
      padding: 100px 25px;
  }
  .container-fluid {
      padding: 60px 50px;
  }
  .bg-grey {
      background-color: #f6f6f6;
  }
  .logo {
      font-size: 200px;
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
  }
  </style>
</head>
<body>
<%
  response.setIntHeader("Refresh", 300); //in your case 60*5=300 (for 5 min)
%>

<!-- Container (About Section) -->
<div class="container-fluid">
  <div class="row">
    <div class="col-sm-8">
      <h2>Counts of non-response, 500, and 200</h2>
    </div>
    <div class="col-sm-4">
     <table class="table">
     <thead>
      <tr>
        <th>Status Codes</th>
        <th>Count</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="ResponseCount" items="${ResponseCounts}">
      <tr>
      <td>${ResponseCount.responseCode}</td>
      <td>${ResponseCount.codeCount}</td>
      <tr>
      </c:forEach>
    </tbody>
  </table>
    </div>
  </div>
</div>

<div class="container-fluid bg-grey">
  <div class="row">
    <div class="col-sm-4">
      <div id="chart_div"></div>
    </div>
    <div class="col-sm-8">
      <h2>Current percentage of failures in the rolling interval</h2>
    </div>
  </div>
</div>

</body>
</html>
