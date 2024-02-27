package mx.com.gm.peliculas.servicio;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPElicula(String buscar);
    
    void iniciarCatalogoPeliculas();
    
    
}
