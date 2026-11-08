# JFo 7.3 y 7.4 - Constructores y sobrecarga de métodos

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige un constructor con tipo de retorno
02. Corrige un constructor con nombre incorrecto
03. Corrige una llamada a un constructor que ya no existe
04. Corrige una asignación ambigua sin this
05. Corrige una sobrecarga inválida
06. Investiga valores por defecto
07. Provoca y evita un NullPointerException
08. Crea un constructor con argumentos
09. Reemplaza un método setFields por constructor
10. Usa this en un constructor
11. Sobrecarga el constructor de Prisoner
12. Reduce redundancia con this(...) 
13. Sobrecarga un método sum
14. Sobrecarga por tipo y orden de parámetros
15. Diseña un sistema de visualización sobrecargado

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
