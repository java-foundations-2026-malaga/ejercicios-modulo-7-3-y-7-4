# JFo 7.3 y 7.4 - Actividad 05

## Corrige una sobrecarga inválida

Diferencia las firmas por sus tipos.

### Detalles

- Deja en `Calculator` dos métodos `sum`: uno con parámetros `int, int` que devuelva `int` y otro con parámetros `double, double` que devuelva `double`.
- En `main` muestra `"Enteros: " + calculator.sum(3, 4)` y `"Decimales: " + calculator.sum(3.5, 4.0)`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Enteros: 7
Decimales: 7.5
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad05/Actividad05.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad05Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
