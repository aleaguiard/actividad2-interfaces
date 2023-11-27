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
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 59 29" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/8ea5c5c2-619e-495c-994a-261def7c2b0a">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 59 23" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/4324c148-046a-46e2-8a8c-49cdc98951f1">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 59 09" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/cf92795d-2b8b-4861-8ffc-b38f624b6122">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 59 01" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/597ee08c-4e4b-4314-afd3-2424248d9d68">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 58 31" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/e0390464-0510-41ea-ac4e-ebabfa459f35">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 58 18" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/0b2cb305-2d03-484b-b54e-d53adc26eead">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 57 50" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/5f3fa45a-4ba6-46d1-ac98-8527c493e04a">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 57 18" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/a83bb992-4926-4052-b7e0-206d20e366d1">
<img width="250" alt="Captura de pantalla 2023-11-27 a las 16 57 13" src="https://github.com/aleaguiard/actividad2-interfaces/assets/122371223/ef6c7793-0ce7-4ec2-9183-cd2e12b87cd7">




