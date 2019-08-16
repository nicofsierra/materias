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
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Administrar <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Marcar Aprobadas</a></li>
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
			<div class="panel-heading">Bienvenido Nicolás, Administrar
				Materias</div>
			<div class="panel-body">


				<form action="actualizar-materias" method="GET">
					<div class="form-group">
						<label for="sel1">Materia:</label> <select class="form-control"
							id="sel1" name="codigo">
							<c:forEach items="${materias}" var="materia">
								<option value="${materia.codigo}">${materia.nombre }</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio"
							name="aprobada" id="inlineRadio1" value="1">
						<label class="form-check-label" for="inlineRadio1">Aprobada</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio"
							name="aprobada" id="inlineRadio2" value="0">
						<label class="form-check-label" for="inlineRadio2">No Cursada/Desaprobada</label>
					</div>
					<div class="form-group">
						<button class="btn btn-primary" type="submit">Actualizar</button>
					</div>
				</form>

				<%@include file='../../includes/errorMensaje.jsp'%>
			</div>
		</div>
	</div>
</body>
</html>