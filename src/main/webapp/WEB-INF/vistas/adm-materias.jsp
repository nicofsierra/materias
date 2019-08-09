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
					<li><a href="index">Inicio</a></li>
				</ul>
				<ul class="nav navbar-nav">
					<li><a href="#">Marcar Aprobadas</a></li>
				</ul>
				<ul class="nav navbar-nav">
					<li><a href="#">Ver Disponibles</a></li>
				</ul>
			</div>
		</div>
	</nav>
	</header>
	<div class="panel-group">
		<div class="panel panel-default">
			<div class="panel-heading">Bienvenido Nicolás, Administrar
				Materias</div>
			<div class="panel-body">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Codigo</th>
							<th scope="col">Nombre</th>
							<th scope="col">Fecha Aprobaci&oacuten</th>
							<th scope="col">A&ntildeo</th>
							<th scope="col">Hs</th>
							<th scope="col">Aprobada</th>
							<th scope="col">Cursando</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${materias}" var="materia">
							<tr>
								<td>${materia.codigo}</td>
								<td>${materia.nombre}</td>
								<td>${materia.fechaAprobacion}</td>
								<td>${materia.anio}</td>
								<td>${materia.cargaHoraria}</td>
								<td><div class="form-check">
										<c:if test="${materia.aprobada eq true}"> 
										<input type="checkbox" class="form-check-input"
											id="exampleCheck1" checked> </c:if>
										<c:if test="${materia.aprobada eq false }">
										<input type="checkbox" class="form-check-input"
											id="exampleCheck1"> </c:if>
									</div></td>
								<td><div class="form-check">
										<input type="checkbox" class="form-check-input"
											id="exampleCheck2"> 
									</div></td>	
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