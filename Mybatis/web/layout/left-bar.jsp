<%--
  Created by IntelliJ IDEA.
  User: icepoint
  Date: 8/18/15
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--获取当前web路径--%>
<%
  String realPath1 = "http://" + request.getServerName()
          + ":" + request.getServerPort() +
          request.getContextPath()+request.getServletPath().substring(0,request.getServletPath().lastIndexOf("/"));%>
  <div id="sidebar"  class="nav-collapse ">
    <%if (realPath1.equals("http://localhost:8080/book_view")){ %><%}%>
    <!-- sidebar menu start-->
    <ul class="sidebar-menu" id="nav-accordion">

      <p class="centered"><a href="#"><img src="${pageContext.request.contextPath}/img/cat_logo.png" class="img-circle" width="60"/></a></p>
      <h5 class="centered">${user.name}</h5>

      <li class="mt">
        <a  href="/index">
          <i class="fa fa-dashboard"></i>
          <span>首页</span>
        </a>
      </li>

      <li class="sub-menu">
        <a href="javascript:;" >
          <i class="fa fa-desktop"></i>
          <span>读者管理</span>
        </a>
        <ul class="sub">
          <li><a  href="/reader_type">读者类型管理</a></li>
          <li><a  href="/reader_profile">读者档案管理</a></li>
          <li><a  href="/reader_count">读者统计</a></li>
        </ul>
      </li>

      <li class="sub-menu">
        <a href="javascript:;" >
          <i class="fa fa-cogs"></i>
          <span>图书管理</span>
        </a>
        <ul class="sub">
          <li><a  href="/book_type">类型管理</a></li>
          <li><a  href="/book_profile">档案管理</a></li>

        </ul>
      </li>
      <li class="sub-menu">
        <a   href="javascript:;" >
          <i class="fa fa-cogs"></i>
          <span>借阅管理</span>
        </a>
        <ul class="sub">
          <li><a  href="/borrow_books">图书借阅</a></li>
          <li><a  href="/return_books">图书归还</a></li>

        </ul>
      </li>
      <li class="sub-menu">
        <a href="javascript:;" >
          <i class="fa fa-book"></i>
          <span>排行榜</span>
        </a>
        <ul class="sub">
          <li><a  href="top_books">图书借阅排行</a></li>
          <li><a  href="top_readers">读者借阅排行</a></li>

        </ul>
      </li>
      <li class="sub-menu">
        <a href="javascript:;" >
          <i class=" fa fa-bar-chart-o"></i>
          <span>系统管理</span>
        </a>
        <ul class="sub">
          <li><a  href="/search_borrow">图书借阅查询</a></li>
          <li><a  href="/search_book">图书档案查询</a></li>
        </ul>
      </li>

      <li class="sub-menu">
        <a href="javascript:;" >
          <i class=" fa fa-bar-chart-o"></i>
          <span>权限管理</span>
        </a>
        <ul class="sub">

          <li><a  href="/student">学生权限</a></li>
        </ul>
      </li>

    </ul>
    <!-- sidebar menu end-->
  </div>

