<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core">

<f:view>
	<head>
		<link href="estilos.css" rel="stylesheet" type="text/css" />
		<f:loadBundle basename="mensajes" var="msjs" />
	</head>
	<body>
		<center>
			<h:panelGroup>
				<h:outputText value="#{msjs.datos}" styleClass="enfasis" />
			</h:panelGroup>
			<h:panelGrid columns="2" cellpadding="1" border="1" width="40%">
				<h:outputText value="#{msjs.sal_nombre}" />
				</td>
				<h:outputText value="#{cuestionario.nombre}" />
				<h:outputText value="#{msjs.sal_correo}" />
				<h:outputText value="#{cuestionario.correo}" />
				<h:outputText value="#{msjs.sal_aficiones}" />
				<h:outputText value="#{cuestionario.listaAficiones}" />
				<h:outputText value="#{msjs.sal_fumador}" />
				</td>
				<h:outputText value="#{cuestionario.fumador}" />
				<h:outputText value="#{msjs.sal_sistema}" />
				<h:outputText value="#{cuestionario.sistema}" />
				<h:outputText value="#{msjs.sal_comidas}" />
				<h:outputText value="#{cuestionario.listaComidas}" />
				<h:outputText value="#{msjs.sal_estado}" />
				<h:outputText value="#{cuestionario.estado}" />
				<h:outputText value="#{msjs.sal_lenguajes}" />
				<h:outputText value="#{cuestionario.listaLenguajes}" />
			</h:panelGrid>
			<br>
			<br>
			<h:form>
				<h:commandButton value="#{msjs.volver}" action="volver" />
			</h:form>
		</center>
	</body>
</f:view>

</html>