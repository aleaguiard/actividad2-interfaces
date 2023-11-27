# AE2: Aplicación de gestión de contactos con Java Swing
Desarrollo de Interfaces.

Realizada por:
Alberto Arroyo Santofimia

**Aplicación de contactos con Java Swing**


![Imagen](imgReadme/image1.png)
![Imagen](imgReadme/image2.png)

La aplicación tiene un background gradiente que pasa entre dos colores

Se ha cambiado el nombre y el icono que aparece en la aplicación y la
barra de tareas de Windows

![Imagen](imgReadme/image3.png)

![Imagen](imgReadme/image4.png)

He añadido una fuente externa para poner el titulas de los contactos

![Imagen](imgReadme/image5.png)

Iconos vectoriales usando svg importando la librería externa FlatLaf
library

<https://github.com/JFormDesigner/FlatLaf>

![Imagen](imgReadme/image6.png)
![Imagen](imgReadme/image7.png)

Podemos poner la aplicación son sonido o sin sonido pulsando sobre la
imagen, se cambiará automáticamente y desactiva o activa el sonido según
corresponda

![Imagen](imgReadme/image8.png)

![Imagen](imgReadme/image9.png)

Se ha cambiado el fondo de los botones a blanco, quitado el sombreado y
cambiada la fuente original.

![Imagen](imgReadme/image10.png)

Al posicionarse sobre los botones se sombreará a gris y cambiará el
cursor del ratón

![Imagen](imgReadme/image11.png)

Y sobre los iconos de ordenar alfabéticamente y sonido, que son imágenes
svg al posicionarse sobre ellos hago que aparezca el fondo del botón
para que se note que son botones tambien y cambio el cursor del ratón.

![Imagen](imgReadme/image12.png)

![Imagen](imgReadme/image13.png)

**1º Opción añadir contacto**

![Imagen](imgReadme/image14.png)

Desplegara la ventana secundaria

![Imagen](imgReadme/image15.png)

Respecto a la ventana principal se cambia el icono y el nombre

![Imagen](imgReadme/image16.png)

Botones de ok y cancel reemplazados por imágenes svg

![Imagen](imgReadme/image17.png)

En el campo nombre solo se acepta el abecedario, vocales con acento y el
espacio, si no, no se consume nada en la caja, lo he bloqueado

![Imagen](imgReadme/image18.png)

Y en la caja del teléfono solo se aceptan 9 números, no se pueden meter
más, todos los números españoles tienen 9 dígitos

![Imagen](imgReadme/image19.png)

Como requisito, ninguno de los dos campos puede estar vacío para poder
añadirse a la agenda de contactos

Si se deja el campo nombre vacío

![Imagen](imgReadme/image20.png)

Si se deja el campo teléfono vacío

![Imagen](imgReadme/image21.png)

Si el teléfono no tiene nueve dígitos

![Imagen](imgReadme/image22.png)

Si los dos campos están correctos en nombre se añade

![Imagen](imgReadme/image23.png)

**2º Opción editar contacto**

![Imagen](imgReadme/image24.png)

Si no seleccionamos ningún contacto a editar

![Imagen](imgReadme/image25.png)

Seleccionamos el contacto a editar y pulsamos en editar contacto,
aparecen los datos del contacto.

![Imagen](imgReadme/image26.png)

Se ha cambiado el nombre de la pestaña y el icono respecto a añadir
contacto

![Imagen](imgReadme/image27.png)

Si se edita el nombre y se dejan vacíos o el teléfono no tiene nueve
dígitos saltan los mismos avisos que al añadir contacto

![Imagen](imgReadme/image28.png)

![Imagen](imgReadme/image29.png)

![Imagen](imgReadme/image30.png)


**3º Opción eliminar contacto**

![Imagen](imgReadme/image32.png)

Si no se selecciona contacto a eliminar

![Imagen](imgReadme/image33.png)

![Imagen](imgReadme/image34.png)

Elimino contacto Alberto

![Imagen](imgReadme/image35.png)

**4º Opción guardar**

![Imagen](imgReadme/image36.png)

![Imagen](imgReadme/image37.png)

Cuando tenemos los contactos en la agenda le damos a guardar, utilicé
JFileChooser Java Swing y lo guardo en un txt.

Cambia el título de la ventana

![Imagen](imgReadme/image38.png)

![Imagen](imgReadme/image39.png)

![Imagen](imgReadme/image40.png)

**5º Opción cargar**

![Imagen](imgReadme/image41.png)

Utilicé JFileChooser Java Swing

![Imagen](imgReadme/image42.png)

Se cambia el título de la ventana

![Imagen](imgReadme/image43.png)

Selecciono el archivo creado anteriormente

![Imagen](imgReadme/image44.png)

![Imagen](imgReadme/image45.png)

Aparecen los datos en la tabla

![Imagen](imgReadme/image46.png)

**5º Opción ordenar tabla alfabéticamente**

![Imagen](imgReadme/image47.png)

Hacer clic sobre el icono y se ordenan alfabéticamente

![Imagen](imgReadme/image48.png)
