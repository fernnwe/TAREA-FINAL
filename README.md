📌 Sistema de Gestión para Gimnasio
Una aplicación de escritorio desarrollada en Java utilizando Swing para la interfaz gráfica. Este sistema permite registrar clientes, gestionar pagos, planes alimenticios y rutinas, todo con una interfaz fácil de usar. Además, cuenta con persistencia de datos utilizando archivos binarios, lo que permite mantener la información entre sesiones.

🌟 Características del Sistema
- Gestión de Clientes: Permite registrar clientes con datos como nombre, cédula, teléfono, correo y dirección.
- Gestión de Pagos: Registra los pagos de los clientes, incluyendo el monto y la fecha del pago.
- Planes Alimenticios y Rutinas: En desarrollo, permitirá gestionar los planes y rutinas de los clientes.
- Persistencia de Datos: Utiliza archivos binarios (clientes.dat y pagos.dat) para almacenar y recuperar los datos.
- Interfaz Gráfica de Usuario (GUI): Construida con Swing, moderna y funcional.

- 🛠️ Tecnologías Utilizadas
- Java 8+: Lenguaje principal utilizado.
- Swing: Para la construcción de interfaces gráficas de usuario.
- Serialización de Archivos Binarios: Guarda los datos en archivos (clientes.dat y pagos.dat).
- Git & GitHub: Para control de versiones y colaboración en el proyecto.


📦 Estructura del Proyecto
El proyecto está organizado en los siguientes paquetes y clases:
🔹 models (Clases de los objetos del sistema)
- Cliente.java: Define los atributos de un cliente del gimnasio.
- Pago.java: Define los atributos de un pago realizado por un cliente.
🔹 gui (Interfaces gráficas)
- ClienteForm.java: Formulario para registrar clientes.
- PagosForm.java: Formulario para registrar pagos de clientes.
- Main.java: Clase principal que ejecuta la aplicación.
🔹 utils (Utilidades del sistema)
- FileManager.java: Maneja la lectura y escritura de archivos binarios para persistir los datos.

- 
📋 Instrucciones de Instalación
1️⃣ Clonar el repositorio
Si aún no tienes el repositorio, clónalo en tu máquina local:
git clone https://github.com/tuusuario/gimnasio.git


2️⃣ Abrir en un IDE
Abre el proyecto en tu editor o IDE favorito como Visual Studio Code, IntelliJ IDEA o Eclipse.
3️⃣ Compilar y Ejecutar
Asegúrate de tener Java 8 o superior instalado en tu máquina. Luego, compila y ejecuta el proyecto desde la clase Main.java:
java Main.java


🚀 Uso de la Aplicación
✔️ Registrar un Cliente
- Abre el formulario de registro de clientes.
- Rellena los campos con la información del cliente.
- Haz clic en el botón "Guardar Cliente" para añadirlo a la lista.
- Los clientes se guardan en el archivo clientes.dat para persistencia.
- 
✔️ Registrar un Pago
- Accede al formulario de pagos.
- Introduce la cédula del cliente, monto y fecha del pago.
- Haz clic en el botón "Registrar Pago" para guardar el pago.
- Los pagos se guardan en el archivo pagos.dat.
✔️ Ver Datos Guardados
Los datos de clientes y pagos se almacenan en los archivos clientes.dat y pagos.dat. Estos archivos se cargan automáticamente al iniciar la aplicación, mostrando la información registrada previamente.

🔧 Contribuciones
¡Las contribuciones son bienvenidas! Sigue estos pasos para colaborar en el proyecto:
- Haz un fork del repositorio.
- Crea una nueva rama:
git checkout -b feature-nueva-funcionalidad
- Realiza tus cambios y haz commit:
git commit -am "Añadir nueva funcionalidad"
- Sube tu rama:
git push origin feature-nueva-funcionalidad
- Crea un Pull Request describiendo tus cambios.

- 
📄 Licencia
Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo LICENSE.
📚 Documentación y Recursos
- Swing (Java GUI)
- Java Serialización
- Guía de Git & GitHub

