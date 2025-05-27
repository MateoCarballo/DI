# Manual de Usuario

![Icono Concesionario](concesionario.ico)

## Introducción

Bienvenido al sistema de gestión de concesionario. Esta aplicación permite administrar clientes, vehículos, usuarios y ventas, así como generar informes y visualizar documentación relevante.

## Instalación

1. Asegúrese de tener **Java** instalado.
2. Ejecute el archivo JAR generado por Maven:

   ```sh
   mvn package
   java -jar target/Concesionario.jar
   ```

3. Configure la base de datos MySQL usando el script `database.sql`.
4. Edite `hibernate.cfg.xml` para ajustar los parámetros de conexión a su base de datos.

## Inicio de Sesión

- Al iniciar la aplicación, aparecerá el diálogo de login (`LoginDialog`).
- Ingrese sus credenciales de usuario.

## Funcionalidades

| Módulo                | Descripción                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| Gestión de Clientes   | Agregar, editar, eliminar y buscar clientes.                                |
| Gestión de Vehículos  | Registrar, modificar, consultar y cambiar estado de vehículos.              |
| Gestión de Ventas     | Registrar ventas, asociar cliente y vehículo, consultar historial.          |
| Gestión de Usuarios   | Acceso restringido, agregar/modificar usuarios y roles.                     |
| Informes y Gráficos   | Generar informes PDF y visualizar gráficos de ventas.                       |
| Documentación         | Acceso al manual y análisis inicial desde la aplicación.                    |

## Documentación

- Desde el panel de documentación, puede visualizar este manual y el análisis inicial.
- También puede abrir los archivos PDF externos de análisis y manual si están disponibles fuera del proyecto.

## Recomendaciones

- Realice copias de seguridad periódicas de la base de datos.
- Mantenga actualizadas las librerías en `src/main/resources/Lib`.

## Contacto y Soporte

Para soporte técnico, contacte al desarrollador o consulte la documentación adicional.

> **Nota:**  
> El manual de usuario en PDF debe estar fuera del archivo del proyecto, pero puede integrarse y visualizarse desde la aplicación en otro formato (Markdown/HTML).