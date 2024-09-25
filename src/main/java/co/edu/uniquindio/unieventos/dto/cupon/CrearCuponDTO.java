package co.edu.uniquindio.unieventos.dto.cupon;

import co.edu.uniquindio.unieventos.documentos.EstadoCupon;
import co.edu.uniquindio.unieventos.documentos.TipoCupon;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record CrearCuponDTO(
        String codigo,
        String nombre,
        float descuento,
        LocalDateTime fechaVencimiento,
        TipoCupon tipo,
        EstadoCupon estado
) {
}
