package grupo76_cuartelbomberos;

import grupo76_cuartelbomberos.coneccion.*;
import grupo76_cuartelbomberos.entidades.*;
import grupo76_cuartelbomberos.vistas.ViewMenu;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;

public class Grupo76_CuartelBomberos {

    public static void main(String[] args) {
        // TODO code application logic here

//        Connection con = coneccionData.Conectar();
//        Brigada brig = new Brigada();
//        brig.setCodBrigada(1);
//        
//        int DNI = 40588238;
//        String nom="Perez, Jaime", sangre="(A+)", celular="3816200440";
//        Bomberos bomba = new Bomberos(DNI, nom, sangre, LocalDate.now(), celular, brig, true);
//
//        BomberoData bomD = new BomberoData();
//        bomD.guardarBombero(bomba);
//
//        System.out.println("Bomberos totales:\n");
//        for (Bomberos bombero : bomD.listarBomberosActivos()) {
//            System.out.println(bombero.toString());
//        }
//        System.out.println("bomberos en la brigada 1:\n");
//        for (Bomberos bombero : bomD.listarBomberosXBrigada(1)) {
//            System.out.println(bombero.toString());
//        }
        
//        System.out.println(bomD.buscarBombero(2).toString());

        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
    }

}
