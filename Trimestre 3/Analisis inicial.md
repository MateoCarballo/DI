# 🚗 Análisis Inicial

![Logo Concesionario](coche.png)

## 📋 Descripción General

Este proyecto es una aplicación de escritorio para la **gestión de un concesionario de vehículos**. Permite administrar clientes, vehículos, usuarios, ventas y generar informes, integrando funcionalidades de base de datos y reportes.

---

## 🎯 Objetivos

- Facilitar la gestión integral de un concesionario.
- Permitir el registro, consulta y edición de clientes, vehículos y ventas.
- Gestionar usuarios con diferentes roles.
- Generar informes y reportes visuales.
- Integrar documentación y manual de usuario accesibles desde la aplicación.

---

## 🛠️ Funcionalidades Principales

| Módulo                | Descripción                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| Gestión de Clientes   | Alta, baja, modificación y consulta de clientes.                            |
| Gestión de Vehículos  | Registro, edición, consulta y estado de vehículos.                          |
| Gestión de Ventas     | Registro de ventas, asociación de clientes y vehículos.                     |
| Gestión de Usuarios   | Control de acceso y roles.                                                  |
| Informes y Reportes   | Generación de informes con JasperReports.                                   |
| Documentación         | Acceso a análisis inicial y manual de usuario desde la interfaz.            |
| Gráficos de Ventas    | Visualización gráfica de datos de ventas.                                   |

---

## 🏗️ Estructura Técnica

- **Lenguaje:** `Java`
- **Frameworks/Librerías:** `JasperReports`, `Hibernate`, `MySQL Connector`, `Joda-Time`, `Spring Core`
- **Interfaz:** Swing (`src/main/java/com/concesionario/ui`)
- **Persistencia:** Hibernate + MySQL
- **Reportes:** JasperReports (`src/main/java/reports`)
- **Recursos:** Imágenes, SQL, configuración Hibernate, documentación Markdown

```
src/
├── main/
│   ├── java/
│   │   └── com/concesionario/
│   │       ├── dao/
│   │       ├── model/
│   │       ├── ui/
│   │       └── util/
│   └── resources/
│       ├── Analisis inicial.md
│       ├── Manual de usuario.md
│       ├── coche.png
│       ├── database.sql
│       └── Lib/
```

---

## 📄 Integración de Documentos

- El archivo PDF de análisis inicial debe estar **fuera** del archivo del proyecto, pero también puede integrarse en la aplicación para su visualización desde el panel de documentación.
- El manual de usuario también debe estar **fuera** del archivo del proyecto, pero puede integrarse y visualizarse desde la aplicación en otro formato (por ejemplo, Markdown convertido a HTML).

---

## ℹ️ Notas

- La documentación integrada se encuentra en [`src/main/resources/Analisis inicial.md`](Analisis%20inicial.md) y [`Manual de usuario.md`](Manual%20de%20usuario.md).
- Los archivos PDF externos pueden ser seleccionados y visualizados desde la aplicación mediante el panel de documentación.

---