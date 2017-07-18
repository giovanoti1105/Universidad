<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core">
<f:view>
	<head>
		<link href="estilos.css" rel="stylesheet" type="text/css" />
		<f:loadBundle basename="mensajes" var="msjs" />
		<title><h:outputText value="#{msjs.titulo}" /></title>
	</head>
	
	<body>
		<center>
			<h:form>
				<h:outputText value="#{msjs.puntue}" styleClass="enfasis" />
				<h:panelGrid columns="2" cellpadding="1" border="1" width="40%">
					<h:outputText value="#{msjs.presentacion}" />
					<h:selectOneRadio>
						<f:selectItem itemValue="Pobre" itemLabel="Pobre" />
						<f:selectItem itemValue="Media" itemLabel="Media" />
						<f:selectItem itemValue="Bunea" itemLabel="Bunea" />
						<f:selectItem itemValue="Excelente" itemLabel="Excelente" />
					</h:selectOneRadio>
					<h:outputText value="#{msjs.variedad}" />
					<h:selectOneRadio>
						<f:selectItem itemValue="Pobre" itemLabel="Pobre" />
						<f:selectItem itemValue="Media" itemLabel="Media" />
						<f:selectItem itemValue="Bunea" itemLabel="Bunea" />
						<f:selectItem itemValue="Excelente" itemLabel="Excelente" />
					</h:selectOneRadio>
					<h:outputText value="#{msjs.tipos}" />
					<h:selectOneRadio>
						<f:selectItem itemValue="Pobre" itemLabel="Pobre" />
						<f:selectItem itemValue="Media" itemLabel="Media" />
						<f:selectItem itemValue="Bunea" itemLabel="Bunea" />
						<f:selectItem itemValue="Excelente" itemLabel="Excelente" />
					</h:selectOneRadio>
					<h:outputText value="#{msjs.estructura}" />
					<h:selectOneRadio>
						<f:selectItem itemValue="Pobre" itemLabel="Pobre" />
						<f:selectItem itemValue="Media" itemLabel="Media" />
						<f:selectItem itemValue="Bunea" itemLabel="Bunea" />
						<f:selectItem itemValue="Excelente" itemLabel="Excelente" />
					</h:selectOneRadio>
				</h:panelGrid>
				<h:commandButton value="#{msjs.terminar}" action="mostrarInformacion" />
			</h:form>
		</center>
	</body>
</f:view>
</html>