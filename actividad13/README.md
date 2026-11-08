# JFo 7.3 y 7.4 - Actividad 13

## Sobrecarga un método sum

Crea versiones para uno, dos y tres números.

### Detalles

- Escribe tres métodos estáticos `sum` sobrecargados que reciban uno, dos y tres enteros y devuelvan su suma.
- En `main` muestra `"Uno: " + sum(5)`, `"Dos: " + sum(4, 5)` y `"Tres: " + sum(3, 4, 5)`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Uno: 5
Dos: 9
Tres: 12
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad13/Actividad13.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad13Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
