# JFo 7.3 y 7.4 - Actividad 14

## Sobrecarga por tipo y orden de parámetros

Crea cuatro firmas diferentes de sum.

### Detalles

- Escribe cuatro métodos estáticos `sum` sobrecargados con estas firmas: `(int, int)` que devuelve `int`, y `(double, double)`, `(int, double)` y `(double, int)` que devuelven `double`.
- En `main` muestra `sum(3, 4)`, `sum(3.5, 4.0)`, `sum(3, 4.5)` y `sum(3.5, 4)` con las etiquetas de la salida esperada.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
int,int: 7
double,double: 7.5
int,double: 7.5
double,int: 7.5
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
