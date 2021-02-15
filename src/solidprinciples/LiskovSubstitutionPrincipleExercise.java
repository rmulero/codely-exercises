package solidprinciples;

public class LiskovSubstitutionPrincipleExercise {

    interface Bird {
        String tweet();
    }

    // No viola LSP al devolver lo esperado por la firma de la interface
    class Chicken implements Bird {
        @Override
        public String tweet() {
            return "Kikirikiii";
        }
    }

    // Viola LSP al devolver una excepción. Si el pájaro no puede cantar, habría que
    // separar de alguna manera los pájaros que cantan de los que no
    class BirdThatCannotTweet implements Bird {
        @Override
        public String tweet() {
            throw new RuntimeException("This bird cannot tweet!");
        }
    }
}
