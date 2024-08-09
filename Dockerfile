# Usar la imagen base de OpenJDK 17
FROM openjdk:21-jdk-slim

# Crear un directorio para la aplicación
RUN mkdir /app

# Copiar el archivo JAR dela aplicación en el contenedor
COPY target/reactProject-0.0.1.jar /app/reactProject-0.0.1.jar

# Establecer el directorio de trabajo
WORKDIR /app

EXPOSE 3050
# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "reactProject-0.0.1.jar"]

