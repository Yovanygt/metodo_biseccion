# Método de Bisección - Métodos Numéricos

## Descripción
Este proyecto implementa el **método de bisección**, un algoritmo de métodos numéricos utilizado para encontrar raíces de una función continua \( f(x) \) en un intervalo \([a, b]\). El método se basa en el **Teorema del Valor Intermedio**, que garantiza que si \( f(a) \) y \( f(b) \) tienen signos opuestos, entonces existe al menos una raíz en el intervalo.

## Propósito
El objetivo de este código es:
- Encontrar una raíz aproximada de una ecuación no lineal.
- Demostrar el uso del método de bisección en un programa en Java.
- Proporcionar una herramienta educativa para estudiantes de métodos numéricos.

## Cómo funciona
1. Se define un intervalo \([a, b]\) donde se busca la raíz.
2. Se verifica que \( f(a) \cdot f(b) < 0 \) (es decir, que haya un cambio de signo).
3. Se calcula el punto medio \( c = \frac{a + b}{2} \).
4. Si \( f(c) \) es lo suficientemente pequeño (dentro de una tolerancia), \( c \) es la raíz aproximada.
5. Si no, se ajusta el intervalo:
   - Si \( f(a) \cdot f(c) < 0 \), la raíz está en \([a, c]\).
   - Si \( f(c) \cdot f(b) < 0 \), la raíz está en \([c, b]\).
6. Se repite el proceso hasta que se cumpla la tolerancia o se alcance un número máximo de iteraciones.

## Requisitos
- Java 8 o superior.
- Un entorno de desarrollo como IntelliJ IDEA, Eclipse o similar.

## Uso
1. Clona este repositorio:
   ```
   git clone https://github.com/Yovanygt/metodo_biseccion.git
   ```
2. Compila y ejecuta el archivo `biseccion.java` en tu entorno de desarrollo.
3. Ingresa los valores del intervalo \([a, b]\) y la tolerancia cuando se soliciten.

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles (si aplica).


