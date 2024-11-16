Prueba técnica Muruna

Consideraciones:
    - Consta de ingresar a la web "https://www.mercadolibre.cl/" en el buscador ingreses un producto (zapatillas, poleras, ect.. lo dejo a tu criterio) y lo busques, luego al cargar el listado de resultados, selecciones el tercer producto y al cargar la descripcion del producto, tomes esa descripción y la muestra por consola.
    - Utilizar Selenium y Java.
    - Aplicar patrones de diseño.

Solución: 

Se puede ejecutar el test con el sigueinte comando con uno de los siguientes browser (chrome, firefox y edge):
    mvn clean test -Dbrowser=firefox

Crear automatización de la siguiente prueba:
    1.- Ingresar a la web "https://www.mercadolibre.cl/" 
    2.- En el buscador ingresar un producto (zapatillas, poleras, ect..) y buscar 
    3.- Luego al cargar el listado de resultados, seleccionar el tercer producto 
    4.- Al cargar la descripcion del producto tomarlo e imprimirlo en consola

Versiones utilizadas:
    - Java: 22
    - Selenium: 4.26.0
    - TestNg: 7.10.2

Patrones de diseño utilizados:
    - Singleton
    - SRP
    - Page Factory
    - Driver Factory
    - Data Driven Test
