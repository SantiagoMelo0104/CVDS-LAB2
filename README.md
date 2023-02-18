# CVDS-LAB2

# HERRAMIENTA MAVEN

### Mayor utilidad
Esta es una herramienta de software principalmente para crear y administrar proyectos Java. Maven usa un modelo de objeto de proyecto, también conocido como POM, que describe el proyecto que se está construyendo, los componentes externos, el orden en que se construyen los elementos y sus dependencias en otros módulos. En particular, brinda la ventaja de conectarse a su almacenamiento de forma remota para acceder a otras utilidades.
### Fases de Maven
- **Compilar:** Generar archivos .class y compilar el código fuente .java. No termina con un error en alguna clase. 
- **Prueba:** Ejecute pruebas automatizadas JUnit existentes, anule si alguna falla. 
- **Paquete:** Utilice la .clase compilada para generar el .jar. 
- **Install:** Copia el archivo .jar a una carpeta en nuestra máquina para que lo usen otros proyectos en la misma máquina. 
- **Deployment:** Coloca una copia del .jar en el servidor remoto, lo que permite que cualquier otro proyecto de Maven que tenga acceso a ese servidor pueda acceder a él.
### Ciclos de vida de la construcción

- **Default** --> Gestiona construcción y despliegue del proyecto.
- **Clean** --> Gestiona la limpieza del directorio.
- **Site** --> Gestiona la creación de la documentación.

### ¿Para qué sirven los plugins?
Los complementos son componentes de código creados para ampliar la funcionalidad de una herramienta. Su propósito es proporcionar funcionalidad adicional a los programas de computadora.
#### ¿Qué es y para qué sirve el repositorio central de Maven?
Tiene una estructura que permite que los archivos tengan diferentes versiones que son fáciles de descubrir utilizando mecanismos de nomenclatura familiares. Las herramientas de compilación pueden usar estos nombres para extraer dinámicamente las dependencias de la aplicación. En la definición de la aplicación, llamada archivo POM, usando Maven como herramienta de compilación, simplemente nombra las dependencias y el proceso de compilación sabe qué hacer a partir de ahí.

# CREAR UN PROYECTO CON MAVEN
Buscar cómo se crea un proyecto maven con ayuda de los arquetipos(archetypes).
Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype",con los siguientes:\
- parámetros: Grupo: edu.eci.cvds \
- Id del Artefacto: Patterns \
- Paquete: edu.eci.cvds.patterns \
- archetypeArtifactId: maven-archetype-quickstart

![1](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/archetype.png)
Se debió haber creado en el directorio, un nuevo proyecto Patterns a partir de un modelo o arquetipo, que crea un conjunto de directorios con un conjunto de archivos básicos.
Cambie al directorio Patterns:
```
cd Patterns
```
Para ver el conjunto de archivos y directorios creados por elcomando mvn ejecute elcomando tree.
```
tree
```
![2](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/tree.png)
# AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
Hay que cambiar la version delcompilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:\
\<properties>\
<maven.compiler.target>1.8</maven.compiler.target>\
<maven.compiler.source>1.8</maven.compiler.source>\
\</properties>
![3](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/version%201.8.png)

# COMPILAR Y EJECUTAR
Para compilar ejecute elcomando:
```
mvn package
```
Si maven no actualiza las dependencias utilice la opción -U asi:
```
mvn -U package
```
- Busque cuál es el objetivo del parámetro "package" y qué otros parámetrosse podrían enviar alcomando mvn.
  Empaquetar el proyecto que por defecto crea un ejecutable .jar
- Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en
"mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html
```
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"
```
- Buscarcómo enviar parámetros al plugin "exec".
```
mvn exec: exec -Dexec.executable = "maven" [-Dexec.workingdir = "/ tmp"] -Dexec.args = "- X myproject: dist"
```
- Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!
![4](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/helloworld.png)
- Ejecutar la clase con su nombre y apellido como parámetro.¿Qué sucedió?
el "Hello World! cambio a "Hello Santiago"
![5](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/santiago.png)
- Verifique cómo enviar los parámetros de forma "compuesta" para que elsaludo se realice con nombre y apellido.
![6](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/santiagoNaranjo.png)
# HACER EL ESQUELETO DE LA APLICACION
Ejecute múltiples vecesla clase ShapeMain, usando el plugin exec de maven con lossiguientes parámetros y verifique la salida en consola para cada una:
- Sin parámetros
![7](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/shapesMain.png)
- Parámetro: qwerty
![8](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/qwerty.png)
- Parámetro: pentagon
![9](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/pentagon.png)
- Parámetro Hexagon
![10](https://github.com/SantiagoMelo0104/CVDS-LAB2/blob/Master/Capturas%20de%20pantalla/Hexagon.png)
¿Cuál(es) de las anterioresinstruccionesse ejecutan y funcionan correctamente y por qué?\
El parametro "qwerty" no funciona porque no existe ninguna figura con ese nombre\
El parametro "pentagon" no funciona porque esta mal escrito deberia ser "Pentagon"\
El parametro "Hexagon" si funciona porque esta bien escrito y si existen esa figura en el programa


 **GITIGNORE:** Es un archivo .gitignore que permite escribir extensiones de archivo no deseadas (archivos basura) en el repositorio, como .class para algunos proyectos.
