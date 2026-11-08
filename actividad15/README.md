# JFo 7.3 y 7.4 - Actividad 15

## Diseña un sistema de visualización sobrecargado

Sobrecarga display para mostrar también think().

### Detalles

- Crea una clase `static class Prisoner` con `name`, `height` y `sentence`, un constructor con los tres datos y un método `think()` que muestre `<nombre> está pensando`.
- Escribe dos métodos `display`: `display()` muestra `nombre: altura, condena` y `display(boolean think)` hace lo mismo y, si `think` es `true`, llama además a `think()`.
- Con el preso Bubba (1.75, 4) llama primero a `display()` y después a `display(true)`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Bubba: 1.75, 4
Bubba: 1.75, 4
Bubba está pensando
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_3_7_4_actividad15/Actividad15.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
