# actividad2-interfaces

## **Proyecto Agenda de Contactos**

Este proyecto es una aplicación simple de una agenda de contactos desarrollada en Java con interfaz gráfica utilizando Swing. Permite añadir, editar y eliminar contactos, mostrando la información en una tabla.

## **Requisitos para ejecutar el código**

Antes de ejecutar el código, asegúrate de tener configurado correctamente tu entorno de desarrollo Java. Además, ten en cuenta las siguientes consideraciones para la ejecución en diferentes sistemas operativos:

### **Para usuarios de Windows**

Descomenta la siguiente línea en el constructor de la clase `Vista`:
```java
//setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/contacts.png")));

Comenta las dos líneas siguientes relacionadas con la versión para Mac:
// Taskbar taskbar = Taskbar.getTaskbar();
// taskbar.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/contacts.png")));
```

### **Para usuarios de Mac**

Descomenta las líneas relacionadas con la versión para Mac en el constructor de la clase `Vista`:
```java
// Taskbar taskbar = Taskbar.getTaskbar();
// taskbar.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/contacts.png")));

Y comenta la línea relacionada con la versión para Windows:
// setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/contacts.png")));
```
### **Estructura del Proyecto**

El proyecto consta de tres paquetes:

`vista`: Contiene la interfaz gráfica de la aplicación (Vista y VentanaAuxiliar).

`controlador`: Contiene la lógica de control de la aplicación (Controlador y Main).

`images`: Contiene las imágenes utilizadas en la interfaz.

### **Ejecución del Proyecto**
Para ejecutar el proyecto, simplemente ejecuta la clase Main ubicada en el paquete controlador. Esto iniciará la aplicación y mostrará la interfaz de la agenda de contactos.

### **Imágenes del Proyecto**




