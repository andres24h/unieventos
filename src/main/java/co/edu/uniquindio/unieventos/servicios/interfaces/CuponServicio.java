package co.edu.uniquindio.unieventos.servicios.interfaces;

import co.edu.uniquindio.unieventos.dto.cupon.*;

import java.util.List;


public interface CuponServicio {
    String crearCupones(CrearCuponDTO cuponDTO)throws Exception;
    String actualizarCupon(ActualizarCuponDTO cuponDTO)throws Exception;
    void borrarCupon(String idCupon);
    boolean redimirCupon(RedimirCuponDTO redimirCuponDTO)throws Exception;
    boolean revertirRedencionCupon(RevertirCuponDTO revertirCuponDTO)throws Exception;
    List<ItemCuponDTO> listarCupones();
    List<ItemCuponDTO> listarCuponesCliente(ListarCupoDTO listarCupoDTO);


}
