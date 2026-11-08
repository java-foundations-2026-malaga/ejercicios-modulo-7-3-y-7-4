# JFo 7.3 y 7.4 - Actividad 12

## Reduce redundancia con this(...)

Haz que el constructor de dos parámetros llame al de tres.

### Detalles

- Crea una clase `static class Light` con los campos `int brightness`, `String color` y `boolean on`.
- Escribe un constructor de tres parámetros `Light(int brightness, String color, boolean on)` y otro de dos parámetros `Light(int brightness, String color)` que llame al primero con `this(brightness, color, false)`.
- Crea la luz 1 con el constructor de dos parámetros (50, "warm") y la luz 2 con el de tres (80, "cool", true) y muestra sus campos con el formato de la salida esperada.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Luz 1: 50, warm, false
Luz 2: 80, cool, true
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad12/Actividad12.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad12Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
