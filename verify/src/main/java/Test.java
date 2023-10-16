import io.apicurio.registry.rest.client.models.ArtifactContent;
import io.apicurio.registry.rest.client.models.ArtifactReference;

public class Test {

    static ArtifactReference ref = new ArtifactReference();

    public static void main(String[] args) {
        var ref2 = new io.apicurio.registry.rest.v2.beans.ArtifactReference();

        ArtifactContent content = new ArtifactContent();
        content.setContent("hello!");

        io.apicurio.registry.rest.v2.beans.ArtifactContent content2 = new ArtifactContent();
//        example(content2);
//        example(ref2);
        example(ref);
    }

    private static void example(ArtifactReference ref) {
        return;
    }

    private static void example(ArtifactContent cont) {
        return;
    }

}
