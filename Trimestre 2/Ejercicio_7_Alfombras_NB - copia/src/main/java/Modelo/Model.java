package Modelo;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public final class Model {
    private final ArrayList<Alfombra> alfombras;
    private final DefaultTableModel tableModel;
    
    // Constructor: Inicializa la lista de alfombras con algunos datos de ejemplo
    public Model() {
        alfombras = new ArrayList<>();
        tableModel = new DefaultTableModel(new Object[]{"Modelo", "Color", "Ancho", "Alto"}, 0);
        inicializarAlfombras();
    }
    
    // Método para inicializar las alfombras al arrancar la app
    public void inicializarAlfombras() {
        // Generar 15 alfombras con datos predeterminados
        for (int i = 1; i <= 15; i++) {
            String modelo = "Alfombra " + i;
            String color = (i % 2 == 0) ? "Rojo" : "Azul";  // Alternamos entre rojo y azul
            double ancho = 10.0 + i;
            double alto = 10.0 + (i * 2);

            // Añadir alfombra a la lista
            alfombras.add(new Alfombra(modelo, color, ancho, alto));
        }
    }
    
     // Obtener el modelo de la tabla
    public DefaultTableModel getTableModel() {
        // Limpiar la tabla antes de agregar los datos
        tableModel.setRowCount(0);
        
        // Agregar las alfombras a la tabla
        for (Alfombra alfombra : alfombras) {
            Object[] fila = {alfombra.getModelo(), alfombra.getColor(), alfombra.getAncho(), alfombra.getAlto()};
            tableModel.addRow(fila);
        }
        
        return tableModel;
    }

    public ArrayList<Alfombra> getAlfombras() {
        return alfombras;
    }

    // Método para agregar una alfombra. Recibe datos como parámetros.
    public DefaultTableModel agregarAlfombra(String modelo, String color, String ancho, String alto) {
        try {
            // Verificar que los campos no estén vacíos
            if (!modelo.isEmpty() && !color.isEmpty() && !ancho.isEmpty() && !alto.isEmpty()) {
                // Intentar convertir ancho y alto a double. Si no es posible, lanzará una excepción.
                double dAncho = Double.parseDouble(ancho);
                double dAlto = Double.parseDouble(alto);
                
                // Crear y agregar la nueva alfombra a la lista
                Alfombra alfombra = new Alfombra(modelo, color, dAncho, dAlto);
                alfombras.add(alfombra);
            } else {
                throw new IllegalArgumentException("Todos los campos deben tener valores válidos.");
            }
        } catch (NumberFormatException e) {
            // Si ocurre un error con los valores numéricos
            throw new IllegalArgumentException("El ancho y alto deben ser valores numéricos.");
        } catch (IllegalArgumentException e) {
            // Manejo de excepciones de campos vacíos o inválidos
            throw new IllegalArgumentException(e.getMessage());
        }

        // Retornar el modelo de la tabla actualizado
        return crearModeloTabla();
    }

    // Crear el modelo de tabla con los datos actuales de las alfombras
    public DefaultTableModel crearModeloTabla() {
        // Definir las columnas de la tabla
        String[] columnNames = {"Modelo", "Color", "Ancho (cm)", "Alto (cm)"};
        
        // Crear un array de objetos que contenga los datos de las alfombras
        Object[][] data = new Object[alfombras.size()][4];
        for (int i = 0; i < alfombras.size(); i++) {
            Alfombra a = alfombras.get(i);
            data[i][0] = a.getModelo();
            data[i][1] = a.getCor();
            data[i][2] = a.getAncho();
            data[i][3] = a.getAlto();
        }

        // Crear el DefaultTableModel
        return new DefaultTableModel(data, columnNames);
    }

    // Eliminar una alfombra por índice
    public DefaultTableModel eliminarAlfombraPorIndice(int indice) {
        if (indice >= 0 && indice < alfombras.size()) {
            alfombras.remove(indice);
        }
        // Retornar el modelo de la tabla actualizado después de eliminar
        return crearModeloTabla();
    }

    // Eliminar todas las alfombras
    public DefaultTableModel eliminarTodasAlfombras() {
        alfombras.clear();
        // Retornar el modelo de la tabla actualizado después de eliminar todas
        return crearModeloTabla();
    }

    // Obtener información de una alfombra en formato de array (usado para mostrar detalles)
    public String[] obtenerInformacionAlfombra(int indice) {
        if (indice >= 0 && indice < alfombras.size()) {
            Alfombra a = alfombras.get(indice);
            return new String[]{
                a.getModelo(),
                a.getCor(),
                String.valueOf(a.getAncho()),
                String.valueOf(a.getAlto())
            };
        }
        return new String[]{};
    }
}
