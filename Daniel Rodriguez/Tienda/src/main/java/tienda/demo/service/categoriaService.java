
package tienda.demo.service;

import tienda.demo.domain.categoria;
import java.util.List;

public interface categoriaService {
    // Se obtiene un listado de categorias en un List
    public List<categoria> getCategorias(boolean activos);
}
