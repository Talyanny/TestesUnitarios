import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TestaCandlestickFactoryComUmNegocioApena {
 
   public static void main(String[] args) {
     Calendar hoje = Calendar.getInstance();

     List<Negocio> negocios = Arrays.asList();
 
     CandlestickFactory fabrica = new CandlestickFactory();
     Candlestick candle = fabrica.constroiCandleParaData(
                         hoje, negocios);
 
     System.out.println(candle.getAbertura());
     System.out.println(candle.getFechamento());
     System.out.println(candle.getMinimo());
     System.out.println(candle.getMaximo());
     System.out.println(candle.getVolume());
   }
 }