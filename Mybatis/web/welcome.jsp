<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String path=request.getContextPath(); %>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/main.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dcjqaccordion.2.7.js"></script>
    <link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css">

    <link href="${pageContext.request.contextPath}/css/Font-Awesome/css/font-awesome.css" rel="stylesheet" type="text/css">
    <title>后台管理系统</title>
</head>



<%@ include file="/layout/head.jsp" %>

<div class="container-wrapper">
<div class="container" id="container" style="float: left;">

    <%@ include file="/layout/left-bar.jsp" %>
    <div class="content">



    </div>
    <div style="clear:both"></div>



</div>
</div>

</body>

</html>