public class BibliotecaRepositorio implements Agregado {
    private Libro[] libros;
    private int indice = 0;
    public BibliotecaRepositorio(int capacidad) {
        libros = new Libro[capacidad];
    }
    public void addLibro(Libro libro) {
        if (indice < libros.length) {
            libros[indice] = libro;
            indice++;
        } else {
            System.out.println("El repositorio está lleno.");
        }
    }
    @Override
    public Iterador createIterator() {
        return new ArrayLibroIterator(libros);
    }
    public void buscarLibro(String palabraClave) {
        Iterador iterador = createIterator();
        boolean encontrado = false;
        String busquedaLimpia = palabraClave.toLowerCase().trim();
        System.out.println("\n--- Iniciando búsqueda para: '" + palabraClave + "' ---");
        while (iterador.hasNext()) {
            Libro libroActual = (Libro) iterador.next();
            if (libroActual.getTitulo().toLowerCase().contains(busquedaLimpia) ||
                    libroActual.getAutor().toLowerCase().contains(busquedaLimpia) ||
                    libroActual.getGenero().toLowerCase().contains(busquedaLimpia)) {
                System.out.println("-> ¡Coincidencia encontrada! " + libroActual.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("-> No se encontraron libros con ese criterio.");
        }
    }
}