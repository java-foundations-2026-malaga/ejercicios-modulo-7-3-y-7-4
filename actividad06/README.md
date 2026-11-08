# JFo 7.3 y 7.4 - Actividad 06

## Investiga valores por defecto

Imprime campos no inicializados de un objeto.

### Detalles

- Crea dentro de `Actividad06` una clase `static class Prisoner` con los campos `String name`, `double height` e `int sentence`, **sin inicializarlos**.
- En `main` crea un objeto con `new Prisoner()` e imprime cada campo con el formato de la salida esperada (`"name: " + prisoner.name`, etc.).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
name: null
height: 0.0
sentence: 0
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad06/Actividad06.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad06Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
