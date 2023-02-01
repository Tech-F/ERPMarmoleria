# Inicio del programa

Primero necesitamos poder crear un usuario, que será un super usuario,
ese usuario tendrá nombre de usuario y contraseña.
Al crear este usuario se creará la base de datos donde se guardará todo
lo relacionado con este super usuario, como puede ser toda la base de
presupuestos, facturas, clientes, proveedores, etc.

## Apartado proveedores
Para los proveedores necesitaremos varios datos existenciales:
1. Nombre completo
2. Número de identificación fiscal
3. Direccion
4. Codigo postal
5. Telefono1
6. Nota de la persona de telefono 1
7. Telefono2
8. Nota de la persona de telefono 2
9. Telefono3
10. Nota de la persona de telefono 3
11. Correo electronico 1
12. Nota de correo electronico 1
13. Correo electronico 2
14. Nota de correo electronico 2 //las notas valen para saber, por ejemplo, el nombre
15. Correo electronico 3
16. Nota de correo electronico 3 
17. Notas general del proveedor //como puede ser "Los mejores Discos"
18. Fechas de vencimiento (con un hueco para poner los días separando por comas)
19. Formas de pago
20. Tiempo de entrega promedio
21. Garantias y politicas de devolución
22. (Meter en un futuo, archivos proporcionados por ellos, como pueden
ser fichas tecnicas)

## Apartado cliente
Para los clientes necesitaremos varios datos existenciales:
1. Nombre completo
2. Número de identificación fiscal
3. Direccion
4. Codigo postal
5. Telefono1
6. Nota de la persona de telefono 1
7. Telefono2
8. Nota de la persona de telefono 2
9. Telefono3
10. Nota de la persona de telefono 3
11. Correo electronico 1
12. Nota de correo electronico 1
13. Correo electronico 2
14. Nota de correo electronico 2 //las notas valen para saber, por ejemplo, el nombre
15. Correo electronico 3
16. Nota de correo electronico 3
17. Notas general del cliente //como puede ser "Es muy pesado, no cortarse"
18. Fechas de vencimiento acordadas (con un hueco para poner los días separando por comas)
19. Formas de pago
20. Tipos habituales de proyectos, separados por comas.
21. (añadir una carpeta de archivos para cada cliente, para poder tener
fotos de trabajos conjuntos, por ejemplo)
22. Si es empresa o si es particular

## Apartado presupuestos

1. Numero de prespuesto(autoincrementado)
2. Fecha presupuesto(auto generada pero modificable)
3. Estado del presupuesto
4. Empresa/cliente (si es empresa se modificará el menú.)(Lo veremos
mas adelante)
5. Iva
6. Obra (si se selecciona tambien se abriran apartados,
como puede ser, IVA para ese tipo de obra, recargo por materiales,
portes, colocacion, idioma)
7. Forma de cobro y días, serparados por comas
8. Comercial que lo está vendiendo
9. Notas
10. Numero de medidas
11. Referenciar otro presupuesto (todos los presupuestos referenciados
cambian su numero de presupuesto al mismo+otros numeros para
general el distintivo entre ellos)
12. Lineas para meter las referencias

