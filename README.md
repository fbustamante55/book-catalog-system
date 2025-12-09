# Sistema de Catálogo de Libros

Sistema de gestión de catálogo de libros desarrollado en Java que utiliza estructuras de datos personalizadas para organizar libros por categorías.

## 📋 Descripción

Este proyecto implementa un sistema de catálogo de libros que permite:
- Organizar libros en categorías
- Buscar libros por editorial
- Obtener libros de una categoría específica
- Eliminar libros de categorías
- Imprimir información de categorías y sus libros

## 🏗️ Estructura del Proyecto

El proyecto utiliza dos tipos de estructuras de datos personalizadas:

- **ListaSimple**: Lista enlazada simple para almacenar libros dentro de cada categoría
- **ListaDobleCircular**: Lista doblemente enlazada circular para almacenar las categorías del catálogo

## 📦 Clases Principales

### `Libro`
Representa un libro con los siguientes atributos:
- `id`: Identificador único del libro
- `titulo`: Título del libro
- `autor`: Autor del libro
- `editorial`: Editorial del libro

### `Categoria`
Representa una categoría de libros:
- `id`: Identificador único de la categoría
- `nombre`: Nombre de la categoría
- `libros`: Lista simple que contiene los libros de la categoría

### `Catalogo`
Clase principal que gestiona el catálogo completo:
- `categorias`: Lista doblemente circular que contiene todas las categorías
- Métodos principales:
  - `getLibrosEditorial(String editorial)`: Obtiene e imprime todos los libros de una editorial específica
  - `devuelveLibrosCategoria(int categoriaId)`: Devuelve un array con todos los libros de una categoría
  - `eliminaLibroCategoria(int categoriaId, int libroId)`: Elimina un libro de una categoría específica
  - `imprimaCategorias()`: Imprime información de todas las categorías y su cantidad de libros

### `Nodo`
Nodo genérico utilizado en las estructuras de datos:
- `data`: Dato almacenado (puede ser Libro o Categoria)
- `next`: Referencia al siguiente nodo
- `prev`: Referencia al nodo anterior (para listas dobles)

### `ListaSimple`
Implementación de lista enlazada simple:
- `agregarLibro(Libro libro)`: Agrega un libro al final de la lista
- `obtenerLibros()`: Devuelve un array con todos los libros
- `eliminarLibro(int id)`: Elimina un libro por su ID

### `ListaDobleCircular`
Implementación de lista doblemente enlazada circular:
- `agregarCategoria(Categoria categoria)`: Agrega una categoría al final de la lista
- `obtenerCategorias()`: Devuelve un array con todas las categorías

## 🚀 Requisitos

- Java 23 o superior
- Maven 3.x

## 📥 Instalación

1. Clona el repositorio:
```bash
git clone <url-del-repositorio>
cd CE2
```

2. Compila el proyecto usando Maven:
```bash
cd 119580779
mvn clean compile
```

## ▶️ Ejecución

Para ejecutar la aplicación:

```bash
mvn exec:java
```

O compilar y ejecutar el JAR:

```bash
mvn clean package
java -cp target/119580779-1.0-SNAPSHOT.jar com.mycompany.App
```

## 📝 Ejemplo de Uso

La aplicación viene con datos de ejemplo precargados:

- **Categoría Acción**: "La Revolución", "La Odisea"
- **Categoría Romance**: "La esposa del viajero en el tiempo", "Orgullo y prejuicio"
- **Categoría Novela**: "Cien años de soledad"
- **Categoría Ciencia**: "El origen de las especies", "El futuro de la mente"
- **Categoría Misterio**: "Perdida", "La Odisea", "Manos de luz"

El programa ejecuta automáticamente:
1. Búsqueda de libros por editorial "Comares"
2. Obtención de libros de la categoría "Acción"
3. Impresión de todas las categorías
4. Eliminación de un libro de la categoría "Acción"

## 👤 Autor

**Fabia**

## 📄 Licencia

Este proyecto está bajo la licencia por defecto de NetBeans.

