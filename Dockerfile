# Usar la imagen base de OpenJDK 21
FROM alpine/java:21-jdk

# Crear un directorio para la aplicación
RUN mkdir /app

# Establecer el directorio de trabajo
WORKDIR /app
# Copiar el archivo JAR dela aplicación en el contenedor
COPY target/*.jar reactProject-0.0.1.jar

EXPOSE 3050

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "reactProject-0.0.1.jar"]

