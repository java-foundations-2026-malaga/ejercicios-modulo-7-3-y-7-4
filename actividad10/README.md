# JFo 7.3 y 7.4 - Actividad 10

## Usa this en un constructor

Inicializa correctamente parámetros con el mismo nombre.

### Detalles

- Crea una clase `static class Prisoner` con los campos `name`, `height` y `sentence` y un constructor cuyos parámetros se llamen **igual** que los campos; usa `this` para asignarlos.
- Crea el preso Twitch (1.68, 3) e imprime sus datos con el formato `nombre: altura, condena`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Twitch: 1.68, 3
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad10/Actividad10.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad10Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
