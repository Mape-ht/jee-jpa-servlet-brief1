<%@ page isELIgnored = "false" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SenForage</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
	
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
	
	response.setHeader("Expires", "0"); //Proxies
	

	if(session.getAttribute("fname")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>
	
	
	
	<div id="throbber" style="display:none; min-height:120px;"></div>
<div id="noty-holder"></div>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="https://bryanrojasq.wordpress.com">
                <img src="assets/images/h2o-logo.png" alt="LOGO">
            </a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li><a href="#" data-placement="bottom" data-toggle="tooltip" href="#" data-original-title="Stats"><i class="fa fa-bar-chart-o"></i>
                </a>
            </li>            
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Bonjour ${fname} <b class="fa fa-angle-down"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="village.jsp"><i class="fa fa-fw fa-user"></i> Village</a></li>
                    <li><a href="clientPhysique.jsp"><i class="fa fa-fw fa-cog"></i> Client Physique</a></li>
                    <li class="divider"></li>
                    <li>
                    <form action="Logout"><input type="submit" value="Logout"></form>
                    
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li>
                    <a href="#" data-toggle="collapse" data-target="#submenu-1"><i class="fa fa-fw fa-search"></i> Village<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                    
                </li>
                <li>
                    <a href="#" data-toggle="collapse" data-target="#submenu-2"><i class="fa fa-fw fa-star"></i> Client Physique <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                    
                </li>
                
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">
        <div class="container-fluid">
            <!-- Page Heading -->
            <div class="row" id="main" >
                <div class="col-sm-12 col-md-12 well" id="content">
                    <h1>Gestion des villages</h1>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->
    </div>
    <!-- /#page-wrapper -->
</div><!-- /#wrapper -->
	
	

<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</body>
</html>