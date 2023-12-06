import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class app {

    public static void main(String[] args) throws InterruptedException {
        String replacedString = getString();
        System.out.println(replacedString);

/*        // Cria um pool de threads com 10 threads
        ExecutorService executor = Executors.newFixedThreadPool(10);s

        int startThreadFlux = LocalDateTime.now().getSecond();
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            // Submete uma nova tarefa para execução
            executor.submit(() -> {
                System.out.println("Running task " + finalI + " in thread " + Thread.currentThread().getName());
                // Coloque aqui o código da sua tarefa
            });
        }

        // Desliga o executor depois que todas as tarefas foram submetidas
        // Isso não interrompe as tarefas em execução, apenas impede a submissão de novas tarefas
        executor.shutdown();
        int endThreadFlux = LocalDateTime.now().getSecond();
        System.out.println("Iniciado: " + endThreadFlux + "\n" + "Finalizado: " + endThreadFlux);*/
    }

    private static String getString() throws InterruptedException {
        ReplaceSpecialCharsUtil replaceSpecialCharsUtil = ReplaceSpecialCharsUtil.getInstance();
        String replacedString = replaceSpecialCharsUtil.replaceSpecialChars("@#$%¨&*(?°®?°ŧteste");
        return replacedString;
    }
}
