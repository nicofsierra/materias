<%@include file='../../includes/head.jsp'%>
<body>
	<%@include file='../../includes/header.jsp'%>
	<nav>
		<div class="navbar navbar-default navbar-custom">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Administracion</a>
				</div>
				<ul class="nav navbar-nav">
					<li><a href="#">Inicio</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Administrar <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="adm-materias">Marcar Aprobadas</a></li>
						<li><a href="#">Materias que Curso</a></li>
					</ul></li>
					<li><a href="#">Ver Disponibles</a></li>
				</ul>
				
			</div>
		</div>
	</nav>
	</header>
	<div class="panel-group">
		<div class="panel panel-default">
			<div class="panel-heading">Bienvenido Nicolás, Materias
				Aprobadas</div>
			<div class="panel-body">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Codigo</th>
							<th scope="col">Nombre</th>
							<th scope="col">Fecha Aprobaci&oacuten</th>
							<th scope="col">A&ntildeo</th>
							<th scope="col">Hs</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${materiasAprobadas}" var="materia">
							<tr>
								<td>${materia.codigo}</td>
								<td>${materia.nombre}</td>
								<td>${materia.fechaAprobacion}</td>
								<td>${materia.anio}</td>
								<td>${materia.cargaHoraria}</td>
							</tr>
						</c:forEach>
					</tbody>

				</table>

				<h5>Cantidad de Materias Aprobadas: ${cantidadAprobadas }</h5>

				<%@include file='../../includes/errorMensaje.jsp'%>
			</div>
		</div>
	</div>
</body>
</html>