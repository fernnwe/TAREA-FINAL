Sistema de Gestión para Gimnasio
Este proyecto es una aplicación de escritorio para la gestión de un gimnasio, desarrollado en Java utilizando Swing para la interfaz gráfica de usuario (GUI). La aplicación permite registrar clientes, pagos, planes alimenticios y rutinas. Los datos se guardan y cargan desde archivos de forma persistente.

Características del sistema
Registro de Clientes: Permite registrar los datos de los clientes como nombre, cédula, teléfono, correo y dirección.

Registro de Pagos: Los pagos de los clientes se registran con la cédula del cliente, monto y fecha de pago.

Persistencia de Datos: Todos los datos de clientes y pagos se guardan en archivos y se cargan al iniciar la aplicación para mantener la persistencia entre reinicios del programa.

Interfaz Gráfica de Usuario (GUI): Utiliza Swing para crear una interfaz amigable y fácil de usar.

Tecnologías utilizadas
Lenguaje de Programación: Java

Biblioteca de Interfaz Gráfica: Swing

Persistencia de Datos: Archivos binarios (Serialización en Java)

Estructura del Proyecto
El proyecto está dividido en los siguientes paquetes:

models: Contiene las clases que representan los objetos del sistema, como Cliente, Pago, etc.

gui: Contiene las clases que gestionan las interfaces gráficas de la aplicación.

utils: Contiene las clases de utilidad, como FileManager, que maneja la persistencia de datos en archivos.

Instrucciones de uso
Requisitos
Java 8 o superior instalado en tu máquina.

Un editor de código como Visual Studio Code o IntelliJ IDEA.

Instalación
Clona este repositorio en tu máquina local o descarga el código fuente.

Abre el proyecto en tu editor de código favorito.

Asegúrate de tener Java configurado en tu entorno de desarrollo.

Compila y ejecuta el archivo Main.java para iniciar la aplicación.

Ejecución
Para ejecutar la aplicación, simplemente corre la clase Main.java, que inicializa el programa y abre las ventanas para el registro de clientes y pagos.

Uso de la aplicación
Registrar un Cliente: Rellena el formulario con los datos del cliente y haz clic en "Guardar Cliente".

Registrar un Pago: Introduce la cédula del cliente, monto y fecha del pago, luego haz clic en "Registrar Pago".

Los clientes y los pagos se guardan en archivos binarios (clientes.dat y pagos.dat) para que se mantengan entre reinicios del programa.

Estructura de Archivos
clientes.dat: Archivo que contiene los datos de todos los clientes registrados en formato binario.

pagos.dat: Archivo que contiene los pagos registrados de los clientes en formato binario.

Contribuciones
Si deseas contribuir a este proyecto, puedes hacerlo abriendo un issue o enviando un pull request con tus cambios. Asegúrate de seguir las mejores prácticas y mantener el código limpio y bien documentado.

Licencia
Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo LICENSE.