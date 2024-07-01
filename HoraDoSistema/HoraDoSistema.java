package HoraDoSistema;

import java.util.Date;
import java.text.SimpleDateFormat;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("A hora do sistema é:");
        System.out.println(sdf.format(relogio));
    }
}