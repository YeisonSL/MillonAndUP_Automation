package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarPor implements Task {

    private int seconds;

    public EsperarPor(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(this.seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static EsperarPor segundos(int seconds) {
        return instrumented(EsperarPor.class, seconds);

    }
}
