# JFo 7.3 y 7.4 - Actividad 11

## Sobrecarga el constructor de Prisoner

Ofrece constructor vacío y constructor con argumentos.

### Detalles

- Crea una clase `static class Prisoner` con los campos `name` (String), `height` (double) y `sentence` (int).
- Escribe dos constructores: uno vacío `Prisoner()` y otro `Prisoner(String name, double height, int sentence)`.
- Crea un preso con cada constructor (el completo con Bubba, 1.75, 4) y muestra sus campos con el formato de la salida esperada.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Por defecto: null, 0.0, 0
Completo: Bubba, 1.75, 4
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad11/Actividad11.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad11Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
