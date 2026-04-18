# Solución de la Actividad - Gestión de Proveedores

### 1. Validación agregada en el servicio
En la clase `ProveedorService`, se implementó una validación de seguridad dentro del método `guardarProveedor`. Esta verifica que el campo `telefono` no sea nulo y que contenga exactamente **10 dígitos**. Si la condición no se cumple, el sistema lanza una excepción de tipo `IllegalArgumentException`.

### 2. Prueba del endpoint de búsqueda personalizada
Para probar la búsqueda personalizada, utilicé el endpoint `GET /api/proveedores/buscar?nombre=...`. 
- **Escenario:** Busqué la palabra "ferre" para encontrar proveedores como "Ferretería Central" o "FERREMAS".
- **Resultado:** El repositorio filtró correctamente ignorando mayúsculas y minúsculas gracias al método `ContainingIgnoreCase`.

### 3. Pruebas realizadas en Postman
* **POST (Creación Exitosa):** - Body: `{"nombre": "Proveedor A", "telefono": "1234567890"}`
    - Resultado: Código 200 OK y objeto guardado en la BD.
* **POST (Error de Validación):** - Body: `{"nombre": "Proveedor B", "telefono": "123"}`
    - Resultado: Error 500 (Internal Server Error) con el mensaje: "El número de teléfono debe tener 10 dígitos".
* **GET (Listar):**
    - Resultado: Array JSON con todos los proveedores registrados.